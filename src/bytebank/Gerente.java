package bytebank;

public class Gerente extends Funcionario{

    private String clave;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public double getBonificacion() {
        System.out.println("LLamando metodo del Gerente");
        return super.getBonificacion() + super.getSalario();
    }

    public boolean iniciarSesion(String clave) {
        return this.clave.equals(clave);
    }
}
