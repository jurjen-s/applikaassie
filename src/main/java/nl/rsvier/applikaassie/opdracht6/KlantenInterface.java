/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht6;
import java.util.List;
/**
 *
 * @author Frank
 */
public interface KlantenInterface {
    //DAO
    

   public List<Klanten> getAllKlanten();
   
   public Klanten getKlanten(int Klant_id);
   
   public void updateKlanten( Klanten klant);
   
   //public void deleteStudent(Klant klant);
   
   
}
    