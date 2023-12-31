public class Caracte {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = "+ caracter);
        System.out.println("decimal = "+ decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = "+ simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        var carac = '\u0040';
        var decima = 64;
        System.out.println("carac = "+ carac);

        System.out.println("Char corresponde en byte a:  "+ Character.BYTES);
        System.out.println("Char corresponde en biteS a: "+ Character.SIZE);
        System.out.println("Character.MAX_VALUE: "+ Character.MAX_VALUE);
        System.out.println("Character.MIN_VALUE: "+ Character.MIN_VALUE);
    }
}
