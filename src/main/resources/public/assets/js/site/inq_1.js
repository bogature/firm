
var app = angular.module("myinq_1", []);

app.controller("inq_1", function ($http, $scope){

    $http.get('/api/category').then(function (response){
        var categorys = response.data;
        var selector = document.getElementById("Categorys");
        $(selector).empty();
        for (var i = 0; i < categorys.length; i++) {
            var option = document.createElement("option");
            option.text = categorys[i].name;
            option.value = categorys[i].id;
            selector.add(option);
        }
    });

    $http.get('/api/type').then(function (response){
        var types = response.data;
        var selector = document.getElementById("Types");
        $(selector).empty();
        for (var i = 0; i < types.length; i++) {
            var option = document.createElement("option");
            option.text = types[i].name;
            option.value = types[i].id;
            selector.add(option);
        }
    });

    this.update_request = function add() {

        var indexOfCategory = document.getElementById("Categorys").selectedIndex;
        categorys_id = document.getElementById("Categorys").options[indexOfCategory].value;

        var indexOfType = document.getElementById("Types").selectedIndex;
        type_id = document.getElementById("Types").options[indexOfType].value;

        $scope.providers = [];
        $http.get('/api/provider/getProvidersByCategoryAndType?categorys_id='+categorys_id + "&type_id="+type_id).then(function (response){

            document.getElementById("Rezultat").innerText = " ";
            $scope.providers = response.data;

            console.log($scope.providers.length);

            if ($scope.providers.length <= 0) {
                document.getElementById("Rezultat").innerText = "Даної інформації в базі не знайдено";
            }


        });

    };

});