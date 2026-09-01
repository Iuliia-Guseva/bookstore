//Add a new controller called BookController which handle get request to the path /index

package bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import bookstore.domain.Book;

@Controller 
public class BookController {

    @GetMapping("/index")
    public String showIndex(Model model) {
        return "index"; // index.html
    }
    @GetMapping("/one")
    public String showOneBook(Model model) {
        Book book = new Book("Harry Potter", "J.K. Rowling", 1997, "123456", 19.99);
        model.addAttribute("book", book);
        return "one";
    }
}
