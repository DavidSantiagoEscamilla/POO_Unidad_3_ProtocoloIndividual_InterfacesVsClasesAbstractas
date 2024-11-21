package EjercicioUno;

public class Main {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(8);

        rectangulo.calcularArea();
        rectangulo.mostrarArea();

        Figura circulo = new Circulo(12);

        circulo.calcularArea();
        circulo.mostrarArea();
    }
}
