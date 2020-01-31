package sockettcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author frapi
 */
public class Cliente {

    public static void main(String[] args) {
        try {
            
            Socket socket = new Socket("127.0.0.1", 1100);
            Socket socketArq = new Socket("127.0.0.1", 1100);
            //ServidorConversa sc = new ServidorConversa(socket);
            //sc.start();
             Tela cli =  new Tela(socket, socketArq);
                cli.setVisible(true);
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }

}
