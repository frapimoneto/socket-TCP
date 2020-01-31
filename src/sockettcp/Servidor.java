package sockettcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author frapi
 */
public class Servidor {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(1100);
            String mensagem = "";
            Scanner leitor = new Scanner(System.in);
            while(true){
                System.out.println("Servidor esperando conexão!");
                Socket socket = server.accept();
                Socket socketArq = server.accept();
                Tela cli =  new Tela(socket, socketArq);
                cli.setVisible(true);
                //ServidorConversa sc = new ServidorConversa(socket);
                //sc.start();
            }
           
        }catch(IOException e){
            System.out.println("Erro: "+ e.getMessage());
        }
        
    }
}
