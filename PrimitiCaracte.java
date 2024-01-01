public class PrimitiCaracte {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = "+ caracter);
        System.out.println("decimal = "+ decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = "+ simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        char espacio = ' ';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("Char corresponde en byte a:"+ espacio + Character.BYTES);
        System.out.println("Char corresponde en biteS a:"+ retroceso + Character.SIZE);
        System.out.println("Character.MAX_VALUE: "+ tabulador + Character.MAX_VALUE);
        System.out.println("Character.MIN_VALUE: "+ nuevaLinea + Character.MIN_VALUE);
        System.out.println("Char corresponde en byte a: "+ retornoCarro + Character.BYTES);
        System.out.println("Char corresponde en biteS a: "+ System.getProperty("linea.separador") + Character.SIZE);

        var carac = '\u0040';
        var decima = 64;
        System.out.println("carac = "+ carac);
    }
}
