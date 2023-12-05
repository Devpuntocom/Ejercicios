package com.devpuntocom.banconv

class Cliente(var nombre: String = "", var documento : String="",var saldoCuenta : Double  = 0.0, var pass:String,var rol:String) {
    fun consignar(valor:Float){
        this.saldoCuenta += valor
    }
    fun retirar(valor: Float){
        this.saldoCuenta -= valor
    }
    fun imprimir (){
        println(this.saldoCuenta)
    }



}