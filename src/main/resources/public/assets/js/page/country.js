
var app = angular.module("demo", []);

app.controller("mycontroller", function ($scope, $http) {

    $scope.contries = [];
    $http.get('/api/country').then(function (response) {
        $scope.contries = response.data;
    });


    this.insertCountry = function add() {
        var name = document.getElementById("CountryName").value;

        var req = {
            method: 'POST',
            url: '/api/country/insert',
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

    this.delCountry = function del(id) {
        $http.get('/api/country/del?id=' + id).then(function () {
            window.location.reload();
        });
    };

    this.startUpdateCountry = function startUpdate(id,name) {
        document.getElementById("CountryIdUPD").innerText = id;
        document.getElementById("CountryNameUPD").value = name;
    };

    this.updateCountry = function update() {
        var id = document.getElementById("CountryIdUPD").innerText;
        var name = document.getElementById("CountryNameUPD").value;
        var req = {
            method: 'POST',
            url: '/api/country/update?id=' + id,
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

