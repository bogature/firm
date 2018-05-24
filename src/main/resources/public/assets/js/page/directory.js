
var app8 = angular.module("mydirectory", []);

app8.controller("directorys", function ($scope, $http) {

    $scope.directorys = [];
    $http.get('/api/directory').then(function (response) {
        $scope.directorys = response.data;
    });

    this.delDirectory = function del(id) {
        $http.get('/api/directory/del?id=' + id).then(function () {
            window.location.reload();
        });
    };

    this.startInsertDirectory = function startUpdate() {
        $http.get('/api/product').then(function (response) {
            var product = response.data;
            var selector = document.getElementById("Product");
            $(selector).empty();
            for (var i = 0; i < product.length; i++) {
                var option = document.createElement("option");
                option.text = product[i].name;
                option.value = product[i].id;
                selector.add(option);
            }
        });
    };


    this.insertDirectory = function add() {

        var indexDirectory = document.getElementById("Product").selectedIndex;
        var directoryId = document.getElementById("Product").options[indexDirectory].value;

        $http.get('/api/product/get?id=' + directoryId).then(function (response) {
            var selectedProduct = response.data;

            var req = {
                method: 'POST',
                url: '/api/directory/insert',
                data: {
                    product: selectedProduct
                }
            };

            $http(req).then(function (resp) {
                window.location.reload();
            })
        });
    };

    this.startUpdateDirectory = function startUpdate(id) {
        $http.get('/api/product').then(function (response) {
            var product = response.data;
            var selector = document.getElementById("DirectoryProductUPD");
            $(selector).empty();
            for (var i = 0; i < product.length; i++) {
                var option = document.createElement("option");
                if (product[i].id == product.id){
                    option.selected = 'selected';
                }
                option.text = product[i].name;
                option.value = product[i].id;
                selector.add(option);
            }
        });

        document.getElementById("ProductIdUPD").innerText = id;
    };

    this.updateDirectory = function update() {
        var id = document.getElementById("ProductIdUPD").innerText;

        var indexDirectory = document.getElementById("DirectoryProductUPD").selectedIndex;
        var directoryId = document.getElementById("DirectoryProductUPD").options[indexDirectory].value;

        $http.get('/api/product/get?id=' + directoryId).then(function (response) {
            var selectedProduct = response.data;

            var req = {
                method: 'POST',
                url: 'api/directory/update?id='+id,
                data: {
                    product: selectedProduct
                }
            };

            $http(req).then(function (resp) {
                window.location.reload();
            })
        });
    };


});


