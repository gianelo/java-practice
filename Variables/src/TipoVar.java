public class TipoVar {
    public static void main(String[] args) {
        // sin el uso de var
        String nombre1 = "gian";
        System.out.println("nombre1 = " + nombre1);
        // con el uso de var
        var nombre2 = "gian";
        System.out.println("nombre2 = " + nombre2);
        // Definir otras variables
        var edad = 33;
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F; // se refiere a tipo float
        var esCasado = true;
//        esCasado = "NO"; Mo podemos asignar un tipo diferente que el inicializado

        // Se puede definir su valor
//        var precio; Esto lanza un error, tenemos que asignar un valor
//        precio = 10;

        // Se puede infere el tipo de dato.
//        var apellido = null; No se puede inferir el tipo de dato
    }
}
