package com.abelardo.springwebapp.repositories;

import com.abelardo.springwebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
