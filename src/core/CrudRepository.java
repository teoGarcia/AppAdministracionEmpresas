package core;

import javax.persistence.EntityManager;


public interface CrudRepository<T, A> {
	
	public T create(T t);
	
	public Iterable<T> findAll();
	
	public T find(A a);
	
	public T update(T t);
	
	public void delete(T t);
	
	public EntityManager getEm();

	public void setEm(EntityManager em);
	
}
