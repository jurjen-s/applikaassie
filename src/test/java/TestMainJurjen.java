/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jurjen
 */
public class TestMainJurjen {
	public static Connection connection = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Probeer verbinding te maken met de db
        openConnection(); // Alleen voor testen, later moet elke methode zelf connectie maken en sluiten
        // Laat hoofdmenu zien
        Menu.showHoofdMenu();
    }
    public static void openConnection() {
    	try {
            // Load the driver
            Class.forName("com.mysql.jdbc.Driver");
            // Define host and username/password
            String host = "jdbc:mysql://localhost/mydb";
            String userName = "admin";
            String userPass = "admin";
            // Establish connection
            Connection connection = DriverManager.getConnection(host, userName, userPass);
    	} catch (ClassNotFoundException | SQLException ex) {
    		ex.getMessage();
    	}
    }
    
static class Menu {
	public static void showHoofdMenu() {
    	int keuze = 0;
        do {
        System.out.println("=========================");
        System.out.println("Welkom."); 					//+ (userName)); //userName nog ophalen
        System.out.println("-------------------------");
        System.out.println("1: Doorzoek producten.");
        System.out.println("2: Voeg nieuw product toe.");
        System.out.println("3: Verwijder product.");
        System.out.println("4: Pas product aan.");
        System.out.println("5: Afsluiten.");
        System.out.println("=========================");
        System.out.println("Geef uw keuze: ");
        keuze = Integer.parseInt(System.console().readLine());
        // Laat volgende menu zien afhankelijk van keuze
        	switch (keuze) {
        		case 1:
                    showDoorzoekenMenu();
                    break;
            	case 2:
                    showToevoegenMenu();
                    break;
            	case 3:
            		showVerwijderenMenu();
            		break;
            	case 4:
            		showAanpassenMenu();
            		break;        
            	case 5:
            		System.out.println("Tot ziens.");
            		System.exit(0);
            		break;
            	default:
            		System.out.println("Ongeldige invoer.");
            		break;
        	}
		} while (keuze != 5);
}

