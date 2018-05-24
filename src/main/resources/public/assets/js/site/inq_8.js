
var app = angular.module("myinq_8", []);

app.controller("inq_8", function ($http, $scope){

    $scope.providers = [];
    $http.get('/api/product/getProductByFamous').then(function (response){
        $scope.providers = response.data;
    });

});