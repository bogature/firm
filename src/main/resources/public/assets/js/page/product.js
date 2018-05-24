

var app1 = angular.module("demo1", []);

app1.controller("product", function ($scope, $http) {

    $scope.products = [];
    var accessTime = performance.now();
    $http.get('/api/product').then(function (response) {
        $scope.products = response.data;

        // accessTime=performance.now()-accessTime;
        // accessTime = Math.round(accessTime*100)/100;
        // window.alert('Час доступу до бази даних: '+accessTime+'мс');
    });

    this.delProduct = function del(id) {

        var accessTime = performance.now();

        $http.get('/api/product/del?id=' + id).then(function () {
            window.location.reload();
        });

        // accessTime=performance.now()-accessTime;
        // accessTime = Math.round(accessTime*100)/100;
        // window.alert('Час доступу до бази даних: '+accessTime+'мс');
    };

    this.startInsertProduct = function startUpdate() {

        $http.get('/api/provider').then(function (response) {
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

        $http.get('/api/type').then(function (response) {
            var type = response.data;
            var selector = document.getElementById("Type");
            $(selector).empty();
            for (var i = 0; i < type.length; i++) {
                var option = document.createElement("option");
                option.text = type[i].name;
                option.value = type[i].id;
                selector.add(option);
            }
        });


        $http.get('/api/status').then(function (response) {
            var status = response.data;
            var selector = document.getElementById("Status");
            $(selector).empty();
            for (var i = 0; i < status.length; i++) {
                var option = document.createElement("option");
                option.text = status[i].name;
                option.value = status[i].id;
                selector.add(option);
            }
        });

        $http.get('/api/center').then(function (response) {
            var center = response.data;
            var selector = document.getElementById("Сenter");
            $(selector).empty();
            for (var i = 0; i < center.length; i++) {
                var option = document.createElement("option");
                option.text = center[i].name;
                option.value = center[i].id;
                selector.add(option);
            }
        });

        $http.get('/api/country').then(function (response) {
            var country = response.data;
            var selector = document.getElementById("Country");
            $(selector).empty();
            for (var i = 0; i < country.length; i++) {
                var option = document.createElement("option");
                option.text = country[i].name;
                option.value = country[i].id;
                selector.add(option);
            }
        });

    };

    this.insertProduct = function add() {

        var name = document.getElementById("Name").value;
        console.log(name);
        var price = document.getElementById("Price").value;
        var time = document.getElementById("time").value;

        var indexProvider = document.getElementById("Provider").selectedIndex;
        var providerId = document.getElementById("Provider").options[indexProvider].value;

        var indexCountry = document.getElementById("Country").selectedIndex;
        var countryId = document.getElementById("Country").options[indexCountry].value;

        var indexCenter = document.getElementById("Сenter").selectedIndex;
        var centerId = document.getElementById("Сenter").options[indexCenter].value;

        var indexType = document.getElementById("Type").selectedIndex;
        var typeId = document.getElementById("Type").options[indexType].value;

        var indexStatus = document.getElementById("Status").selectedIndex;
        var statusId = document.getElementById("Status").options[indexStatus].value;

        var accessTime = performance.now();

        var regex =/^[А-ЯІ]([а-яА-ЯіІ0-9]|[№ ])*$/;
        if(regex.test(name)) {
            var regex2 =/^[0-9]*[.][0-9]+$/;
            if(regex2.test(price)) {


                $http.get('/api/provider/get?id=' + providerId).then(function (response) {
                    var selectedProvider = response.data;

                    $http.get('/api/country/get?id=' + countryId).then(function (response) {
                        var selectedCountry = response.data;

                        $http.get('/api/center/get?id=' + centerId).then(function (response) {
                            var selectedCenter = response.data;

                            $http.get('/api/type/get?id=' + typeId).then(function (response) {
                                var selectedType = response.data;

                                $http.get('/api/status/get?id=' + statusId).then(function (response) {
                                    var selectedStatus = response.data;

                                    var req = {
                                        method: 'POST',
                                        url: '/api/product/insert',
                                        data: {

                                            name: name,
                                            price: price,
                                            time: time,

                                            provider: selectedProvider,
                                            country: selectedCountry,
                                            center: selectedCenter,
                                            type: selectedType,
                                            status: selectedStatus

                                        }
                                    };

                                    console.log(req);
                                    $http(req).then(function (resp) {
                                        window.location.reload();
                                    })
                                });
                            });
                        });
                    });
                });
            }
            else document.getElementById("Regex").innerText = "Поле 'Ціна' заповнене не коректно. (Приклад 22.50)";

        }
        else document.getElementById("Regex").innerText = "Поле 'Назва' заповнене не коректно. (Перша буква велика, Мова Українська, Допустимий символи '- / №' )";
        //
        // accessTime=performance.now()-accessTime;
        // accessTime = Math.round(accessTime*100)/100;
        // window.alert('Час доступу до бази даних: '+accessTime+'мс');
    };

    this.startUpdateProduct = function startUpdate(product) {

        $http.get('/api/provider').then(function (response) {
            var provider = response.data;
            var selector = document.getElementById("ProviderUPD");
            $(selector).empty();
            for (var i = 0; i < provider.length; i++) {
                var option = document.createElement("option");
                if(provider[i].id == product.provider.id)
                    option.selected = 'selected';
                option.text = provider[i].name;
                option.value = provider[i].id;
                selector.add(option);
            }
        });

        $http.get('/api/type').then(function (response) {
            var type = response.data;
            var selector = document.getElementById("TypeUPD");
            $(selector).empty();
            for (var i = 0; i < type.length; i++) {
                var option = document.createElement("option");
                if(type[i].id == product.type.id)
                    option.selected = 'selected';
                option.text = type[i].name;
                option.value = type[i].id;
                selector.add(option);
            }
        });


        $http.get('/api/status').then(function (response) {
            var status = response.data;
            var selector = document.getElementById("StatusUPD");
            $(selector).empty();
            for (var i = 0; i < status.length; i++) {
                var option = document.createElement("option");
                if(status[i].id == product.status.id)
                    option.selected = 'selected';
                option.text = status[i].name;
                option.value = status[i].id;
                selector.add(option);
            }
        });

        $http.get('/api/center').then(function (response) {
            var center = response.data;
            var selector = document.getElementById("СenterUPD");
            $(selector).empty();
            for (var i = 0; i < center.length; i++) {
                var option = document.createElement("option");
                if(center[i].id == product.center.id)
                    option.selected = 'selected';
                option.text = center[i].name;
                option.value = center[i].id;
                selector.add(option);
            }
        });

        $http.get('/api/country').then(function (response) {
            var country = response.data;
            var selector = document.getElementById("CountryUPD");
            $(selector).empty();
            for (var i = 0; i < country.length; i++) {
                var option = document.createElement("option");
                if(country[i].id == product.country.id)
                    option.selected = 'selected';
                option.text = country[i].name;
                option.value = country[i].id;
                selector.add(option);
            }
        });

        document.getElementById("ProductIdUPD").innerText = product.id;
        document.getElementById("NameUPD").value = product.name;
        document.getElementById("ProviderUPD").value = product.provider;
        document.getElementById("PriceUPD").value = product.price;
        document.getElementById("TypeUPD").value = product.type.name;
        document.getElementById("StatusUPD").value = product.status.name;
        document.getElementById("СenterUPD").value = product.center.name;
        document.getElementById("CountryUPD").value = product.country;
        document.getElementById("timeUPD").value = product.time;

    };

    this.updateProduct = function update() {

        var id = document.getElementById("ProductIdUPD").innerText;

        var name = document.getElementById("NameUPD").value;
        console.log(name);
        var price = document.getElementById("PriceUPD").value;
        var time = document.getElementById("timeUPD").value;

        var indexProvider = document.getElementById("ProviderUPD").selectedIndex;
        var providerId = document.getElementById("ProviderUPD").options[indexProvider].value;

        var indexCountry = document.getElementById("CountryUPD").selectedIndex;
        var countryId = document.getElementById("CountryUPD").options[indexCountry].value;

        var indexCenter = document.getElementById("СenterUPD").selectedIndex;
        var centerId = document.getElementById("СenterUPD").options[indexCenter].value;

        var indexType = document.getElementById("TypeUPD").selectedIndex;
        var typeId = document.getElementById("TypeUPD").options[indexType].value;

        var indexStatus = document.getElementById("StatusUPD").selectedIndex;
        var statusId = document.getElementById("StatusUPD").options[indexStatus].value;

        var accessTime = performance.now();

        var regex =/^[А-ЯІ]([а-яА-ЯіІ0-9]|[/-№ ])*$/;
        if(regex.test(name)) {
            var regex2 =/^[0-9]*[.][0-9]+$/;
            if(regex2.test(price)) {


                $http.get('/api/provider/get?id=' + providerId).then(function (response) {
                    var selectedProvider = response.data;

                    $http.get('/api/country/get?id=' + countryId).then(function (response) {
                        var selectedCountry = response.data;

                        $http.get('/api/center/get?id=' + centerId).then(function (response) {
                            var selectedCenter = response.data;

                            $http.get('/api/type/get?id=' + typeId).then(function (response) {
                                var selectedType = response.data;

                                $http.get('/api/status/get?id=' + statusId).then(function (response) {
                                    var selectedStatus = response.data;

                                    var req = {
                                        method: 'POST',
                                        url: '/api/product/update?id=' + id,
                                        data: {

                                            name: name,
                                            price: price,
                                            time: time,

                                            provider: selectedProvider,
                                            country: selectedCountry,
                                            center: selectedCenter,
                                            type: selectedType,
                                            status: selectedStatus

                                        }
                                    };

                                    console.log(req);
                                    $http(req).then(function (resp) {
                                        window.location.reload();
                                    })
                                });
                            });
                        });
                    });
                });
            }
            else document.getElementById("RegexUPD").innerText = "Поле 'Ціна' заповнене не коректно. (Приклад 22.50)";

        }
        else document.getElementById("RegexUPD").innerText = "Поле 'Назва' заповнене не коректно. (Перша буква велика, Мова Українська, Допустимий символи '- / №' )";

        //
        // accessTime=performance.now()-accessTime;
        // accessTime = Math.round(accessTime*100)/100;
        // window.alert('Час доступу до бази даних: '+accessTime+'мс');
    };

});


