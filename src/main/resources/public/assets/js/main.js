//
//
// var app1 = angular.module("demo1", []);
//
// app1.controller("product", function ($scope, $http) {
//
//     $scope.products = [];
//     var accessTime = performance.now();
//     $http.get('/api/product').then(function (response) {
//         $scope.products = response.data;
//
//         accessTime=performance.now()-accessTime;
//         accessTime = Math.round(accessTime*100)/100;
//         window.alert('Час доступу до бази даних: '+accessTime+'мс');
//     });
//
//     this.delProduct = function del(id) {
//
//         var accessTime = performance.now();
//
//         $http.get('/api/product/del?id=' + id).then(function () {
//             window.location.reload();
//         });
//
//         accessTime=performance.now()-accessTime;
//         accessTime = Math.round(accessTime*100)/100;
//         window.alert('Час доступу до бази даних: '+accessTime+'мс');
//     };
//
//     this.startInsertProduct = function startUpdate() {
//
//         $http.get('/api/provider').then(function (response) {
//             var provider = response.data;
//             var selector = document.getElementById("Provider");
//             $(selector).empty();
//             for (var i = 0; i < provider.length; i++) {
//                 var option = document.createElement("option");
//                 option.text = provider[i].name;
//                 option.value = provider[i].id;
//                 selector.add(option);
//             }
//         });
//
//         $http.get('/api/type').then(function (response) {
//             var type = response.data;
//             var selector = document.getElementById("Type");
//             $(selector).empty();
//             for (var i = 0; i < type.length; i++) {
//                 var option = document.createElement("option");
//                 option.text = type[i].name;
//                 option.value = type[i].id;
//                 selector.add(option);
//             }
//         });
//
//
//         $http.get('/api/status').then(function (response) {
//             var status = response.data;
//             var selector = document.getElementById("Status");
//             $(selector).empty();
//             for (var i = 0; i < status.length; i++) {
//                 var option = document.createElement("option");
//                 option.text = status[i].name;
//                 option.value = status[i].id;
//                 selector.add(option);
//             }
//         });
//
//         $http.get('/api/center').then(function (response) {
//             var center = response.data;
//             var selector = document.getElementById("Сenter");
//             $(selector).empty();
//             for (var i = 0; i < center.length; i++) {
//                 var option = document.createElement("option");
//                 option.text = center[i].name;
//                 option.value = center[i].id;
//                 selector.add(option);
//             }
//         });
//
//         $http.get('/api/country').then(function (response) {
//             var country = response.data;
//             var selector = document.getElementById("Country");
//             $(selector).empty();
//             for (var i = 0; i < country.length; i++) {
//                 var option = document.createElement("option");
//                 option.text = country[i].name;
//                 option.value = country[i].id;
//                 selector.add(option);
//             }
//         });
//
//     };
//
//     this.insertProduct = function add() {
//
//         var name = document.getElementById("Name").value;
//         console.log(name);
//         var price = document.getElementById("Price").value;
//         var time = document.getElementById("time").value;
//
//         var indexProvider = document.getElementById("Provider").selectedIndex;
//         var providerId = document.getElementById("Provider").options[indexProvider].value;
//
//         var indexCountry = document.getElementById("Country").selectedIndex;
//         var countryId = document.getElementById("Country").options[indexCountry].value;
//
//         var indexCenter = document.getElementById("Сenter").selectedIndex;
//         var centerId = document.getElementById("Сenter").options[indexCenter].value;
//
//         var indexType = document.getElementById("Type").selectedIndex;
//         var typeId = document.getElementById("Type").options[indexType].value;
//
//         var indexStatus = document.getElementById("Status").selectedIndex;
//         var statusId = document.getElementById("Status").options[indexStatus].value;
//
//         var accessTime = performance.now();
//
//         $http.get('/api/provider/get?id=' + providerId).then(function (response) {
//             var selectedProvider = response.data;
//
//             $http.get('/api/country/get?id='+countryId).then(function (response) {
//                 var selectedCountry = response.data;
//
//                 $http.get('/api/center/get?id='+centerId).then(function (response) {
//                     var selectedCenter = response.data;
//
//                     $http.get('/api/type/get?id='+typeId).then(function (response) {
//                         var selectedType = response.data;
//
//                         $http.get('/api/status/get?id='+statusId).then(function (response) {
//                             var selectedStatus = response.data;
//
//                             var req = {
//                                 method: 'POST',
//                                 url: '/api/product/insert',
//                                 data: {
//
//                                     name: name,
//                                     price: price,
//                                     time:time,
//
//                                     provider: selectedProvider,
//                                     country: selectedCountry,
//                                     center: selectedCenter,
//                                     type: selectedType,
//                                     status: selectedStatus
//
//                                 }
//                             };
//
//                             console.log(req);
//                             $http(req).then(function (resp) {
//                                 window.location.reload();
//                             })
//                         });
//                     });
//                 });
//             });
//         });
//         accessTime=performance.now()-accessTime;
//         accessTime = Math.round(accessTime*100)/100;
//         window.alert('Час доступу до бази даних: '+accessTime+'мс');
//     };
//
//     this.startUpdateProduct = function startUpdate(product) {
//
//         $http.get('/api/provider').then(function (response) {
//             var provider = response.data;
//             var selector = document.getElementById("ProviderUPD");
//             $(selector).empty();
//             for (var i = 0; i < provider.length; i++) {
//                 var option = document.createElement("option");
//                 if(provider[i].id == product.provider.id)
//                     option.selected = 'selected';
//                 option.text = provider[i].name;
//                 option.value = provider[i].id;
//                 selector.add(option);
//             }
//         });
//
//         $http.get('/api/type').then(function (response) {
//             var type = response.data;
//             var selector = document.getElementById("TypeUPD");
//             $(selector).empty();
//             for (var i = 0; i < type.length; i++) {
//                 var option = document.createElement("option");
//                 if(type[i].id == product.type.id)
//                     option.selected = 'selected';
//                 option.text = type[i].name;
//                 option.value = type[i].id;
//                 selector.add(option);
//             }
//         });
//
//
//         $http.get('/api/status').then(function (response) {
//             var status = response.data;
//             var selector = document.getElementById("StatusUPD");
//             $(selector).empty();
//             for (var i = 0; i < status.length; i++) {
//                 var option = document.createElement("option");
//                 if(status[i].id == product.status.id)
//                     option.selected = 'selected';
//                 option.text = status[i].name;
//                 option.value = status[i].id;
//                 selector.add(option);
//             }
//         });
//
//         $http.get('/api/center').then(function (response) {
//             var center = response.data;
//             var selector = document.getElementById("СenterUPD");
//             $(selector).empty();
//             for (var i = 0; i < center.length; i++) {
//                 var option = document.createElement("option");
//                 if(center[i].id == product.center.id)
//                     option.selected = 'selected';
//                 option.text = center[i].name;
//                 option.value = center[i].id;
//                 selector.add(option);
//             }
//         });
//
//         $http.get('/api/country').then(function (response) {
//             var country = response.data;
//             var selector = document.getElementById("CountryUPD");
//             $(selector).empty();
//             for (var i = 0; i < country.length; i++) {
//                 var option = document.createElement("option");
//                 if(country[i].id == product.country.id)
//                     option.selected = 'selected';
//                 option.text = country[i].name;
//                 option.value = country[i].id;
//                 selector.add(option);
//             }
//         });
//
//         document.getElementById("ProductIdUPD").innerText = product.id;
//         document.getElementById("NameUPD").value = product.name;
//         document.getElementById("ProviderUPD").value = product.provider;
//         document.getElementById("PriceUPD").value = product.price;
//         document.getElementById("TypeUPD").value = product.type.name;
//         document.getElementById("StatusUPD").value = product.status.name;
//         document.getElementById("СenterUPD").value = product.center.name;
//         document.getElementById("CountryUPD").value = product.country;
//         document.getElementById("timeUPD").value = product.time;
//
//     };
//
//     this.updateProduct = function update() {
//
//         var id = document.getElementById("ProductIdUPD").innerText;
//
//         var name = document.getElementById("NameUPD").value;
//         console.log(name);
//         var price = document.getElementById("PriceUPD").value;
//         var time = document.getElementById("timeUPD").value;
//
//         var indexProvider = document.getElementById("ProviderUPD").selectedIndex;
//         var providerId = document.getElementById("ProviderUPD").options[indexProvider].value;
//
//         var indexCountry = document.getElementById("CountryUPD").selectedIndex;
//         var countryId = document.getElementById("CountryUPD").options[indexCountry].value;
//
//         var indexCenter = document.getElementById("СenterUPD").selectedIndex;
//         var centerId = document.getElementById("СenterUPD").options[indexCenter].value;
//
//         var indexType = document.getElementById("TypeUPD").selectedIndex;
//         var typeId = document.getElementById("TypeUPD").options[indexType].value;
//
//         var indexStatus = document.getElementById("StatusUPD").selectedIndex;
//         var statusId = document.getElementById("StatusUPD").options[indexStatus].value;
//
//         var accessTime = performance.now();
//
//         $http.get('/api/provider/get?id=' + providerId).then(function (response) {
//             var selectedProvider = response.data;
//
//             $http.get('/api/country/get?id='+countryId).then(function (response) {
//                 var selectedCountry = response.data;
//
//                 $http.get('/api/center/get?id='+centerId).then(function (response) {
//                     var selectedCenter = response.data;
//
//                     $http.get('/api/type/get?id='+typeId).then(function (response) {
//                         var selectedType = response.data;
//
//                         $http.get('/api/status/get?id='+statusId).then(function (response) {
//                             var selectedStatus = response.data;
//
//                             var req = {
//                                 method: 'POST',
//                                 url: '/api/product/update?id='+id,
//                                 data: {
//
//                                     name: name,
//                                     price: price,
//                                     time:time,
//
//                                     provider: selectedProvider,
//                                     country: selectedCountry,
//                                     center: selectedCenter,
//                                     type: selectedType,
//                                     status: selectedStatus
//
//                                 }
//                             };
//
//                             console.log(req);
//                             $http(req).then(function (resp) {
//                                 window.location.reload();
//                             })
//                         });
//                     });
//                 });
//             });
//         });
//
//         accessTime=performance.now()-accessTime;
//         accessTime = Math.round(accessTime*100)/100;
//         window.alert('Час доступу до бази даних: '+accessTime+'мс');
//     };
//
// });
//
//



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

