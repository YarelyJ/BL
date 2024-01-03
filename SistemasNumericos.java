public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = "+ numeroDecimal);
        System.out.println("Número binario de "+numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println("Número octal de " + numeroBinario + " = " +Integer.toBinaryString(numeroBinario));

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);
        System.out.println("Número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        int numeroHex = 0X1F4;
        System.out.println("numeroHex = " + numeroHex);
    }
}
