package core;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class CrudRepositoryJPA<T, A> implements CrudRepository<T, A> {

	protected EntityManager em;
	protected Class<T> type;

	public CrudRepositoryJPA() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class) pt.getActualTypeArguments()[0];
	}

	@Override
	public T create(T t) {
		try {
			em.getTransaction().begin();
			em.persist(t);
			em.getTransaction().commit();
			return t;
		} catch (Exception e) {
			System.out.print("Create: " + e);
			return null;
		}

	}

	@Override
	public Iterable<T> findAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(type);
		Root<T> root = cq.from(type);
		cq.select(root);
		TypedQuery<T> query = em.createQuery(cq);
		return query.getResultList();
	}

	@Override
	public T find(A id) {
		return (T) em.find(type, id);
	}

	@Override
	public T update(T t) {
		try {
			em.getTransaction().begin();
			T result = em.merge(t);
			em.getTransaction().commit();
			return result;
		} catch (Exception e) {
			System.out.print("Update: " + e);
			return null;
		}
	}

	@Override
	public void delete(T t) {
		try {
			em.getTransaction().begin();
			em.remove(em.merge(t));
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.print("Delete: " + e);
		}

	}

	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}

}
