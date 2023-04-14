import java.awt.*;
import java.awt.Desktop;
import java.io.*;

public class CreateFileReadWords {
        public static void main(String[] args) throws IOException
        {
            File f1=new File("input.txt"); // Fichier a creer
            String[] words=null;
            int wc=0;
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            String s;
            while((s=br.readLine())!=null)
            {
                words=s.split(" ");
                wc=wc+words.length;
            }
            fr.close();
            System.out.println("Nombre de mots dans le fichier" +wc);
        }
}