//
// var app7 = angular.module("mydefect", []);
//
// app7.controller("defects", function ($scope, $http) {
//
//     $scope.defects = [];
//     $http.get('/api/defect').then(function (response) {
//         $scope.defects = response.data;
//     });
//
//     this.delDefect = function del(id) {
//         $http.get('/api/defect/del?id=' + id).then(function () {
//             window.location.reload();
//         });
//     };
//
//     this.startInsertDefect = function startUpdate() {
//         $http.get('/api/product').then(function (response) {
//             var product = response.data;
//             var selector = document.getElementById("Product");
//             $(selector).empty();
//             for (var i = 0; i < product.length; i++) {
//                 var option = document.createElement("option");
//                 option.text = product[i].name;
//                 option.value = product[i].id;
//                 selector.add(option);
//             }
//         });
//     };
//
//     this.insertDefect = function add() {
//         var time = document.getElementById("time").value;
//
//         var indexProduct = document.getElementById("Product").selectedIndex;
//         var productId = document.getElementById("Product").options[indexProduct].value;
//
//         $http.get('/api/product/get?id='+productId).then(function (response) {
//             var selectedProduct = response.data;
//             var req = {
//                 method: 'POST',
//                 url: '/api/defect/insert',
//                 data: {
//                     time: time,
//                     product: selectedProduct
//                 }
//             };
//             console.log(req);
//             $http(req).then(function (resp) {
//                 window.location.reload();
//             })
//         });
//     };
//
//     this.startUpdateDefect = function startUpdate(id) {
//         $http.get('/api/product').then(function (response) {
//             var product = response.data;
//             var selector = document.getElementById("DefectProductUPD");
//             $(selector).empty();
//             for (var i = 0; i < product.length; i++) {
//                 var option = document.createElement("option");
//                 if (product[i].id == product.id){
//                     option.selected = 'selected';
//                 }
//                 option.text = product[i].name;
//                 option.value = product[i].id;
//                 selector.add(option);
//             }
//         });
//
//         document.getElementById("DefectIdUPD").innerText = id;
//     };
//
//     this.updateDefect = function update() {
//         var id = document.getElementById("DefectIdUPD").innerText;
//
//         var time = document.getElementById("timeUPD").value;
//
//
//         var indexProduct = document.getElementById("DefectProductUPD").selectedIndex;
//         var productId = document.getElementById("DefectProductUPD").options[indexProduct].value;
//
//         $http.get('/api/product/get?id=' + productId).then(function (response) {
//             var selectedProduct = response.data;
//
//             var req = {
//                 method: 'POST',
//                 url: 'api/defect/update?id='+id,
//                 data: {
//                     time: time,
//                     product: selectedProduct
//                 }
//             };
//
//             $http(req).then(function (resp) {
//                 window.location.reload();
//             })
//         });
//     };
//
//
//
//
//
//
//
// });
//


