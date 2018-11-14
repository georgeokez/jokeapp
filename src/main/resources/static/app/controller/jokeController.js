'use strict';

App.controller('JokeController', ['$scope','$http', function ($scope, $http) {

    var URL = "http://localhost:8080/api/v1/joke";

    $scope.joke = "";

    $scope.getJoke = function () {
        $http.get(URL).then(successCallback, errorCallback);

        function successCallback(response){
            $scope.joke = response.data.joke;
        }
        function errorCallback(error){
            console.log(error);
        }
    }

    var init = function () {
        $scope.getJoke();
    }

    init();

}]);