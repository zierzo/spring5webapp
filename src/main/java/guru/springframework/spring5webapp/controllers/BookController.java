package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

@Controller
public class BookController {

    private BookRepository bookRepo;

    public BookController(BookRepository bookRepository) {
        this.bookRepo=bookRepository;
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String getBooks(Model model){
        model.addAttribute("books", bookRepo.findAll());
        return "books";
    }
}
