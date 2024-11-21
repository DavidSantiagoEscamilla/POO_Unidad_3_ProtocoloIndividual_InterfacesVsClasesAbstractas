package Ejercicio3;

public abstract class ClaseAbstracta {
    // Intento de definir un método predeterminado con default
    default void metodoPredeterminado() {
        System.out.println("Este es un método predeterminado.");
    }
    // Esto generará un error de compilación, ya que `default` no está permitido aquí
}
