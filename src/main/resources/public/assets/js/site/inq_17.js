
var app = angular.module("myinq_17", []);

app.controller("inq_17", function ($http, $scope){

    $http.get('/api/country').then(function (response){
        var countrys = response.data;
        var selector = document.getElementById("Country");
        $(selector).empty();
        for (var i = 0; i < countrys.length; i++) {
            var option = document.createElement("option");
            option.text = countrys[i].name;
            option.value = countrys[i].id;
            selector.add(option);
        }
    });

    $http.get('/api/center').then(function (response){
        var centers = response.data;
        var selector = document.getElementById("Center");
        $(selector).empty();
        for (var i = 0; i < centers.length; i++) {
            var option = document.createElement("option");
            option.text = centers[i].name;
            option.value = centers[i].id;
            selector.add(option);
        }
    });


    this.update_request = function add() {

        console.log("Start...");

        var indexOfCountry = document.getElementById("Country").selectedIndex;
        country_id = document.getElementById("Country").options[indexOfCountry].value;

        var indexOfCenter = document.getElementById("Center").selectedIndex;
        center_id = document.getElementById("Center").options[indexOfCenter].value;

        $scope.providers = [];
        $http.get('/api/product/getProductByCountryAndCenter?country_id=' + country_id + "&center_id=" + center_id ).then(function (response){


            document.getElementById("Rezultat").innerText = " ";
            $scope.providers = response.data;

            console.log($scope.providers.length);

            if ($scope.providers.length <= 0) {
                document.getElementById("Rezultat").innerText = "Даної інформації в базі не знайдено";
            }


        });

    };

});