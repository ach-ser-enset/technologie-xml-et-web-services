/**
 * @author Achraf SERHANI
 * @date 12/21/24
 */

package ws;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "ConversionEuroToMad")
    public double conversion(@WebParam(name = "Montant") double mt) {
        return mt * 11;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "Code") int code){
        return new Compte(code, Math.random()*6500, new Date());
    }

    @WebMethod
    public List<Compte> listeComptes(){
        return List.of(
                new Compte(1, Math.random()*6500, new Date()),
                new Compte(2, Math.random()*6500, new Date()),
                new Compte(3, Math.random()*6500, new Date()),
                new Compte(4, Math.random()*6500, new Date())
        );
    }

}
