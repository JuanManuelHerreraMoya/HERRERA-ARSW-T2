const apiUrl = "http://localhost:8080/openWhater/"
apiCliente = (function () {

    return {
        getByCityName: function (city, callback) {
            jQuery.ajax({
                url: apiUrl + city,
                success: function (result) {
                    callback(result);
                },
                async: true
            });
        }
    }

})();