//
// var app8 = angular.module("mydirectory", []);
//
// app8.controller("directorys", function ($scope, $http) {
//
//     $scope.directorys = [];
//     $http.get('/api/directory').then(function (response) {
//         $scope.directorys = response.data;
//     });
//
//     this.delDirectory = function del(id) {
//         $http.get('/api/directory/del?id=' + id).then(function () {
//             window.location.reload();
//         });
//     };
//
//     this.startInsertDirectory = function startUpdate() {
//         $http.get('/api/product').then(function (response) {
//             var product = response.data;
//             var selector = document.getElementById("Product");
//             $(selector).empty();
//             for (var i = 0; i < product.length; i++) {
//                 var option = document.createElement("option");
//                 option.text = product[i].name;
//                 option.value = product[i].id;
//                 selector.add(option);
//             }
//         });
//     };
//
//
//     this.insertDirectory = function add() {
//
//         var indexDirectory = document.getElementById("Product").selectedIndex;
//         var directoryId = document.getElementById("Product").options[indexDirectory].value;
//
//         $http.get('/api/product/get?id=' + directoryId).then(function (response) {
//             var selectedProduct = response.data;
//
//             var req = {
//                 method: 'POST',
//                 url: '/api/directory/insert',
//                 data: {
//                     product: selectedProduct
//                 }
//             };
//
//             $http(req).then(function (resp) {
//                 window.location.reload();
//             })
//         });
//     };
//
//     this.startUpdateDirectory = function startUpdate(id) {
//         $http.get('/api/product').then(function (response) {
//             var product = response.data;
//             var selector = document.getElementById("DirectoryProductUPD");
//             $(selector).empty();
//             for (var i = 0; i < product.length; i++) {
//                 var option = document.createElement("option");
//                 if (product[i].id == product.id){
//                     option.selected = 'selected';
//                 }
//                 option.text = product[i].name;
//                 option.value = product[i].id;
//                 selector.add(option);
//             }
//         });
//
//         document.getElementById("ProductIdUPD").innerText = id;
//     };
//
//     this.updateDirectory = function update() {
//         var id = document.getElementById("ProductIdUPD").innerText;
//
//         var indexDirectory = document.getElementById("DirectoryProductUPD").selectedIndex;
//         var directoryId = document.getElementById("DirectoryProductUPD").options[indexDirectory].value;
//
//         $http.get('/api/product/get?id=' + directoryId).then(function (response) {
//             var selectedProduct = response.data;
//
//             var req = {
//                 method: 'POST',
//                 url: 'api/directory/update?id='+id,
//                 data: {
//                     product: selectedProduct
//                 }
//             };
//
//             $http(req).then(function (resp) {
//                 window.location.reload();
//             })
//         });
//     };
//
//
// });
//
//

