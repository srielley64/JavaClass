package com.rielley.bookvalidator.repository;

import com.rielley.bookvalidator.model.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookValidationRepository
    extends PagingAndSortingRepository<Book, Integer> {

}
