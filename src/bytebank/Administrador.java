package bytebank;

public class Administrador extends Funcionario{

    private String clave;

    public Administrador() {
    }

    @Override
    public double getBonificacion() {
        return this.getSalario();
    }
}
