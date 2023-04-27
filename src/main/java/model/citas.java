package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "citas")
public class citas implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cita")
	private int id_cita;
	
	@Column(name = "num_cita")
	private int num_cita;
	
	@Column(name ="fecha_cita")
	private String fecha_cita;
	
	@Column(name ="nom_paciente_cita")
	private String nom_paciente_cita;
	
	@Column(name = "id_doctor")
	private int id_doctor;

	public int getId_cita() {
		return id_cita;
	}

	public void setId_cita(int id_cita) {
		this.id_cita = id_cita;
	}

	public int getNum_cita() {
		return num_cita;
	}

	public void setNum_cita(int num_cita) {
		this.num_cita = num_cita;
	}

	public String getFecha_cita() {
		return fecha_cita;
	}

	public void setFecha_cita(String fecha_cita) {
		this.fecha_cita = fecha_cita;
	}

	public String getNom_paciente_cita() {
		return nom_paciente_cita;
	}

	public void setNom_paciente_cita(String nom_paciente_cita) {
		this.nom_paciente_cita = nom_paciente_cita;
	}

	public int getId_doctor() {
		return id_doctor;
	}

	public void setId_doctor(int id_doctor) {
		this.id_doctor = id_doctor;
	}
	
	
}
