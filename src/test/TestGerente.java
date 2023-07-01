package test;

import bytebank.Gerente;

public class TestGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(60000);
        gerente.setClave("doctoctoc");
        gerente.setTipo(1);

        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.iniciarSesion("drack"));
    }
}
