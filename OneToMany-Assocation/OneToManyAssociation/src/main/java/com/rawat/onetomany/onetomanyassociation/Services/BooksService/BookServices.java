package com.rawat.onetomany.onetomanyassociation.Services.BooksService;

import com.rawat.onetomany.onetomanyassociation.Entities.Books;

import java.awt.print.Book;
import java.util.List;

public interface BookServices {

    Books GetBook(int id);

    Books SaveBook(Books book);

    List<Books> GetAllBooks();

    void DeleteBook(int id);

    Books UpdateBook(Books book, int ISBN_ID);
}
