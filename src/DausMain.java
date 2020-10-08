import java.util.Random;
import java.util.Scanner;


public class DausMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el numero de vegades ques vols llençar ");
        int numeroTirades = sc.nextInt();
        int probabilidad [] = new int [11];
        for(int i=0; i<numeroTirades; i++){
            Random r = new Random();
            int dado1 = (int)(Math.random()*6+1);
            int dado2 = (int)(Math.random()*6+1);
            int dadoFinal = dado1 + dado2;
            int posicion = dadoFinal;
                probabilidad[posicion-2]++;
        }
        int posicion = 0;
        for(int i=2; i<=12; i++){
            System.out.print(i+ " -->   ");
                System.out.print(probabilidad[posicion] +" vegades");
                System.out.println();
                posicion++;

        }

    }
}
