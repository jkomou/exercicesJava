import java.util.Scanner;

public class NombrePairOuImpair {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Entrez un nombre: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " est un nombre pair");
        else
            System.out.println(num + " est un nombre impair");
    }
}