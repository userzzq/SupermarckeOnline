(function () {
  var ctrls = angular.module(MyAppConfig.controllers);
  ctrls.controller('MangeIndexCtrl' ['$scope', '$log', 'DialogService', 'DataService', MangeIndexCtrl]);

  function MangeIndexCtrl($scope, $log, DialogService, DataService) {
    $log.debug('MangeIndexCtrl init...');
    //处理scope销毁
    $scope.$on('$destroy', function () {
      $log.debug('MangeIndexCtrl destroy...');
    });
  }

})();