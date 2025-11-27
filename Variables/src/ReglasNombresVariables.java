public class ReglasNombresVariables {
    public static void main(String[] args) {
        // Reglas de nombres de variables
        String nombreCompleto = "Gian Barboza"; // Correcto y buenas practicas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Gian Barboza 2"; // Correcto, no aplica buenas practicas
        System.out.println("NombreCompleto = " + NombreCompleto);
//        String nombre-completo = "Gian barboza"; // incorrecto
        String nombre_cliente = "gian"; // correcto, no aplica buenas practicas
        String _apellido = "Barboza"; // Correcto y aceptable
        String $apellido = "Barboza"; // Correcto y aceptable
        int totPzs = 10; // Correcto, no aplica buenas practicas
        int totalPiezas = 10; // Correcto,aplica buenas practica
    }
}
