/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht6;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Frank
 */
public class KlantenDAOimpl implements KlantenInterface {

    
    List<Klanten> klanten;
    
    
    
    
    @Override
    public List<Klanten> getAllKlanten() {
        
        return klanten;
    }

    @Override
    public Klanten getKlanten(int Klant_id) {
        return klanten.get(Klant_id);
    }

    @Override
    public void updateKlanten(Klanten klant) {
       // klanten.get(klanten.get(Klant_id());
        //klanten.set(klant.get(Klant_id(),setVoornaam(klant.getVoornaam());
       klanten.get(klant.getKlant_id()).setVoornaam(klant.getVoornaam());
        klanten.get(klant.getKlant_id()).setTussenvoegsel(klant.getTussenvoegsel());
         klanten.get(klant.getKlant_id()).setAchternaam(klant.getAchternaam());
          klanten.get(klant.getKlant_id()).setTelefoonnummer(klant.getTelefoonnummer());
        System.out.println("klant met klant_id : nr "+klant.getKlant_id()+ "is geupdated in the database");
        
    }

   

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