	private static void showDoorzoekenMenu() {
    	int keuze1 = 0;
    	do {
        	System.out.println("=========================");
        	System.out.println("Doorzoek producten");
        	System.out.println("-------------------------");
        	System.out.println("1: Doorzoek op productID.)"); 
        	System.out.println("2: Doorzoek op soort.");
        	System.out.println("3: Doorzoek op prijs.");
        	System.out.println("4: Doorzoek op voorraad.");
        	System.out.println("5: Terug naar hoofdmenu.");
        	System.out.println("=========================");
        	System.out.println("Geef uw keuze: ");
        	keuze1 = Integer.parseInt(System.console().readLine());
    	} while (keuze1 != 5);
    		// Laat volgende menu zien afhankelijk van keuze
        	switch (keuze1) {
            	case 1:
					System.out.println("=========================");
                	System.out.println("Doorzoek op productID");
                	System.out.println("-------------------------");
                	System.out.println("Geef het productID op: ");
                	int productID = Integer.parseInt(System.console().readLine());
                	try {
                		Test.openConnection();
                    	PreparedStatement stmt = connection.prepareStatement(
                        	"SELECT * " +
                        	" FROM producten " +
                        	" WHERE producten_id = ?");
                    	stmt.setInt(1, productID);
                    	ResultSet rs = stmt.executeQuery();
                    	// Laat alle producten met het opgegeven productID zien
                    	while (rs.next()) {
                    		System.out.println(rs.getString(1)); // productID
                    		System.out.println(rs.getString(2)); // omschrijving
                    		System.out.println(rs.getString(3)); // soort
                    		System.out.println(rs.getString(4)); // prijs
                    		System.out.println(rs.getString(5)); // voorraad
                    	}
                	} catch (SQLException ex) {
                		ex.getMessage();
                	}  
                	break; // einde case 1
            	case 2:
                	System.out.println("=========================");
                	System.out.println("Doorzoek op soort");
                	System.out.println("-------------------------");
                	System.out.println("Geef het soort op: ");
                	String soort = System.console().readLine();
                	try {
                    	PreparedStatement stmt = connection.prepareStatement(
                        	"SELECT soort, prijs, voorraad " +
                        	" FROM producten " +
                        	" WHERE soort = ?");
                    	stmt.setString(1, soort);
                    	ResultSet rs = stmt.executeQuery();
                    	// Laat alle producten met het opgegeven productID zien
                    	while (rs.next()) {
                    		System.out.println(rs.getString(1)); // productID
                    		System.out.println(rs.getString(2)); // omschrijving
                    		System.out.println(rs.getString(3)); // soort
                    		System.out.println(rs.getString(4)); // prijs
                    		System.out.println(rs.getString(5)); // voorraad
                    	}
                	} catch (SQLException ex) {
                		ex.getMessage();
                	}  
                	break; // einde case 2
            	case 3:
                	System.out.println("=========================");
                	System.out.println("Doorzoek op prijs");
                	System.out.println("-------------------------");
                	System.out.println("Geef de prijs op: ");
                	String prijs = System.console().readLine();
                	try {
                    	PreparedStatement stmt = connection.prepareStatement(
                        	"SELECT soort, prijs, voorraad " +
                        	" FROM producten " +
                        	" WHERE soort = ?");
                    	stmt.setString(1, prijs);
                    	ResultSet rs = stmt.executeQuery();
                    	// Laat alle producten met de opgegeven prijs zien
                    	while (rs.next()) {
                    		System.out.println(rs.getString(1)); // productID
                    		System.out.println(rs.getString(2)); // omschrijving
                    		System.out.println(rs.getString(3)); // soort
                    		System.out.println(rs.getString(4)); // prijs
                    		System.out.println(rs.getString(5)); // voorraad
                    	}
                	} catch (SQLException ex) {
                		ex.getMessage();
                	}  
                	break; // einde case 3
            	case 4:
                	System.out.println("=========================");
                	System.out.println("Doorzoek op voorraad");
                	System.out.println("-------------------------");
                	System.out.println("Geef de voorraad op: ");
                	String voorraad = System.console().readLine();
                	try {
                    	PreparedStatement stmt = connection.prepareStatement(
                        	"SELECT soort, prijs, voorraad " +
                        	" FROM producten " +
                        	" WHERE soort = ?");
                    	stmt.setString(1, voorraad);
                    	ResultSet rs = stmt.executeQuery();
                    	// Laat alle producten met de opgegeven voorraad zien
                    	while (rs.next()) {
                    		System.out.println(rs.getString(1)); // productID
                    		System.out.println(rs.getString(2)); // omschrijving
                    		System.out.println(rs.getString(3)); // soort
                    		System.out.println(rs.getString(4)); // prijs
                    		System.out.println(rs.getString(5)); // voorraad
                    	}
                	} catch (SQLException ex) {
                		ex.getMessage();
                	} 
                	break; // einde case 4
            	case 5:
            		showHoofdMenu();
            		break;
            	default:
            		System.out.println("Ongeldige invoer.");
            		break;
        } // einde switch
} // einde showDoorzoekMenu
        
	private static void showToevoegenMenu() {
		System.out.println("==========================");
	    System.out.println("Voeg nieuwe producten toe.");
	    System.out.println("--------------------------");
	    System.out.println("Wat is de omschrijving?");
	    String omschrijving = System.console().readLine();
	    System.out.println("Wat is de soort?");
	    String soort = System.console().readLine();
	    System.out.println("Wat is de prijs?");
	    BigDecimal prijs = new BigDecimal(System.console().readLine());
	    System.out.println("Wat is de voorraad");
	    int voorraad = Integer.parseInt(System.console().readLine());
	    // Voeg de gegevens toe aan de tabel Producten
	      	int productID = Integer.parseInt(System.console().readLine());
	       	try {
	       		PreparedStatement stmt = connection.prepareStatement(
	              	"INSERT into Producten (omschrijving, soort, prijs, voorraad) "+
	               	"VALUES (?, ?, ?, ?)");
				stmt.setString(1, omschrijving);
	            stmt.setString(2, soort);
	            stmt.setBigDecimal(3, prijs);
	            stmt.setInt(4, voorraad);
	            stmt.executeUpdate();
			} catch (SQLException ex) {
	       			ex.getMessage();
			}
		System.out.print("Wilt u nog een product toevoegen? Ja/Nee\n" +
						 "\"Nee\" keert terug naar het hoofdmenu.");
		if (System.console().readLine().equalsIgnoreCase("ja")) {
			showToevoegenMenu();
		} else if (System.console().readLine().equalsIgnoreCase("nee")) {
			showHoofdMenu();
		} else {
			System.out.println("Ongeldige invoer.");
		}
	} // einde showToevoegenMenu
	
