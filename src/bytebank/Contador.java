package bytebank;

public class Contador extends Funcionario{

    @Override
    public double getBonificacion() {
        System.out.println("Llamando metodo de contador");
        return super.getBonificacion(); // called a method or attribute from the super class
    }

}
