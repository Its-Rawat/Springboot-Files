package com.rawat.onetomany.onetomanyassociation.Services.LibraryService;

import com.rawat.onetomany.onetomanyassociation.Entities.Library;

import java.util.List;

public interface LibraryServices{

    Library SaveLibrary(Library library);

    Library GetLibrary(int id);

    void DeleteLibrary(int id);

    List<Library> GetAllLibrary();

    Library UpdateLibrary(Library library, int LibraryIdentifier);
}
