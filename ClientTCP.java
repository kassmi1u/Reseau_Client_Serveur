import java.io.*;
import java.net.*;

class ClientTCP{
  
  public static void main(String[] args) throws Exception {
    BufferedReader lectureLocale= new BufferedReader(new InputStreamReader(System.in));
    Socket socketCliente= new Socket("192.168.40.204",9876);
    DataOutputStream emissionserveur= new DataOutputStream(socketCliente.getOutputStream());
    BufferedReader receptionserveur= new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
    String Phrase= lectureLocale.readLine();
    emissionserveur.writeBytes(Phrase+'\n');
    String reponse= receptionserveur.readLine();
    System.out.println("from server : "+ reponse);
    socketCliente.close();

  }
}
