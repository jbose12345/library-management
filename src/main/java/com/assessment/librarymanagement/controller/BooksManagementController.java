package com.assessment.librarymanagement.controller;

import com.assessment.librarymanagement.service.IBookMgmtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.assessment.librarymanagement.model.Book;

@RestController
public class BooksManagementController {
    @Autowired
    private IBookMgmtService bookMgmtService;

    @RequestMapping(value = "/books", method = RequestMethod.POST)
    public ResponseEntity addBook(@RequestBody Book book) {
        return ResponseEntity.noContent().build();
    }
    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public ResponseEntity retrieveAllBooks()
    {
        return ResponseEntity.ok(bookMgmtService.retrieveAllBooks());
    }
    @RequestMapping(value = "/books/{name}", method = RequestMethod.GET)
    public ResponseEntity<Book> retrieveBook(@RequestParam String name)
    {
        return  ResponseEntity.ok(bookMgmtService.retrieveBookByName(name));
    }
}
