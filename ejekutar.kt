package com.devpuntocom.banconv


fun main() {
    val cliente1 = Cliente("John Doe", "123456789", 1000.0, "123", "Cliente")
    val cajero = Cajero(cliente1)

    var ducumentoRecogido = cliente1.documento
    var passwordRecogido = cliente1.pass
    var RolRecogido = cliente1.rol
    var validator : Boolean = true
    while (validator == true) {
        println("Por favor digite su documento, constraseña y rol")
        println("Ingrese su documento")
        var DocE = readln().toString()
        println("Ingrese su password")
        var PassE = readln().toString()
        println("Ingrese su Rol")
        var RolE = readln().toString()
        if (DocE == cliente1.documento && PassE == cliente1.pass) {
            if (RolE == "Admin") {
                println("Que va a hacer?")
                println("Agregar un Cliente")
                var eleccionCliente = readln().toInt()
                when (eleccionCliente){
                    1->{
                        var NombreCliNovo = readln().toString()
                        var DocumentoCliNovo = readln().toString()
                        var SaldoCuentaCliNovo= readln().toDouble()
                        var passwordCliNovo = readln().toString()
                        var rolCliNovo = readln().toString()
                        var ClienteCliNovo = Cliente(NombreCliNovo,DocumentoCliNovo,SaldoCuentaCliNovo,passwordCliNovo,rolCliNovo)
                        val banco = Banco("BAncolombia","",0.0,"","")
                        banco.agregarCliente(ClienteCliNovo)
                    }

                }



            } else if (RolE == "Cliente") {
                var eleccioClie = readln().toInt()
                println("Que accion va a realizar? \n 1.Consinar \n 2.Retirar \n 3. Ver Saldo")
                when (eleccioClie){
                    1->{
                        println("Ingrese el valor a Consignar")
                        var ValorAgg = readln().toFloat()
                        cajero.consignar(ValorAgg)
                        println("Consignacion Existosa su saldo actual es ${cliente1.saldoCuenta}"
                        )
                    }
                    2->{
                        println("Ingrese el valor a retirar")
                        var ValorRetirar = readln().toFloat()
                        cajero.retirar(ValorRetirar)
                        println("retiro exitoso su saldo actual es ${cliente1.saldoCuenta}")

                    }
                    3->{
                        println("su saldo Actual es ${cliente1.saldoCuenta}")

                    }
                }
            }
            else{
                println("Acceso Denegado Credenciales Incorrectas")
            }
        }
    }
}


















