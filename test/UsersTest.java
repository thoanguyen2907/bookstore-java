import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.bookstore.entity.Users;

public class UsersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Users user1 = new Users(); 
		user1.setEmail("truc@codejava.net");
		user1.setFullname("Truc Nguyen");
		user1.setPassword("123123");
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("BookStoreWebsite"); 
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(user1);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		System.out.println("A User object was persisted !");
	}

}