//
//
//
// var app = angular.module("demo", []);
//
// app.controller("mycontroller", function ($scope, $http) {
//
//     $scope.contries = [];
//     $http.get('/api/country').then(function (response) {
//         $scope.contries = response.data;
//     });
//
//
//     this.insertCountry = function add() {
//         var name = document.getElementById("CountryName").value;
//
//         var req = {
//             method: 'POST',
//             url: '/api/country/insert',
//             data: {
//                 name: name
//             }
//         };
//
//         console.log(req);
//         $http(req).then(function (resp) {
//             console.log(resp);
//             window.location.reload();
//         })
//     };
//
//     this.delCountry = function del(id) {
//         $http.get('/api/country/del?id=' + id).then(function () {
//             window.location.reload();
//         });
//     };
//
//     this.startUpdateCountry = function startUpdate(id,name) {
//         document.getElementById("CountryIdUPD").innerText = id;
//         document.getElementById("CountryNameUPD").value = name;
//     };
//
//     this.updateCountry = function update() {
//         var id = document.getElementById("CountryIdUPD").innerText;
//         var name = document.getElementById("CountryNameUPD").value;
//         var req = {
//             method: 'POST',
//             url: '/api/country/update?id=' + id,
//             data: {
//                 name: name
//             }
//         };
//         console.log(req);
//         $http(req).then(function (resp) {
//             console.log(resp);
//             window.location.reload();
//         })
//     };
//
//
// });
//
//























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

