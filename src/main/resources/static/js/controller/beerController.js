app.controller('beerController', ['$scope', '$http', function ($scope, $http) {

    var apiAddress = "http://localhost:8080";
    var imgUrl = "img/beers/";
    getCountriesInFrench();
    getColorsInFrench();
    getStrenghtsInFrench();
    $scope.countrySelected = "";
    $scope.colorSelected = "";
    $scope.strenghtSelected = "";

    $scope.search = function () {
        $http.get(apiAddress + "/beer", {
            params: {
                "country": $scope.countrySelected,
                "color": $scope.colorSelected,
                "strenght": $scope.strenghtSelected
            }
        })
            .then(function (response) {
                for (var i = 0; i < response.data.length; i++) {
                    response.data[i].imgUrl = imgUrl + response.data[i].imgUrl;
                }
                $scope.allBeers = response.data;
            })
    };

    $scope.setCountry = function (country) {
        $scope.countrySelected = country;
    };

    $scope.setColor = function (color) {
        $scope.colorSelected = color;
    };

    $scope.setStrenght = function (strenght) {
        $scope.strenghtSelected = strenght;
    };

    function getBeers() {
        $http.get(apiAddress + "/beer").then(function (response) {
            for (var i = 0; i < response.data.length; i++) {
                response.data[i].imgUrl = imgUrl + response.data[i].imgUrl;
            }
            $scope.allBeers = response.data;
        })
    }

    function getColorsInFrench() {
        $http.get(apiAddress + "/color").then(function (response) {
            $scope.allColors = response.data;
            $scope.defaultColor = $scope.allColors[0];
            $scope.colorSelected = $scope.defaultColor;
        })
    }

    function getCountriesInFrench() {
        $http.get(apiAddress + "/country").then(function (response) {
            $scope.allCountries = response.data;
            $scope.defaultCountry = $scope.allCountries[0];
            $scope.countrySelected = $scope.defaultCountry;
        })
    }

    function getStrenghtsInFrench() {
        $http.get(apiAddress + "/strenght").then(function (response) {
            $scope.allStrenghts = response.data;
            $scope.defaultStrenght = $scope.allStrenghts[0];
            $scope.strenghtSelected = $scope.defaultStrenght;
        })
    }

}]);