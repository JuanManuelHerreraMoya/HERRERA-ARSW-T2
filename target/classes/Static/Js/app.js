var cliente = apiCliente;
var ciudad ;
var app = (function () {
    function DrawData(datos) {
        if (datos == null){
                    return new Error("No se encontro");
                }
                lista = [];
                var lista  = datos.map(function(pb){
                    return {weather:pb.weather.main, tempMax:pb.main.temp_max, tempMin:pb.main.temp_min, Cloud:pb.clouds.all}
                })

            lista.map(function(pb){

                var fila = `<tr><td id="weather"> ${pb.weather} </td><td id="tempMax">${pb.tempMax}</td><td id="tempMin"> ${pb.tempMin} </td><td id="Cloud"> ${pb.Cloud}</td> </tr>`;
                $("#t01  tbody").append(fila);

            })
    }

    return {
            createFunction: function getDatos(nombre) {
            cliente.getByCityName(nombre,DrawData);
                }
        };
})();

