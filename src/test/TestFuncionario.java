package test;

import bytebank.Funcionario;

public class TestFuncionario {

    public static void main(String[] args) {
        Funcionario jimmy = new Funcionario();
        jimmy.setDocumento("62257804");
        jimmy.setSalario(15000);
        jimmy.setTipo(0);

        System.out.println(jimmy.getSalario());
        System.out.println(jimmy.getBonificacion());
    }

}
