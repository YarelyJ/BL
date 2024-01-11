import java.util.InputMismatchException;
import java.util.Scanner;
public class SistemasEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número entero:");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try{
            numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr);
        }catch (Exception e) {
            System.out.println("Error debe ingresar un número entero!");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = "+ numeroDecimal);
        String resultadoBinario = "Número binario de "+numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHexa = "Número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexa;
        System.out.println(mensaje);
    }
}
