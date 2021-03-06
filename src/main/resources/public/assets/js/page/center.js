
var app6 = angular.module("mycenter", []);

app6.controller("centers", function ($scope, $http) {

    $scope.centers = [];
    $http.get('/api/center').then(function (response) {
        $scope.centers = response.data;
    });

    this.insertCenter = function add() {
        var name = document.getElementById("CenterName").value;
        var regex =/^[А-ЯІ]([а-яА-ЯіІ0-9]|[№ ])*$/;
        if(regex.test(name)) {

            var req = {
                method: 'POST',
                url: '/api/center/insert',
                data: {
                    name: name
                }
            };

            console.log(req);
            $http(req).then(function (resp) {
                console.log(resp);
                window.location.reload();
            })
        }
        else document.getElementById("RegexUPD").innerText = "Поле 'Назва' заповнене не коректно. (Перша буква велика, Мова Українська, Допустимий символи '№' )";

    };

    this.delCenter = function del(id) {
        $http.get('/api/center/del?id=' + id).then(function () {
            window.location.reload();
        });
    };

    this.startUpdateCustomers = function startUpdate(id,name) {
        document.getElementById("CenterIdUPD").innerText = id;
        document.getElementById("CenterNameUPD").value = name;
    };

    this.updateCustomers = function update() {
        var id = document.getElementById("CenterIdUPD").innerText;
        var name = document.getElementById("CenterNameUPD").value;
        var regex =/^[А-ЯІ]([а-яА-ЯіІ0-9]|[№ ])*$/;
        if(regex.test(name)) {
            var req = {
                method: 'POST',
                url: '/api/center/update?id=' + id,
                data: {
                    name: name
                }
            };
            console.log(req);
            $http(req).then(function (resp) {
                console.log(resp);
                window.location.reload();
            })
        }
        else document.getElementById("RegexUPD").innerText = "Поле 'Назва' заповнене не коректно. (Перша буква велика, Мова Українська, Допустимий символи '№' )";

    };

});



