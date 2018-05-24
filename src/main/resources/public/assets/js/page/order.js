
var app9 = angular.module("myorder", []);

app9.controller("orders", function ($scope, $http) {

    $scope.orders = [];
    $http.get('/api/order').then(function (response) {
        $scope.orders = response.data;
    });

    this.delOrder = function del(id) {
        $http.get('/api/order/del?id=' + id).then(function () {
            window.location.reload();
        });
    };

    this.startInsertOrder = function startUpdate() {
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
        $http.get('/api/customer').then(function (response) {
            var provider = response.data;
            var selector = document.getElementById("Provider");
            $(selector).empty();
            for (var i = 0; i < provider.length; i++) {
                var option = document.createElement("option");
                option.text = provider[i].name;
                option.value = provider[i].id;
                selector.add(option);
            }
        });
    };

    this.insertOrder = function add() {
        var time = document.getElementById("time").value;
        var amount = document.getElementById("Amount").value;

        var indexProduct = document.getElementById("Product").selectedIndex;
        var productId = document.getElementById("Product").options[indexProduct].value;

        var indexProvider = document.getElementById("Provider").selectedIndex;
        var providerId = document.getElementById("Provider").options[indexProvider].value;

        $http.get('/api/product/get?id=' + productId).then(function (response) {
            var selectedProduct = response.data;


            $http.get('/api/customer/get?id='+providerId).then(function (response) {
                var selectedProvider = response.data;

                var req = {
                    method: 'POST',
                    url: '/api/order/insert',
                    data: {

                        time: time,
                        amount: amount,

                        product: selectedProduct,
                        customer :selectedProvider

                    }
                };
                console.log(req);
                $http(req).then(function (resp) {
                    window.location.reload();
                })
            });
        });
    };


    this.startUpdateOrder = function startUpdate(id) {
        $http.get('/api/product').then(function (response) {
            var product = response.data;
            var selector = document.getElementById("ProductUPD");
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

        $http.get('/api/customer').then(function (response) {
            var provider = response.data;
            var selector = document.getElementById("ProviderUPD");
            $(selector).empty();
            for (var i = 0; i < provider.length; i++) {
                var option = document.createElement("option");
                if (provider[i].id == provider.id){
                    option.selected = 'selected';
                }
                option.text = provider[i].name;
                option.value = provider[i].id;
                selector.add(option);
            }
        });

        document.getElementById("OrderIdUPD").innerText = id;
    };

    this.updateOrder = function update() {
        var id = document.getElementById("OrderIdUPD").innerText;
        var amount = document.getElementById("AmountUPD").value;

        var time = document.getElementById("timeUPD").value;


        var indexProduct = document.getElementById("ProductUPD").selectedIndex;
        var productId = document.getElementById("ProductUPD").options[indexProduct].value;

        var indexProvider = document.getElementById("ProviderUPD").selectedIndex;
        var providerId = document.getElementById("ProviderUPD").options[indexProvider].value;

        $http.get('/api/product/get?id='+productId).then(function (response) {
            var selectedProduct = response.data;


            $http.get('/api/customer/get?id='+providerId).then(function (response) {
                var selectedProvider = response.data;

                var req = {
                    method: 'POST',
                    url: '/api/order/update?id='+id,
                    data: {

                        time: time,
                        amount: amount,

                        product: selectedProduct,
                        customer :selectedProvider

                    }
                };
                console.log(req);
                $http(req).then(function (resp) {
                    window.location.reload();
                })
            });
        });
    };



});
