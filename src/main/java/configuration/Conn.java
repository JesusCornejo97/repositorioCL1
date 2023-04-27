package configuration;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Conn {
	private static Conn instancia = new Conn();
	private EntityManagerFactory factory;
	
	public Conn() {
		this.factory = Persistence.createEntityManagerFactory("CL1_CornejoCancinoJesus");
	}
	
	public static Conn getInstancia() {
		return instancia;
	}
	
	public EntityManagerFactory getFactory() {
		return factory;
	}
}
