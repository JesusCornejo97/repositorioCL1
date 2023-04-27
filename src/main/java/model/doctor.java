package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class doctor implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_doctor")
	private int id_doctor;
	
	@Column(name = "nom_doctor")
	private String nom_doctor;
	
	@Column(name = "especialidad_doctor")
	private String especialidad_doctor;

	public int getId_doctor() {
		return id_doctor;
	}

	public void setId_doctor(int id_doctor) {
		this.id_doctor = id_doctor;
	}

	public String getNom_doctor() {
		return nom_doctor;
	}

	public void setNom_doctor(String nom_doctor) {
		this.nom_doctor = nom_doctor;
	}

	public String getEspecialidad_doctor() {
		return especialidad_doctor;
	}

	public void setEspecialidad_doctor(String especialidad_doctor) {
		this.especialidad_doctor = especialidad_doctor;
	}

	
}
