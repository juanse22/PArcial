import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }
        sc.close();

    }
}
