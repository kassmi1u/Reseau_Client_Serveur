import java.net.*;
import java.io.*;
public class URLReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        URL oulal = new URL("http://www.loria.fr/%22");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oulal.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }

}
