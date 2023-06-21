package com.gihanz.repositories;

import com.gihanz.entities.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book ,Long> {
}
