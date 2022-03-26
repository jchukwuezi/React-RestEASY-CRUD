package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Task;

public class TaskDAO {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JoshuasPU");
	
	public TaskDAO() {
		
	}
	
	//CRUD operations
	public void persistTask(Task t) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}
	
	public Task mergeUser(Task t) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Task aTask = em.merge(t);
		em.getTransaction().commit();
		em.close();
		return t;
	}
	
	public void remove(Task t) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(t)); //updating it before deleting it
		em.getTransaction().commit();
		em.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Task> getAllTasks(){
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
		List<Task> tasks = (ArrayList<Task>) em.createNamedQuery("Task.findAll").getResultList(); 
		em.getTransaction().commit();
		em.close();
		return tasks;
	}
}
