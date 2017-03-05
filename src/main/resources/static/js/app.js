var app = angular.module('beersApp', ['angular.filter', 'nya.bootstrap.select', 'ngRoute']);

app.config(function ($routeProvider, $httpProvider, $locationProvider) {

    $routeProvider.when('/', {
        templateUrl: 'home.html',
        controller: 'beerController'
    }).when('/login', {
        templateUrl: 'login.html',
        controller: 'loginController'
    }).otherwise('/');
});