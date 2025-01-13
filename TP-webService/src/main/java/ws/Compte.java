/**
 * @author Achraf SERHANI
 * @date 12/21/24
 */

package ws;
import java.util.Date;

public class Compte {
    private int code;
    private double solde;
    private Date dateCreation;

    // Constructors
    public Compte() {
    }
    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    // Getters
    public int getCode() {
        return code;
    }
    public double getSolde() {
        return solde;
    }
    public Date getDateCreation() {
        return dateCreation;
    }

    //Setters
    public void setCode(int code) {
        this.code = code;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }


   }
