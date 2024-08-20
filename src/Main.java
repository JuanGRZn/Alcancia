import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int cont = 1;
        int Dado1;
        int Dado2;
        Random aleatorio = new Random();

            while(cont <= 6 ){
                Dado1= aleatorio.nextInt(0,7);
                Dado2= aleatorio.nextInt(0,7);
            if (Dado1 < Dado2) {
                System.out.println("dado 1 =" + Dado1 +" dado 2 = "+ Dado2);

                System.out.println("Gana dado 2");
            }else if (Dado1 > Dado2) {
                System.out.println("dado 1 =" + Dado1 +" dado 2 ="+ Dado2);

                System.out.println("Gana dado 1");

            }
                cont++;

        }

    }
}