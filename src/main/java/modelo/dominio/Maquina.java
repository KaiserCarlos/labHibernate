package modelo.dominio;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
@Entity
public class Maquina {
	
	@Id
	private int codigo;
	private String nombre;
	@ManyToMany
	private Set<Usuario> usuarios;
	public int getCodigo() {
	return codigo;
	}
	public void setCodigo(int codigo) {
	this.codigo = codigo;
	}
	public String getNombre() {
	return nombre;
	}
	public void setNombre(String nombre) {
	this.nombre = nombre;
	}
	public Set<Usuario> getUsuarios() {
	return usuarios;
	}
	public void setUsuarios(Set<Usuario> usuarios) {
	this.usuarios = usuarios;
	}
	
}
