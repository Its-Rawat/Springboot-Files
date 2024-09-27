package com.rawat.onetomany.onetomanyassociation.Entities;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="Books_Store")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ISBN_NO")
    private int ISBN;
    @Column(name = "Book_Title")
    private String Title;
    @Column(name = "Published_Date")
    private Date PublishedDate;
    @Column(name = "Book_Author")
    private String Author;

    // @ManyToOne
    @ManyToOne
    @JoinColumn(name = "Library_Id")
    private Library library;

    public Books() {
    }

    public Books(int ISBN, String title, Date publishedDate, String author, Library library) {
        this.ISBN = ISBN;
        Title = title;
        PublishedDate = publishedDate;
        Author = author;
        this.library = library;
    }


    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Date getPublishedDate() {
        return PublishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        PublishedDate = publishedDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public String toString() {
        return "Books{" +
                "ISBN=" + ISBN +
                ", Title='" + Title + '\'' +
                ", PublishedDate=" + PublishedDate +
                ", Author='" + Author + '\'' +
                ", library=" + library +
                '}';
    }
}
