(function () {
  var ctrls = angular.module(MyAppConfig.controllers);
  ctrls.controller('MangeIndexCtrl', ['$scope', '$log', '$location','$timeout', 'DialogService', 'DataService', MangeIndexCtrl]);

  function MangeIndexCtrl($scope, $log,$location,$timeout,DialogService, DataService) {
    $log.debug('MangeIndexCtrl init...');
    //处理scope销毁
    $scope.$on('$destroy', function () {
      $log.debug('MangeIndexCtrl destroy...');
    });
    $scope.formdata = {};
    $scope.login = function () {
      DialogService.showWait('登录中，请稍后');
      DataService.send('/admin/user/login', {
        user: $scope.formdata
      }, function (data) {
        DialogService.hideWait();
        DialogService.showAlert(data.message, function () {
          if (data.success) {
            $timeout(function () {
              $location.hash('typemanage.html');
              $location.path('/route/page/manage/main');
            }, 1);
          }
        });
      });
    };
    // $scope.query=function(){

    // };
  }

})();