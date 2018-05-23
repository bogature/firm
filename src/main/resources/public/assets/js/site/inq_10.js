
var app = angular.module("myinq_10", []);

app.controller("inq_10", function ($http, $scope){

    $http.get('/api/type').then(function (response){
        var types = response.data;
        var selector = document.getElementById("Type");
        $(selector).empty();
        for (var i = 0; i < types.length; i++) {
            var option = document.createElement("option");
            option.text = types[i].name;
            option.value = types[i].id;
            selector.add(option);
        }
    });

    this.update_request = function add() {

        var indexOfStatus = document.getElementById("Type").selectedIndex;
        status_id = document.getElementById("Type").options[indexOfStatus].value;

        var start_time = document.getElementById("StartTime").value;
        var finish_time = document.getElementById("StartTime").value;

        $scope.providers = [];
        $http.get('/api/order/getCountOrderByTypeAndDate?status_id=' + status_id + "&start_time=" + start_time + "&finish_time=" + finish_time).then(function (response){

            document.getElementById("Rezultat").innerText = response.data;

        });

    };

});