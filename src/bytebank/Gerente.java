package bytebank;

public class Gerente extends Funcionario{

    private String clave;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave) {
        return this.clave.equals(clave);
    }
}
