package com.devpuntocom.banconv

class Banco(var nombre: String = "", var documento : String="",var saldoCuenta : Double  = 0.0,var pass :String, var rol :String) {
    val clientes = mutableListOf<Cliente>()

    fun agregarCliente(cliente: Cliente) {
        clientes.add(cliente)
    }
}