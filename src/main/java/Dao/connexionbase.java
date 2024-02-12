package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connexionbase {
	// 	Parametre d'utilisateur
	 String url = "jdbc:mysql://localhost/jee";
    String utilisateur = "root";
    String motDePasse = "";
	  Connection connection = null;
     public Statement st = null;
	public void connect() {
	
         
      
        try {
            // Charger le pilote JDBC (remplacez "mon.driver.jdbc" par le nom du pilote correspondant)
            Class.forName("com.mysql.cj.jdbc.Driver");


            // Établir la connexion
            connection = DriverManager.getConnection(url, utilisateur, motDePasse);
            
            // Creation du Statemtnt
            
            st=connection.createStatement();
            // Effectuer des opérations sur la base de données ici...

      
        } catch (Exception e) {
            e.printStackTrace();
        } 
        
    }
}
