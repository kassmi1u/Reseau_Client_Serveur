import java.io.*;
import java.net.*;

class ServeurTCP{
    public static void main(String[] args) throws Exception {
      
      ServerSocket socketBienvenue= new ServerSocket(9876);
      while(true){
	Socket socketCliente= socketBienvenue.accept();
        BufferedReader receptionclient= new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
        DataOutputStream emissionversclient= new DataOutputStream(socketCliente.getOutputStream());

        String phraseClient= receptionclient.readLine();
        String CAPITALES= phraseClient.toUpperCase()+'\n';
        emissionversclient.writeBytes(CAPITALES);
      }

    }
}
