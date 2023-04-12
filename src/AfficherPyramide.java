import java.util.Scanner;

public class AfficherPyramide {
    public static void main(String[] args) {
        Scanner saisieUtilisateur = new Scanner(System.in);

        System.out.println("Veuillez saisir un hauteur :");
        int ent = saisieUtilisateur.nextInt();

            for (int i = 1; i <= ent; ++i) {
                for (int j = 1; j <= i; ++j) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
}

