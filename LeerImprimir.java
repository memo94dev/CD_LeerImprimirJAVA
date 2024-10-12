import java.util.Scanner;

public class LeerImprimir {
    public static void main(String[] args) {
        System.out.println("Por favor ingresa dos valores para las variables mes y dia para realizar los ejercicios.");
        Scanner scanner = new Scanner(System.in);
        int suma, resta, multiplicacion, division;
        System.out.print("Ingresa el numero de tu mes de nacimiento: ");
        int a = scanner.nextInt();
        System.out.print("Ingresa el numero del dia en que naciste: ");
        int b = scanner.nextInt();

        suma = a + b;
        resta = a - b;
        multiplicacion = a * b;
        division = a / b;
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la division es: " + division);
    }
}