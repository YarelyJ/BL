public class Primiti {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numeroByte = "+ numeroByte);
        System.out.println("Tipo byte corresponde en byte a "+ Byte.BYTES);
        System.out.println("Tipo byte corresponde en bIteS a "+ Byte.SIZE);
        System.out.println("Valor máximo de un byte: "+ Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte: "+ Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = "+ numeroShort);
        System.out.println("Tipo short corresponde en byte a "+ Short.BYTES);
        System.out.println("Tipo short corresponde en bIteS a "+ Short.SIZE);
        System.out.println("Valor máximo de un byte: "+ Short.MAX_VALUE);
        System.out.println("Valor mínimo de un byte: "+ Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = "+ numeroInt);
        System.out.println("Tipo int corresponde en byte a "+ Integer.BYTES);
        System.out.println("Tipo int corresponde en bIteS a "+ Integer.SIZE);
        System.out.println("Valor máximo de un byte: "+ Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un byte: "+ Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroInt = "+ numeroLong);
        System.out.println("Tipo long corresponde en byte a "+ Long.BYTES);
        System.out.println("Tipo long corresponde en bIteS a "+ Long.SIZE);
        System.out.println("Valor máximo de un byte: "+ Long.MAX_VALUE);
        System.out.println("Valor mínimo de un byte: "+ Long.MIN_VALUE);

        var numeroVar = 122147483647L;
    }
}
