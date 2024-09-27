package com.rawat.onetomany.onetomanyassociation.Repositories;

import com.rawat.onetomany.onetomanyassociation.Entities.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Integer> {
}
