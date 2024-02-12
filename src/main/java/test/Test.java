package test;
import Dao.connexionbase;
public class Test {
	public static void main(String[] args) {
		connexionbase cb = new connexionbase();
		cb.connect();
	}
}
