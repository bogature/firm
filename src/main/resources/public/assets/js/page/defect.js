
var app7 = angular.module("mydefect", []);

app7.controller("defects", function ($scope, $http) {

    $scope.defects = [];
    $http.get('/api/defect').then(function (response) {
        $scope.defects = response.data;
    });

    this.delDefect = function del(id) {
        $http.get('/api/defect/del?id=' + id).then(function () {
            window.location.reload();
        });
    };

    this.startInsertDefect = function startUpdate() {
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

    this.insertDefect = function add() {
        var time = document.getElementById("time").value;

        var indexProduct = document.getElementById("Product").selectedIndex;
        var productId = document.getElementById("Product").options[indexProduct].value;

        $http.get('/api/product/get?id='+productId).then(function (response) {
            var selectedProduct = response.data;
            var req = {
                method: 'POST',
                url: '/api/defect/insert',
                data: {
                    time: time,
                    product: selectedProduct
                }
            };
            console.log(req);
            $http(req).then(function (resp) {
                window.location.reload();
            })
        });
    };

    this.startUpdateDefect = function startUpdate(id) {
        $http.get('/api/product').then(function (response) {
            var product = response.data;
            var selector = document.getElementById("DefectProductUPD");
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

        document.getElementById("DefectIdUPD").innerText = id;
    };

    this.updateDefect = function update() {
        var id = document.getElementById("DefectIdUPD").innerText;

        var time = document.getElementById("timeUPD").value;


        var indexProduct = document.getElementById("DefectProductUPD").selectedIndex;
        var productId = document.getElementById("DefectProductUPD").options[indexProduct].value;

        $http.get('/api/product/get?id=' + productId).then(function (response) {
            var selectedProduct = response.data;

            var req = {
                method: 'POST',
                url: 'api/defect/update?id='+id,
                data: {
                    time: time,
                    product: selectedProduct
                }
            };

            $http(req).then(function (resp) {
                window.location.reload();
            })
        });
    };

});

