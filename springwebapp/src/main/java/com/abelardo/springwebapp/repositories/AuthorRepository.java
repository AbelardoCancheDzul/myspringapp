package com.abelardo.springwebapp.repositories;

import com.abelardo.springwebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
