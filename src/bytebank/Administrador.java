package bytebank;

import controller.Autenticable;
import controller.AutenticableUtil;

public class Administrador extends Funcionario implements Autenticable {

    private AutenticableUtil util;

    public Administrador() {
        this.util = new AutenticableUtil();
    }

    @Override
    public double getBonificacion() {
        return this.getSalario();
    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }
}
