package modelo.dominio;


import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class EventoLogin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //El SGBD genera automaticamente el id para las tuplas, ya que sino tendriamos que hacerlo manualmente
	private Long id;
	private String descripcion;
	private Date fecha;
	public EventoLogin() {}
	public Long getId() {
	return id;
	}
	public void setId(Long id) {
	this.id = id;
	}
	public String getDescripcion() {
	return descripcion;
	}
	public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
	}
	public Date getFecha() {
	return fecha;
	}
	public void setFecha(Date fecha) {
	this.fecha = fecha;
	}
}
