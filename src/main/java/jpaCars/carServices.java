package jpaCars;

import javax.management.Query;
import javax.persistence.EntityManager;

import org.hibernate.Session;

import java.util.Collection;




public class carServices {
	protected EntityManager em;

	public carServices(EntityManager em) {
	    this.em = em;
	  }
	
	//Adds new Items in the DB
	public DB createCar(String make, String model, int year) {
		DB emp = new DB();
	    emp.setMake(make);
	    emp.setModel(model);
	    emp.setYear(year);
	    em.persist(emp);
	    return emp;
	  }
	
	 Session session = null;
	
	//Finds the ID and deletes
	 public void removeDB(int id) {
		    DB emp = findDB(id);
		    session.remove(emp);
		    System.out.println("Customer 4 is removed");
		  }
	 
	 // Edits the Table
	 public DB EditCars(int id, String make, String model, int year) {
		    DB emp = em.find(DB.class, id);
		    if (emp != null) {
		      emp.setMake(emp.getMake() + make);
		      emp.setModel(emp.getModel() + model);
		      emp.setYear(emp.getYear() + year);
		    }
		    return emp;
		  }
	 
	 //Finds the ID for the Delete
	 public DB findDB(int id) {
		    return em.find(DB.class, id);
		  }
	 
	 //Finds all the Items in the DB 
	 @SuppressWarnings("unchecked")
	public Collection<DB> findAllCars() {
		    javax.persistence.Query query = em.createQuery("SELECT e FROM DB e");
		    return (Collection<DB>) query.getResultList();
		  }
}

