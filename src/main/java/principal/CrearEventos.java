package principal;

import modelo.HibernateUtil;
import modelo.dominio.EventoLogin;
import org.hibernate.Session;
import java.util.*;

public class CrearEventos {

	
	public CrearEventos() {}
	
	private void createAndStoreEventoLogin(Long id, String descripcion, Date fecha) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		EventoLogin e = new EventoLogin();
		e.setId(id);
		e.setDescripcion(descripcion);
		e.setFecha(fecha);
		session.save(e);
		session.getTransaction().commit();
		}
		private List listaEventos() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List result = session.createQuery("from EventoLogin").list();
		session.getTransaction().commit();
		return result;
		}
		//Mismo que el de arriba pero sobrecargado
		private void createAndStoreEventoLogin(String descripcion, Date fecha) {
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			EventoLogin e = new EventoLogin();
			e.setDescripcion(descripcion);
			e.setFecha(fecha);
			session.save(e);
			session.getTransaction().commit();
			}
		public static void main(String[] args) {
			CrearEventos e = new CrearEventos();
			System.out.println("Creación de eventos:");
			//e.createAndStoreEventoLogin(1L,"Pepe ha hecho login correctamente", new Date());
			//e.createAndStoreEventoLogin(2L,"Nerea ha intentado hacer login", new Date());
			//e.createAndStoreEventoLogin(3L,"Kepa ha hecho login correctamente", new Date());
			//Las comentan para que no de un error de clave primaria 
			e.createAndStoreEventoLogin("Pepe ha hecho login correctamente", new Date());
			e.createAndStoreEventoLogin("Nerea ha intentado hacer login", new Date());
			e.createAndStoreEventoLogin("Kepa ha hecho login correctamente", new Date());
			System.out.println("Listado de eventos:");
			List eventos = e.listaEventos();
			for (int i = 0; i < eventos.size(); i++) {
			EventoLogin ev = (EventoLogin) eventos.get(i);
			System.out.println("Id: " + ev.getId() + " Descripcion: "
			+ ev.getDescripcion() + " Fecha: " + ev.getFecha());
			}
		}
	
}
