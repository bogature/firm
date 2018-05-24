var app10 = angular.module("mycategory", []);

app10.controller("categorys", function ($scope, $http) {

    $scope.categorys = [];
    $http.get('/api/category').then(function (response) {
        $scope.categorys = response.data;
    });

    this.insertCategory = function add() {
        var name = document.getElementById("CategoryName").value;
        var regex =/^[А-Я][а-я]+$/;

        if(regex.test(name)) {
            var req = {
                method: 'POST',
                url: '/api/category/insert',
                data: {
                    name: name
                }
            };
        }
        else document.getElementById("Regex").innerText = "Поле 'Назва' заповнене не коректно.";

        console.log(req);
        $http(req).then(function (resp) {
            console.log(resp);
            window.location.reload();
        })
    };



    this.delCategory = function del(id) {
        $http.get('/api/category/del?id=' + id).then(function () {
            window.location.reload();
        });
    };

    this.startUpdateCategory = function startUpdate(id,name) {
        document.getElementById("CategoryIdUPD").innerText = id;
        document.getElementById("CategoryNameUPD").value = name;
    };

    this.updateCategory = function update() {
        var id = document.getElementById("CategoryIdUPD").innerText;
        var name = document.getElementById("CategoryNameUPD").value;
        var req = {
            method: 'POST',
            url: '/api/category/update?id=' + id,
            data: {
                name: name
            }
        };
        console.log(req);
        $http(req).then(function (resp) {
            console.log(resp);
            window.location.reload();
        })
    };

});
