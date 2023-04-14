import java.util.Scanner;

public class JeuJusteNombre {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int min = 0;
        int max = 100;
        int coups = 0;

        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("Entrez un nombre");
        int nbEntre = reader.nextInt();

        while(nbEntre != random_int) {
            if(nbEntre > random_int){
                System.out.println("Plus petit");
                coups++;
                System.out.println("Vous avez joué " + coups + " coups\n");
            }
            else {
                System.out.println("Plus grand");
                coups++;
                System.out.println("Vous avez joué " + coups + " coups\n");
            }
            System.out.println("Entrez un nombre");
            nbEntre = reader.nextInt();
        }
        System.out.println("Bravo");
    }
}