// var app10 = angular.module("mycategory", []);
//
// app10.controller("categorys", function ($scope, $http) {
//
//     $scope.categorys = [];
//     $http.get('/api/category').then(function (response) {
//         $scope.categorys = response.data;
//     });
//
//     this.insertCategory = function add() {
//         var name = document.getElementById("CategoryName").value;
//         var regex =/^[А-Я][а-я]+$/;
//
//         if(regex.test(name))
//         {
//             var req = {
//                 method: 'POST',
//                 url: '/api/category/insert',
//                 data: {
//                     name: name
//                 }
//             };
//         }
//         else console.log("Bla-bla");
//
//         console.log(req);
//         $http(req).then(function (resp) {
//             console.log(resp);
//             window.location.reload();
//         })
//     };
//
//
//
//     this.delCategory = function del(id) {
//         $http.get('/api/category/del?id=' + id).then(function () {
//             window.location.reload();
//         });
//     };
//
//     this.startUpdateCategory = function startUpdate(id,name) {
//         document.getElementById("CategoryIdUPD").innerText = id;
//         document.getElementById("CategoryNameUPD").value = name;
//     };
//
//     this.updateCategory = function update() {
//         var id = document.getElementById("CategoryIdUPD").innerText;
//         var name = document.getElementById("CategoryNameUPD").value;
//         var req = {
//             method: 'POST',
//             url: '/api/category/update?id=' + id,
//             data: {
//                 name: name
//             }
//         };
//         console.log(req);
//         $http(req).then(function (resp) {
//             console.log(resp);
//             window.location.reload();
//         })
//     };
//
//
//
// });





var app3 = angular.module("mystatus", []);

app3.controller("status", function ($scope, $http) {

    $scope.status = [];
    $http.get('/api/status').then(function (response) {
        $scope.status = response.data;
    });


    this.insertStatus = function add() {
        var name = document.getElementById("StatusName").value;

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
    };




});







