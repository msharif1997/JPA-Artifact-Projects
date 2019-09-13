package jpaCars;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.Collection;
import java.util.List;

/*
 * 
 * Mohamed Sharif
 * 9/12/2019
 * 
 */

public class cars {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		carServices services = new carServices(em);
		
		
		// adds Items to DB through carServices
		em.getTransaction().begin();
//		DB emp = services.createCar( "Chevy", "Cruze", 2014);
		em.getTransaction().commit();
//		System.out.println("Persisted " + emp);
		
		//Edits Items 
		em.getTransaction().begin();
//		DB emp = services.EditCars(9, "Nissan", "GTR", 2017);
//		em.persist(emp);
		em.getTransaction().commit();
		
		//Deletes Items
		em.getTransaction().begin();
		DB emv = services.findDB(1);
		em.persist(emv);
		em.getTransaction().commit();
		
//		util.checkData("select * from DB");

		@SuppressWarnings("unchecked")
		Collection<DB> emps = (Collection<DB>) services.findAllCars();
		for(DB e : emps) {
			System.out.println("All Items: " + e);
			
			em.close();
			emf.close();
		}
		
		
//		System.out.println(fetchDB);
//		System.out.println(a);
		
	}
	
	
}
