import java.util.Scanner

        //Juan Andres Garzon Malagon//
        //Ejercicio alcancia//
        //20-08-2024
public class Main {
    public static void main(String[] args) {
        int moneda20 = 0, moneda50 = 0, moneda100 = 0, moneda200 = 0, moneda500 = 0;
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Alcancía");
            System.out.println("1. Agregar moneda");
            System.out.println("2. Contar monedas");
            System.out.println("3. Calcular total");
            System.out.println("4. Romper alcancía");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Valor de la moneda (20, 50, 100, 200, 500): ");
                    int valor = scanner.nextInt();
                    if (valor == 20) moneda20++;
                    else if (valor == 50) moneda50++;
                    else if (valor == 100) moneda100++;
                    else if (valor == 200) moneda200++;
                    else if (valor == 500) moneda500++;
                    else System.out.println("Denominación no válida");
                    break;
                case 2:
                    System.out.println("Monedas de $20: " + moneda20);
                    System.out.println("Monedas de $50: " + moneda50);
                    System.out.println("Monedas de $100: " + moneda100);
                    System.out.println("Monedas de $200: " + moneda200);
                    System.out.println("Monedas de $500: " + moneda500);
                    break;
                case 3:
                    int total = moneda20 * 20 + moneda50 * 50 + moneda100 * 100 + moneda200 * 200 + moneda500 * 500;
                    System.out.println("Total ahorrado: " + total);
                    break;
                case 4:
                    moneda20 = 0;
                    moneda50 = 0;
                    moneda100 = 0;
                    moneda200 = 0;
                    moneda500 = 0;
                    System.out.println("Alcancía vaciada");
                    break;
                case 5:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);
    }
}