// var app4 = angular.module("myproviders", []);
//
// app4.controller("providers", function ($scope, $http) {
//
//     $scope.providers = [];
//     $http.get('/api/provider').then(function (response) {
//         $scope.providers = response.data;
//     });
//
//     this.startInsertProvider = function startUpdate() {
//         $http.get('/api/category').then(function (response) {
//             var category = response.data;
//             var selector = document.getElementById("ProviderCategory");
//             $(selector).empty();
//             for (var i = 0; i < category.length; i++) {
//                 var option = document.createElement("option");
//                 option.text = category[i].name;
//                 option.value = category[i].id;
//                 selector.add(option);
//             }
//         });
//     };
//
//
//
//     this.insertProvider = function add() {
//         var name = document.getElementById("ProviderName").value;
//
//         var indexCategory = document.getElementById("ProviderCategory").selectedIndex;
//         var categorys_id = document.getElementById("ProviderCategory").options[indexCategory].value;
//
//         var req = {
//             method: 'POST',
//             url: '/api/provider/insert',
//             data: {
//                 name: name,
//                 categorys_id: categorys_id
//             }
//         };
//
//         $http(req).then(function (resp) {
//             window.location.reload();
//         })
//
//     };
//
//     this.startUpdateStreet = function startUpdate(id, name) {
//         $http.get('/api/category').then(function (response) {
//             var category = response.data;
//             var selector = document.getElementById("ProviderCategoryUPD");
//             $(selector).empty();
//             for (var i = 0; i < category.length; i++) {
//                 var option = document.createElement("option");
//                 if (category[i].id == category){
//                     option.selected = 'selected';
//                 }
//                 option.text = category[i].name;
//                 option.value = category[i].id;
//                 selector.add(option);
//             }
//         });
//
//         document.getElementById("ProviderIdUPD").innerText = id;
//         document.getElementById("ProviderNameUPD").value = name;
//
//     };
//
//     this.updateProvider = function add() {
//         var id = document.getElementById("ProviderIdUPD").innerText;
//         var name = document.getElementById("ProviderNameUPD").value;
//
//         var indexCategory = document.getElementById("ProviderCategoryUPD").selectedIndex;
//         var categorys_id = document.getElementById("ProviderCategoryUPD").options[indexCategory].value;
//
//         var req = {
//             method: 'POST',
//             url: '/api/provider/update?id='+id,
//             data: {
//                 name: name,
//                 categorys_id: categorys_id
//             }
//         };
//
//         $http(req).then(function (resp) {
//             window.location.reload();
//         })
//
//     };
//
//
//
//
//     this.delProvider = function del(id) {
//         $http.get('/api/provider/del?id=' + id).then(function () {
//             window.location.reload();
//         });
//     };
//
// });







var app5 = angular.module("mycustomer", []);

app5.controller("customers", function ($scope, $http) {

    $scope.customers = [];
    $http.get('/api/customer').then(function (response) {
        $scope.customers = response.data;
    });

    this.insertCustomers = function add() {
        var name = document.getElementById("CustomersName").value;

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
    };


});



//
// var app6 = angular.module("mycenter", []);
//
// app6.controller("centers", function ($scope, $http) {
//
//     $scope.centers = [];
//     $http.get('/api/center').then(function (response) {
//         $scope.centers = response.data;
//     });
//
//     this.insertCenter = function add() {
//         var name = document.getElementById("CenterName").value;
//
//         var req = {
//             method: 'POST',
//             url: '/api/center/insert',
//             data: {
//                 name: name
//             }
//         };
//
//         console.log(req);
//         $http(req).then(function (resp) {
//             console.log(resp);
//             window.location.reload();
//         })
//     };
//
//     this.delCenter = function del(id) {
//         $http.get('/api/center/del?id=' + id).then(function () {
//             window.location.reload();
//         });
//     };
//
//     this.startUpdateCustomers = function startUpdate(id,name) {
//         document.getElementById("CenterIdUPD").innerText = id;
//         document.getElementById("CenterNameUPD").value = name;
//     };
//
//     this.updateCustomers = function update() {
//         var id = document.getElementById("CenterIdUPD").innerText;
//         var name = document.getElementById("CenterNameUPD").value;
//         var req = {
//             method: 'POST',
//             url: '/api/center/update?id=' + id,
//             data: {
//                 name: name
//             }
//         };
//         console.log(req);
//         $http(req).then(function (resp) {
//             console.log(resp);
//             window.location.reload();
//         })
//     };
//
// });
//
//
//






























