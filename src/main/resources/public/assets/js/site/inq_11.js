
var app = angular.module("myinq_11", []);

app.controller("inq_11", function ($http, $scope){

    $http.get('/api/provider').then(function (response){
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

    this.update_request = function add() {

        console.log("Start...");

        var indexOfProvider = document.getElementById("Provider").selectedIndex;
        provider_id = document.getElementById("Provider").options[indexOfProvider].value;

        $scope.providers = [];
        $http.get('/api/provider/getCountProviderByProcent?provider_id=' + provider_id ).then(function (response){

            document.getElementById("Rezultat").innerText = response.data;

        });

    };

});