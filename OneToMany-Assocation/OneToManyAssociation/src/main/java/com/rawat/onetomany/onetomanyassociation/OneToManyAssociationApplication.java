package com.rawat.onetomany.onetomanyassociation;

import com.rawat.onetomany.onetomanyassociation.Entities.Books;
import com.rawat.onetomany.onetomanyassociation.Entities.Library;
import com.rawat.onetomany.onetomanyassociation.Services.BooksService.BookServices;
import com.rawat.onetomany.onetomanyassociation.Services.LibraryService.LibraryServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.print.Book;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@SpringBootApplication
public class OneToManyAssociationApplication implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(OneToManyAssociationApplication.class);

    @Autowired
    LibraryServices libraryServices;

    @Autowired
    BookServices bookServices;

    public static void main(String[] args) {
        SpringApplication.run(OneToManyAssociationApplication.class, args);

        System.out.println("Hello Hibernate");
    }

    @Override
    public void run(String... args) throws Exception {

        // SAVE Library

//        Library library = new Library();
//        library.setLibraryName("Dunkun Library");
//        library.setLibraryAddress("Uttam Nagar");
//        library.setLibraryIdentifier(52);
//
//        libraryServices.SaveLibrary(library);

        // SAVE Book

//        Books books = new Books();
//        books.setTitle("CPP");
//        books.setAuthor("Danial J");
//        books.setPublishedDate(new Date());
//
//
//        bookServices.SaveBook(books);

        // ONE TO MANY ASSOCIATION
//
//        Library library = new Library();
//        library.setLibraryName("Dunkun Library");
//        library.setLibraryAddress("Uttam Nagar");
//        library.setLibraryIdentifier(52);
//
//        Library library1 = new Library();
//        library1.setLibraryName("Rawats Library");
//        library1.setLibraryAddress("Dwarka");
//        library1.setLibraryIdentifier(120);
//
//
//
//
//        Books books1 = new Books();
//        books1.setTitle("Dark");
//        books1.setAuthor("Someone in Europe");
//        books1.setISBN(34);
//        books1.setPublishedDate(new Date());
//        books1.setLibrary(library1);
//
//        Books books2 = new Books();
//        books2.setTitle("Basic Hibernate");
//        books2.setAuthor("Aayush");
//        books2.setISBN(45);
//        books2.setPublishedDate(new Date());
//        books2.setLibrary(library1);
//
//        Books books3 = new Books();
//        books3.setTitle("CPP Basics");
//        books3.setAuthor("Aayush");
//        books3.setISBN(13);
//        books3.setPublishedDate(new Date());
//        books3.setLibrary(library1);
//
//        List<Books> booksList = new ArrayList<>();
//        Collection<Books> booksCollection = Arrays.asList(books1,books2,books3);
//        booksList.addAll(booksCollection);
//
//        library1.setBooksList(booksList);
//
//        Library libraryCreated = libraryServices.SaveLibrary(library1);
//        logger.info("Library created: " + libraryCreated);

    }
}
