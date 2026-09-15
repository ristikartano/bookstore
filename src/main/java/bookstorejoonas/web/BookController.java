package bookstorejoonas.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bookstorejoonas.domain.Book;
import bookstorejoonas.domain.BookRepository;




@Controller
public class BookController {


    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }



    @RequestMapping("/index")
    public String showIndex() {
        return "index";
    }
    


    @GetMapping("/booklist")
    public String getBooks(Model model) {

        List<Book> booklist = new ArrayList<>();

        model.addAttribute("booklist", bookRepository.findAll());

        return "booklist";
    }
    


}
    