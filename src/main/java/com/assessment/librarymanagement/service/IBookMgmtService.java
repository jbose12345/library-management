package com.assessment.librarymanagement.service;

import com.assessment.librarymanagement.model.Book;
import java.util.List;

public interface IBookMgmtService {

    void addBook(Book book);
    List<Book> retrieveAllBooks();
    Book retrieveBookByName(String name);

}
