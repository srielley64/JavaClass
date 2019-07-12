package com.launchacademy.booklistdb.repository;

import com.launchacademy.booklistdb.model.Book;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRespository extends JpaRepository<Book, Long> {
    Book findByTitle( String title);
    List<Book> findByAuthor(String author);
    List<Book> findByCopyright(Date cright);

}
