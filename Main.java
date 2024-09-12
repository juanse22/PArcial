public class Main {
    public static String verificarMultiplos(int numero1, int numero2) {
        if (numero1 == 0 || numero2 == 0) {
            return "Error: No se puede dividir por cero";
        }

        if (numero1 % numero2 == 0) {
            return numero1 + " es múltiplo de " + numero2;
        } else if (numero2 % numero1 == 0) {
            return numero2 + " es múltiplo de " + numero1;
        } else {
            return "Ninguno de los números es múltiplo del otro";
        }
    }

    public static void main(String[] args) {
        System.out.println(verificarMultiplos(12, 3));
        System.out.println(verificarMultiplos(3, 12));
        System.out.println(verificarMultiplos(7, 3));
        System.out.println(verificarMultiplos(0, 5));
        System.out.println(verificarMultiplos(5, 0));
    }
}