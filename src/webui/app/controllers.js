function KisiController($scope,$http) {

    $scope.kisi = {
        id:null,
        ad:null,
        soyad:null,
        adres:null,
    };

    $scope.items = [
        
    ];

    $scope.getAll = function () {
        $http.get("http://localhost:8080/kisi/getAll")
        .then(function(response) {
            $scope.items = response.data;
        });

        toastr.success("Kayıtlar Listelendi.");
    };

    $scope.save = function () {
        $http.post("http://localhost:8080/kisi/save",$scope.kisi)
        .then(function(response) {
             toastr.success("Kayıt Eklendi.");
        });

        $scope.getAll();
        $scope.kisi.id=null;
        $scope.kisi.ad=null;
        $scope.kisi.soyad=null;
        $scope.kisi.adres=null;
        
    };

 $scope.yeni = function () {
        toastr.success("Kayıtlar Listelendi.");
    };

    $scope.getAll();
}