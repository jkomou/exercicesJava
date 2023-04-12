public class Main {
    public static void main(String[] args) {
        String mot = "Bonjour";
        StringBuilder sb = new StringBuilder();

        sb.append(mot);
        sb.reverse();

        System.out.println(sb);
    }
}