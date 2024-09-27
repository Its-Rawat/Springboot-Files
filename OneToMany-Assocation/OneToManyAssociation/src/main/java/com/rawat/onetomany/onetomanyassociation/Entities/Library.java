package com.rawat.onetomany.onetomanyassociation.Entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Library_Store")
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Library_Identifier")
    private int  LibraryIdentifier;

    @Column(name = "Library_Name")
    private String LibraryName;

    @Column(name = "Library_Address")
    private String LibraryAddress;

    @OneToMany(mappedBy = "library", cascade = CascadeType.ALL)
    private List<Books> booksList = new ArrayList<Books>();


    public Library() {
    }

    public Library(int libraryIdentifier, String libraryName, String libraryAddress, List<Books> booksList) {
        LibraryIdentifier = libraryIdentifier;
        LibraryName = libraryName;
        LibraryAddress = libraryAddress;
        this.booksList = booksList;
    }

    public List<Books> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Books> booksList) {
        this.booksList = booksList;
    }

    public int getLibraryIdentifier() {
        return LibraryIdentifier;
    }

    public void setLibraryIdentifier(int libraryIdentifier) {
        LibraryIdentifier = libraryIdentifier;
    }

    public String getLibraryName() {
        return LibraryName;
    }

    public void setLibraryName(String libraryName) {
        LibraryName = libraryName;
    }

    public String getLibraryAddress() {
        return LibraryAddress;
    }

    public void setLibraryAddress(String libraryAddress) {
        LibraryAddress = libraryAddress;
    }

    @Override
    public String toString() {
        return "Library{" +
                "LibraryIdentifier=" + LibraryIdentifier +
                ", LibraryName='" + LibraryName + '\'' +
                ", LibraryAddress='" + LibraryAddress + '\'' +
                '}';
    }
}
