package com.rawat.onetomany.onetomanyassociation.Repositories;

import com.rawat.onetomany.onetomanyassociation.Entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books, Integer> {
}
