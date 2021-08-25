package com.assessment.librarymanagement;

import com.assessment.librarymanagement.controller.BooksManagementController;
import com.assessment.librarymanagement.model.Book;
import com.assessment.librarymanagement.service.IBookMgmtService;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
class BooksManagementControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @InjectMocks
    private BooksManagementController booksManagementController;

    @MockBean
    private IBookMgmtService bookMgmtService;

    public void testRetrieveAllBooks() throws Exception {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Five point someone", "Chetan Bhagat"));
        books.add(new Book("The life", "William"));

        Mockito.when(this.bookMgmtService.retrieveAllBooks()).thenReturn(books);
        ResponseEntity<Book> response = booksManagementController.retrieveAllBooks();
        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getBody());

    }

    public void testRetrieveSpecificBook() throws Exception {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Five point someone", "Chetan Bhagat"));
        books.add(new Book("The life", "William"));
        String bookName = "Five point someone";
        Mockito.when(this.bookMgmtService.retrieveBookByName(bookName)).thenReturn
                (books.stream().filter(book -> book.getName().equalsIgnoreCase("bookName")).findFirst().get());
        ResponseEntity<Book> response = booksManagementController.retrieveBook(bookName);
        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getBody());

    }

    public void testAdditionOfBook() throws Exception {

        Book book = new Book("Five point someone", "Chetan Bhagat");
        ResponseEntity<Book> response = booksManagementController.addBook(book);
        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getBody());

    }


}
