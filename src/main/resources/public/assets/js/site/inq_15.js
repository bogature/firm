
var app = angular.module("myinq_15", []);

app.controller("inq_15", function ($http, $scope){


    this.update_request = function add() {

        var start_time = document.getElementById("StartTime").value;
        var finish_time = document.getElementById("FinishTime").value;

        $scope.providers = [];
        $http.get('/api/defect/getCountDefectByDay?startTime='+ start_time + "&finishTime=" + finish_time).then(function (response){

            document.getElementById("Rezultat").innerText = response.data;

        });

    };

});