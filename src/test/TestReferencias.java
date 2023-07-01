package test;

import bytebank.Funcionario;
import bytebank.Gerente;

public class TestReferencias {

    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Jimmy");

        Gerente gerente = new Gerente();
        gerente.setNombre("Jimmyx2");

        funcionario.setSalario(5100);
        gerente.setSalario(6000);

        gerente.iniciarSesion("___dasd");
        // funcionario.iniciarSesion("asd"); // Funcionario doesn't have a method iniciarSesion
    }

}
