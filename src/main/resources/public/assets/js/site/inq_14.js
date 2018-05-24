
var app = angular.module("myinq_14", []);

app.controller("inq_14", function ($http, $scope){

    this.update_request = function add() {

        var start_time = document.getElementById("StartTime").value;
        var finish_time = document.getElementById("FinishTime").value;

        $scope.defects = [];
        $http.get('/api/defect/getDefectByDate?startTime=' + start_time + "&finishTime=" + finish_time).then(function (response){


            document.getElementById("Rezultat").innerText = " ";
            $scope.defects = response.data;

            if ($scope.defects.length <= 0) {
                document.getElementById("Rezultat").innerText = "Даної інформації в базі не знайдено";
            }


        });

    };

});