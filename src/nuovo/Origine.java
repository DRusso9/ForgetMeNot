/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nuovo;

import java.io.Serializable;
import java.sql.SQLException;



/**
 *
 * @author daniele
 */
public class Origine implements Serializable {

    public void setPianta_default(PiantaDefault pianta_default) {
        this.pianta_default = pianta_default;
    }

    public void setLuogo(Luogo luogo) {
        this.luogo = luogo;
    }

    public PiantaDefault getPianta_default() {
        return pianta_default;
    }

    public Luogo getLuogo() {
        return luogo;
    }
    

    public Origine(PiantaDefault pianta_default, Luogo luogo) {
        this.pianta_default = pianta_default;
        this.luogo = luogo;
    }
    
    public void leggiDatidaDB() throws SQLException, ClassNotFoundException, MyException {
        OrigineDAO.load(this);
    }
    
    public void inserisciDatisuDB() throws SQLException, ClassNotFoundException, MyException {
        OrigineDAO.insert(this);
    }
    
    public void aggiornaDatisuDB() throws SQLException, ClassNotFoundException, MyException {
        OrigineDAO.update(this);
    }
    
    public void cancellaDatisuDB() throws SQLException, ClassNotFoundException, MyException {
        OrigineDAO.delete(this);
    }
    
    private PiantaDefault pianta_default;
    private Luogo luogo;
    
           
}
