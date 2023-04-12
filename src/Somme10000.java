public class Somme10000 {
    public static void main(String[] args) {
        int nb = 0;
        int nb2 = 0;
        while (nb < 10000){
            nb++;
            nb2 += nb;
            System.out.println(nb2);
        }
    }
}
