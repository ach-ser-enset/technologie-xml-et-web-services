/**
 * @author Achraf SERHANI
 * @date 12/21/24
 */

package ws;
import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String host = "http://0.0.0.0:8000/";
        Endpoint.publish(host, new BanqueService());
        System.out.println("Web Service Deployé sur " + host);
    }
}
