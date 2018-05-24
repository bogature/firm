
var app5 = angular.module("mycustomer", []);

app5.controller("customers", function ($scope, $http) {

    $scope.customers = [];
    $http.get('/api/customer').then(function (response) {
        $scope.customers = response.data;
    });

    this.insertCustomers = function add() {
        var name = document.getElementById("CustomersName").value;
        var regex =/^[А-ЯІ]([а-яА-ЯіІ]|[-'` ])*$/;

        if(regex.test(name)) {
            var req = {
                method: 'POST',
                url: '/api/customer/insert',
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
        else document.getElementById("Regex").innerText = "Поле 'ПІБ' заповнене не коректно. (Перша буква велика, Мова Українська)";

    };

    this.delCustomers = function del(id) {
        $http.get('/api/customer/del?id=' + id).then(function () {
            window.location.reload();
        });
    };

    this.startUpdateCustomers = function startUpdate(id,name) {
        document.getElementById("CustomersIdUPD").innerText = id;
        document.getElementById("CustomersNameUPD").value = name;
    };

    this.updateCustomers = function update() {
        var id = document.getElementById("CustomersIdUPD").innerText;
        var name = document.getElementById("CustomersNameUPD").value;
        var regex =/^[А-ЯІ]([а-яА-ЯіІ]|[-'` ])*$/;

        if(regex.test(name)) {
        var req = {
            method: 'POST',
            url: '/api/customer/update?id=' + id,
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
        else document.getElementById("RegexUPD").innerText = "Поле 'ПІБ' заповнене не коректно. (Перша буква велика, Мова Українська)";

    };


});

