import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Ingrese un numero");
        num1 = scanner.nextInt();

        System.out.println("Ingrese otro numero");
        num2 = scanner.nextInt();

        int suma = num1+num2;
        int resta = num1-num2;
        double div = num1/num2;
        int prod = num1*num2;

        System.out.print("Suma: "+suma+" - Resta: "+resta+" - División: "+div+" - Multiplicación: "+prod);
    }
}