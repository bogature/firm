

var app4 = angular.module("myproviders", []);

app4.controller("providers", function ($scope, $http) {

    $scope.providers = [];
    $http.get('/api/provider').then(function (response) {
        $scope.providers = response.data;
    });

    this.startInsertProvider = function startUpdate() {
        $http.get('/api/category').then(function (response) {
            var category = response.data;
            var selector = document.getElementById("ProviderCategory");
            $(selector).empty();
            for (var i = 0; i < category.length; i++) {
                var option = document.createElement("option");
                option.text = category[i].name;
                option.value = category[i].id;
                selector.add(option);
            }
        });
    };



    this.insertProvider = function add() {
        var name = document.getElementById("ProviderName").value;

        var indexCategory = document.getElementById("ProviderCategory").selectedIndex;
        var categorys_id = document.getElementById("ProviderCategory").options[indexCategory].value;

        var req = {
            method: 'POST',
            url: '/api/provider/insert',
            data: {
                name: name,
                categorys_id: categorys_id
            }
        };

        $http(req).then(function (resp) {
            window.location.reload();
        })

    };

    this.startUpdateStreet = function startUpdate(id, name) {
        $http.get('/api/category').then(function (response) {
            var category = response.data;
            var selector = document.getElementById("ProviderCategoryUPD");
            $(selector).empty();
            for (var i = 0; i < category.length; i++) {
                var option = document.createElement("option");
                if (category[i].id == category){
                    option.selected = 'selected';
                }
                option.text = category[i].name;
                option.value = category[i].id;
                selector.add(option);
            }
        });

        document.getElementById("ProviderIdUPD").innerText = id;
        document.getElementById("ProviderNameUPD").value = name;

    };

    this.updateProvider = function add() {
        var id = document.getElementById("ProviderIdUPD").innerText;
        var name = document.getElementById("ProviderNameUPD").value;

        var indexCategory = document.getElementById("ProviderCategoryUPD").selectedIndex;
        var categorys_id = document.getElementById("ProviderCategoryUPD").options[indexCategory].value;

        var req = {
            method: 'POST',
            url: '/api/provider/update?id='+id,
            data: {
                name: name,
                categorys_id: categorys_id
            }
        };

        $http(req).then(function (resp) {
            window.location.reload();
        })

    };




    this.delProvider = function del(id) {
        $http.get('/api/provider/del?id=' + id).then(function () {
            window.location.reload();
        });
    };

});

