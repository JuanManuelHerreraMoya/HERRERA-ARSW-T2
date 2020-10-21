var cliente=apiCliente;

var ciudad ;

var app = (function () {
    function DrawData(datos) {

    }
    return {
        getDatos: function (nombre) {
            cliente.getByCityName(nombre,DrawData);
        },
    };

})();

