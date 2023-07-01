package test;

import bytebank.Contador;
import bytebank.Funcionario;
import bytebank.Gerente;
import controller.ControlBonificacion;
public class TestControlBonificacion {

    public static void main(String[] args) {
        Funcionario diego = new Funcionario();
        diego.setSalario(2000.0);

        Gerente jimmy = new Gerente();
        jimmy.setSalario(10000.0);

        Contador lol = new Contador();
        lol.setSalario(5000.0);

        ControlBonificacion controlbonificacion = new ControlBonificacion();

        controlbonificacion.registrarSalario(diego);
        controlbonificacion.registrarSalario(jimmy);
        controlbonificacion.registrarSalario(lol);
    }

}
