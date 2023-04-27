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
		
		//datos de la cita
		
		System.out.println("ingresar datos de cita:");
		
		System.out.println("ingresar id de cita:");
		 int id_cita = sc.nextInt();
		 
		 System.out.println("ingresar numero de cita:");
		 int num_cita = sc.nextInt();
		 
		 System.out.println("ingresar fecha de cita:");
		 int fecha_cita = sc.nextInt();
		 
		 System.out.println("ingresar nombre del paciente:");
		 int nom_paciente_cita = sc.nextInt();
		 
		 System.out.println("ingresar fecha de cita:");
		id_doctor = sc.nextLine();
		
	}
}
