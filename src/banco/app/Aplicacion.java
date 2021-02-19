package banco.app;

import banco.dominio.CuentaBancaria;
import banco.dominio.Persona;

public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");

        Persona alejandro = new Persona();
        Persona juanSebastian = new Persona();

        CuentaBancaria miCuenta = new CuentaBancaria();
        CuentaBancaria cuentaSebas = new CuentaBancaria();

        alejandro.nombre = "Alejandro";
        miCuenta.titular = alejandro;
        miCuenta.saldo = 316000;
        miCuenta.estado = "A";

        juanSebastian.nombre = "Juan Sebastian";
        cuentaSebas.titular = juanSebastian;
        cuentaSebas.saldo = 0;
        cuentaSebas.estado = "A";

        miCuenta.retirar(300000);

        System.out.println(miCuenta.consultarSaldo());
        System.out.println(cuentaSebas.consultarSaldo());

        boolean resultadoTransferencia = miCuenta.transferir(216000, cuentaSebas);

        System.out.println(resultadoTransferencia);
        System.out.println(miCuenta.consultarSaldo());
        System.out.println(cuentaSebas.consultarSaldo());
    }
}