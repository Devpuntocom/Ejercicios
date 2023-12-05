package com.devpuntocom.banconv

class Cajero (private val cliente: Cliente) {
        fun consignar(valor: Float) {
            cliente.consignar(valor)
        }
        fun retirar(valor: Float) {
            cliente.retirar(valor)
        }
        fun imprimirSaldo() {
            println("El saldo actual es: ${cliente.saldoCuenta}")
        }

}