package service;

import java.sql.ResultSet;
import java.sql.SQLException;

import Dao.connexionbase;
import entity.user;

public class TraitementUser {
	public void Ajouter(user u) {
		// Connexion a la base de donnee
		connexionbase cb = new connexionbase();
		cb.connect();
		
		//Requete sql
		String rec = "insert into user(prenom,nom,mail,password) values('"+u.getPrenom()+"','"+u.getNom()+"','"+u.getEmail()+"','"+u.getPassword()+"')";
		
		// Statement
		try {
			cb.st.executeUpdate(rec);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Modifier(user u) {
		// Conneion bd
		connexionbase cb = new connexionbase();
		cb.connect();
		
		// Requete sql
		String rec = "update user set prenom='"+u.getPrenom()+"','"+u.getNom()+"','"+u.getEmail()+"','"+u.getPassword()+"' where id='"+u.getId()+"' ";
		
		// Statement
		try {
			cb.st.executeUpdate(rec);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Supprimer(int id) {
		// Conneion cb
		connexionbase cb = new connexionbase();
		cb.connect();
		
		// Requete sql
		String rec = "delete from user where id='"+id+"' ";
		
		//Statement
		try {
			cb.st.executeQuery(rec);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public user TestLogin(String mail,String password) {
		user u = null;
		
		ResultSet rs = null;
		// Conneion bd
		connexionbase cb = new connexionbase();
		cb.connect();
		
		// Requete sql
		String rec = "Select * from user where mail='"+mail+"'and password='"+password+"'";
		
		//Statement
		try {
			rs=cb.st.executeQuery(rec);
		     while(rs.next()) {
		    	int id= rs.getInt("id");
		    	String prenom=rs.getString("prenom");
		    	String nom=rs.getString("nom");
		    	String email=rs.getString("mail");
		    	String pass=rs.getString("password");
		    	u=new user(id,prenom,nom,email,pass);
		     }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
}
