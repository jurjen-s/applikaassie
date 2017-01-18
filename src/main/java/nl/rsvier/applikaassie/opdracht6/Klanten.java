/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht6;

/**
 *
 * @author Frank
 */
public class Klanten {
    
   
   private String Voornaam;
   private String Tussenvoegsel;
   private String Achternaam;
   private int Telefoonnummer;
   private int Klant_id;
   
  
   public void SetAll(String voornaam,String tussenvoegsel,String achternaam , int telefoonnr, int klantid  ){
      this.Voornaam = voornaam;
      this.Tussenvoegsel = tussenvoegsel;
      this.Achternaam = achternaam;
      this.Telefoonnummer = telefoonnr;
      this.Klant_id = klantid;
   }
   
   public void GiveAll () {
       System.out.println(this.Voornaam);
       System.out.println(this.Tussenvoegsel);
       System.out.println(this.Achternaam);
       System.out.println(this.Telefoonnummer);
   }
   
   
   

   public String getVoornaam() {
      return Voornaam;
   }

   public void setVoornaam(String name) {
      this.Voornaam = name;
   }

   public String getTussenvoegsel() {
      return Tussenvoegsel;
   }

   
   public void setTussenvoegsel(String tussenv) {
       this.Tussenvoegsel = tussenv;
   }
   
   public String getAchternaam() {
      return Achternaam;
   }

   
   public void setAchternaam(String achternaam) {
       this.Achternaam = achternaam;
   }
   
   
   public int getTelefoonnummer(){
       return Telefoonnummer;
   }
   
   
      
   public void setTelefoonnummer(int nr) {
      this.Telefoonnummer = nr;
   }
   
   public int getKlant_id(){
       
       return Klant_id;
   }
   
  //er komt geen set klant_id?? Dit wordt nooit aangepast?
   
   
}
    
    
    
    
    
