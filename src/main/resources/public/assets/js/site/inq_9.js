
var app = angular.module("myinq_9", []);

app.controller("inq_9", function ($http, $scope){

    $scope.providers = [];
    $http.get('/api/product/getProductByCheap').then(function (response){
        $scope.providers = response.data;
    });

});