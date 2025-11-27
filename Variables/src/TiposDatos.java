public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de datos en JAVA
        // Enteros (Su valor default es 0)
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321098765432L; //  L o l para indicar tipo long
        System.out.println("tipoLong = " + tipoLong);
        
        // Puntos flotante (su valor default es 0.0)
        float tipoFloat = 3.14F;// F o f para indicar que es tipo float
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315D; // Do d para indicar tipo double (opcional)
        System.out.println("tipoDouble = " + tipoDouble);

        //Caracter (su valor default es '\u0000')
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        // Boolean (Default false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Tipo object o referencia
        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre = "Gian Barboza";
        System.out.println("nombre = " + nombre);
        
    }
}
