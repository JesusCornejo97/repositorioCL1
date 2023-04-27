package main;

import java.util.Scanner;

import javax.persistence.EntityManager;

import configuration.Conn;

public class main {
	public static void main(String[] args) {
		
		
		EntityManager em = Conn.getInstancia().getFactory().createEntityManager();
				
		Scanner sc = new Scanner(System.in);
		
		// datos del primer doctor
		
		System.out.println("ingresar ID de Doctor:");
		
		String id_doctor = sc.nextLine();
		
		System.out.println("ingresar nombre de Doctor:");
		
		String nom_doctor = sc.nextLine();
		
		System.out.println("ingresar especialidad de Doctor:");
		
		String especialidad_doctor = sc.nextLine();
		//datos del 2 doctor
		
		
	}
}
