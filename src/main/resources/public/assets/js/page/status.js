
var app3 = angular.module("mystatus", []);

app3.controller("status", function ($scope, $http) {

    $scope.status = [];
    $http.get('/api/status').then(function (response) {
        $scope.status = response.data;
    });


    this.insertStatus = function add() {
        var name = document.getElementById("StatusName").value;
        var regex =/^[А-ЯІ]([а-яА-ЯіІ]|[- ])*$/;

        if(regex.test(name)) {

            var req = {
                method: 'POST',
                url: '/api/status/insert',
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
        else document.getElementById("Regex").innerText = "Поле 'Назва' заповнене не коректно. (Перша буква велика, Мова Українська, Допустимий символи '-' )";

    };



    this.delStatus  = function del(id) {
        $http.get('/api/status/del?id=' + id).then(function () {
            window.location.reload();
        });
    };

    this.startUpdateStatus = function startUpdate(id,name) {
        document.getElementById("StatusIdUPD").innerText = id;
        document.getElementById("StatusNameUPD").value = name;
    };

    this.updateStatus = function update() {
        var id = document.getElementById("StatusIdUPD").innerText;
        var name = document.getElementById("StatusNameUPD").value;
        var regex =/^[А-ЯІ]([а-яА-ЯіІ]|[- ])*$/;

        if(regex.test(name)) {
            var req = {
                method: 'POST',
                url: '/api/status/update?id=' + id,
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
        else document.getElementById("RegexUPD").innerText = "Поле 'Назва' заповнене не коректно. (Перша буква велика, Мова Українська, Допустимий символи '-' )";

    };


});

