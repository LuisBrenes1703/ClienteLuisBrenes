package tarearedescliente;

import java.io.IOException;

public class TareaRedesCliente {

    public static void main(String[] args) throws IOException {
        Cliente client = new Cliente();      
        client.startConnection("127.0.0.1", 6666);
        String response = client.sendMessage("hello server");
        System.out.println(response);
        client.finalizar();
     
        System.out.println("conexion cerrada");
    }

}
