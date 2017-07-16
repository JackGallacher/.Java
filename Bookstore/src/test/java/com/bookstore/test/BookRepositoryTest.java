package com.bookstore.test;

import static org.junit.Assert.*;

import java.sql.Date;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;

import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.bookstore.model.Book;
import com.bookstore.model.Language;
import com.bookstore.repository.BookRepository;
import com.bookstore.util.IsbnGenerator;
import com.bookstore.util.NumberGenerator;
import com.bookstore.util.TextUtil;

@RunWith(Arquillian.class)
public class BookRepositoryTest {

	@Inject
	private BookRepository bookRepository;
	
	@Test(expected = Exception.class)
	public void findBookWithInvalidID() {
		bookRepository.find(null);
	}
	
	@Test(expected = Exception.class)
	public void createInvalidBook() {
		@SuppressWarnings("deprecation")
		Book book = new Book(null, "description", 10.0f, "isbn", new Date(12, 12, 12), 500, "imageURL" ,Language.ENGLISH);
		book = bookRepository.create(book);
	}
	
	@Test
	public void create() throws Exception {
		//test counting books.
		assertEquals(Long.valueOf(0), bookRepository.countAll());
		assertEquals(0, bookRepository.findAll().size());
		
		//create a book
		@SuppressWarnings("deprecation")
		//added a space into "a title" to check the sanitize function is working from TextUtil in the create function.
		Book book = new Book("a  title", "description", 10.0f, "isbn", new Date(12, 12, 12), 500, "imageURL" ,Language.ENGLISH);
		book = bookRepository.create(book);
		Long bookID = book.getId();
		
		//check created book
		assertNotNull(bookID);
		
		//find created book
		Book bookFound = bookRepository.find(bookID);	
		
		//check the found book
		assertEquals("a title", bookFound.getTitle());
		assertTrue(bookFound.getIsbn().startsWith("13"));//checks the isbn starts with 13 and uses the IsbnGenerator class.
		
		//test counting books.
		assertEquals(Long.valueOf(1), bookRepository.countAll());
		assertEquals(1, bookRepository.findAll().size());
		
		//delete the book
		bookRepository.delete(bookID);
		
		//test counting books.
		assertEquals(Long.valueOf(0), bookRepository.countAll());
		assertEquals(0, bookRepository.findAll().size());
	}

	@Deployment
	public static JavaArchive createDeployment(){
		return ShrinkWrap.create(JavaArchive.class)
				.addClass(BookRepository.class)
				.addClass(Book.class)
				.addClass(Language.class) 
				.addClass(TextUtil.class)
				.addClass(NumberGenerator.class)
				.addClass(IsbnGenerator.class)
				.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml")
				.addAsManifestResource("META-INF/test-persistence.xml", "persistence.xml");
	}

}
