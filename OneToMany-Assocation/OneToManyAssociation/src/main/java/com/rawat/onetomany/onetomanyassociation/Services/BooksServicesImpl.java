package com.rawat.onetomany.onetomanyassociation.Services;

import com.rawat.onetomany.onetomanyassociation.Entities.Books;
import com.rawat.onetomany.onetomanyassociation.Repositories.BooksRepository;
import com.rawat.onetomany.onetomanyassociation.Services.BooksService.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public class BooksServicesImpl implements BookServices {

    private final BooksRepository booksRepository;

    public BooksServicesImpl(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Override
    public Books GetBook(int id) {
        return null;
    }

    @Override
    public Books SaveBook(Books book) {
        Books saveBook = booksRepository.save(book);
        return saveBook;
    }

    @Override
    public List<Books> GetAllBooks() {
        return List.of();
    }

    @Override
    public void DeleteBook(int id) {

    }

    @Override
    public Books UpdateBook(Books book, int ISBN_ID) {
        return null;
    }
}
