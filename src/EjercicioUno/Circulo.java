package clasesAbstractas.ejercicioUno;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void calcularArea() {
        area = Math.PI * radio * radio;
    }

    @Override
    public void mostrarArea() {
        System.out.println("El área del circulo es " + String.format("%.2f", area));
    }
}
