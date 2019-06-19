import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Author;
import model.Book;

public class BookStuff {

  private EntityManagerFactory emf;
  private EntityManager em;

  public void load() {
    em.getTransaction().begin();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    try {
      Author author1 = new Author("Justin", null,
          "Cronin", sdf.parse("1962-01-01"), null);
      em.persist(author1);
      Author author2 = new Author("David", null,
          "Weber", sdf.parse("1952-10-24"), null);
      em.persist(author2);
      Book book1 = new Book( author1, "The Passage",
          "9780752883304", sdf.parse("2010-06-01"));
      em.persist(book1);
      Book book2 = new Book( author2, "On Baskilisk Station",
          "9788498005738", sdf.parse("1994-10-01") );
      em.persist(book2);
      List<Book> bookList = new ArrayList<>();
      bookList.add(book1);
      author1.setBookList(bookList);
      bookList.clear();
      bookList.add(book2);
      author2.setBookList(bookList);

    } catch(ParseException p) {
      p.getMessage();
    }
    em.getTransaction().commit();
  }

  public Book findBook() {
    em.getTransaction().begin();
    Book fBook = em.find(Book.class, 1L);
    em.getTransaction().commit();
    return fBook;
  }

  public Author findAuthor() {
    em.getTransaction().begin();
    Author fAuthor = em.find(Author.class, 1L);
    em.getTransaction().commit();
    return fAuthor;
  }


  public static void main(String[] args) {

    BookStuff bs = new BookStuff();
    bs.emf = Persistence.createEntityManagerFactory("BookStuff");
    bs.em = bs.emf.createEntityManager();

//    bs.load();

    Book book = bs.findBook();
    Author author = bs.findAuthor();

    System.out.println(book);
    System.out.println(author);
  }
}
