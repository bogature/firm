
var app2 = angular.module("mytype", []);

app2.controller("types", function ($scope, $http) {

    $scope.types = [];
    $http.get('/api/type').then(function (response) {
        $scope.types = response.data;
    });

    this.insertType = function add() {
        var name = document.getElementById("TypeName").value;

        var req = {
            method: 'POST',
            url: '/api/type/insert',
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

    this.delType = function del(id) {
        $http.get('/api/type/del?id=' + id).then(function () {
            window.location.reload();
        });
    };

    this.startUpdateType = function startUpdate(id,name) {
        document.getElementById("TypeIdUPD").innerText = id;
        document.getElementById("TypeNameUPD").value = name;
    };

    this.updateType = function update() {
        var id = document.getElementById("TypeIdUPD").innerText;
        var name = document.getElementById("TypeNameUPD").value;
        var req = {
            method: 'POST',
            url: '/api/type/update?id=' + id,
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
