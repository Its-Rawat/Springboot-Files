package com.rawat.onetomany.onetomanyassociation.Services;

import com.rawat.onetomany.onetomanyassociation.Entities.Library;
import com.rawat.onetomany.onetomanyassociation.Repositories.LibraryRepository;
import com.rawat.onetomany.onetomanyassociation.Services.LibraryService.LibraryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LibraryServiceImpl implements LibraryServices {

    @Autowired
    LibraryRepository libraryRepository;

    @Override
    public Library SaveLibrary(Library library) {
        Library save = libraryRepository.save(library);
        return save;
    }

    @Override
    public Library GetLibrary(int id) {
        return null;
    }

    @Override
    public void DeleteLibrary(int id) {

    }

    @Override
    public List<Library> GetAllLibrary() {
        return List.of();
    }

    @Override
    public Library UpdateLibrary(Library library, int LibraryIdentifier) {
        Library OldLibrary = libraryRepository.findById(library.getLibraryIdentifier()).orElseThrow(() -> new RuntimeException("Library ID Not Found"));
        OldLibrary.setLibraryName(library.getLibraryName());
        OldLibrary.setLibraryAddress(library.getLibraryAddress());
        Library SaveLibrary = libraryRepository.save(OldLibrary);
        return SaveLibrary;
    }
}