	private static void showVerwijderenMenu() {
		System.out.println("==========================");
	    System.out.println("Verwijder producten.");
	    System.out.println("--------------------------");
	    System.out.println("Wat is de soort van het te verwijderen product?");
	    String verwijderProduct = System.console().readLine();
	    try {
	    	PreparedStatement stmt = connection.prepareStatement(
	    		"DELETE FROM Producten" +
	    		"WHERE soort = ?");
	    	stmt.setString(1, verwijderProduct);
	    	stmt.executeUpdate();
	    } catch (SQLException ex) {
	    	ex.getMessage();
	    }
	    System.out.print("Wilt u nog een product toevoegen? Ja/Nee\n" +
				 "\"Nee\" keert terug naar het hoofdmenu.");
		if (System.console().readLine().equalsIgnoreCase("ja")) {
			showVerwijderenMenu();
		} else if (System.console().readLine().equalsIgnoreCase("nee")) {
			showHoofdMenu();
		} else {
			System.out.println("Ongeldige invoer.");
		}
	} // einde showVerwijderenMenu
	
	private static void	showAanpassenMenu() {
		System.out.println("==========================");
	    System.out.println("Pas producten aan.");
	    System.out.println("--------------------------");
	    // volgorde van kolommen: product_id, omschrijving, soort, prijs, voorraad
	    System.out.println("Wat is de soort van het aan te passen product?");
	    String aanpassenProduct = System.console().readLine();
	    System.out.println("Welke eigenschap (omschrijving, soort, prijs, voorraad) wilt u aanpassen?\n" +
	    				   "Omschrijving, soort, prijs of voorraad?");
	    String kolomnaam = System.console().readLine();
	    // Haal huidige waarde van de genoemde eigenschap op
	    String huidigeWaarde = "";
	    try {     
		    PreparedStatement stmt = connection.prepareStatement(
		    	"SELECT ?" +
		    	"FROM Producten" +
		    	"WHERE soort = ?");
		    stmt.setString(1, kolomnaam.toLowerCase());
		    stmt.setString(2, aanpassenProduct);
		    ResultSet rs = stmt.executeQuery();
		    while (rs.next()) {
		    	huidigeWaarde = rs.getString(kolomnaam);
		    }
	    } catch (SQLException ex) {
	    	ex.getMessage();
	    }
	    // Vraag wat nieuwe waarde wordt
	    System.out.println("De huidige waarde van " + aanpassenProduct + " is " + huidigeWaarde + ".\n" +
	    				   "Wat wordt de nieuwe waarde?");
	    String nieuweWaarde = System.console().readLine();
	    	try {
	    	   	PreparedStatement stmt = connection.prepareStatement(
	    	   		"UPDATE Producten" +
	    	   		"SET ? = ?" +
	    	   		"WHERE soort = ?");
	    	   		stmt.setString(1, kolomnaam);
	    	   		stmt.setString(2, nieuweWaarde);
	    	    	stmt.setString(3, aanpassenProduct);
	    	    	stmt.executeUpdate();
	    	} catch (SQLException ex) {
	    	    	ex.getMessage();
	    	}
	} // einde showAanpassenMenu

} // einde Menu

} // einde programma