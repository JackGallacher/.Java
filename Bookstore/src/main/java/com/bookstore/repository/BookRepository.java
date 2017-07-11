package com.bookstore.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.bookstore.model.Book;

//@Transactional(Transactional.TxType.SUPPORTS)
//can have this instead of on each function but being explicit here...
public class BookRepository {

	@PersistenceContext(unitName = "bookStorePU")
	private EntityManager em;
	
	
	@Transactional(Transactional.TxType.SUPPORTS)
	public Book find(Long id){
		return em.find(Book.class, id);
	}
	
	@Transactional(Transactional.TxType.REQUIRED)
	public Book create(Book book){
		em.persist(book);
		return book;
	}
	
	@Transactional(Transactional.TxType.REQUIRED)
	public void delete(Long id){
		em.remove(em.getReference(Book.class, id));
	}
	
	@Transactional(Transactional.TxType.SUPPORTS)
	public List<Book> findAll(){
		TypedQuery<Book> query = em.createQuery("SELECT b FROM Book b ORDER BY b.title", Book.class);
		return query.getResultList();
	}
	
	@Transactional(Transactional.TxType.SUPPORTS)
	public Long countAll(){
		TypedQuery<Long> query = em.createQuery("SELECT COUNT(b) FROM Book b", Long.class);
		return query.getSingleResult();
	}	
}

