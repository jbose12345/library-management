package com.assessment.librarymanagement.service;

import com.assessment.librarymanagement.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class BookMgmtServiceImpl implements IBookMgmtService{
    private List<Book> books = new ArrayList<Book> ();

    @Override
    public void addBook(Book book) {
      books.add(book);
    }

    @Override
    public List<Book> retrieveAllBooks()
    {
        return books;
    }

    @Override
    public Book retrieveBookByName(String name)
    {
        Optional<Book> matchedBookOpt =  books.stream().filter(book -> book.getName().equalsIgnoreCase(name)).findFirst();
        if(matchedBookOpt.isPresent()) {
            return matchedBookOpt.get();
        }
        return null;
    }
}
