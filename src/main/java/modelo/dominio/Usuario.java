package modelo.dominio;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario {
	
	@Id
	private String nombre;
	private String password;
	private String tipo;
	@OneToMany(targetEntity=EventoLogin.class, mappedBy="usuario",
			cascade= {CascadeType.REMOVE,CascadeType.PERSIST}, fetch=FetchType.EAGER)	
	private Set<EventoLogin> eventos;
	public Usuario(){}
	public String getTipo() {
	return tipo; }
	public void setTipo(String tipo) {
	this.tipo = tipo; }
	public String getNombre() {
	return nombre; }
	public void setNombre(String nombre) {
	this.nombre = nombre; }
	public String getPassword() {
	return password; }
	public void setPassword(String password) {
	this.password = password; }
	
	public String toString() { // Usuario
		return nombre+"/"+password+"/"+tipo;
		}
	
	
	public void setEventos(Set<EventoLogin> eventos) {
	this.eventos = eventos;
	}
	public Set<EventoLogin> getEventos() {
		// TODO Auto-generated method stub
		return eventos;
	}
	}
	

