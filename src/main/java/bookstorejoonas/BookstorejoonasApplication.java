package bookstorejoonas;

import java.beans.BeanProperty;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import bookstorejoonas.domain.Book;
import bookstorejoonas.domain.BookRepository;

@SpringBootApplication
public class BookstorejoonasApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstorejoonasApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository repository) {
		return (args) -> {
		repository.save(new Book("Tuntematon sotilas", "Väinö Linna", 1954, "978-951-0-36530-4", 14.99));
		repository.save(new Book("Tunnettu sotilas", "Jari Sarasvuo", 1253, "822-351-0-36530-4", 19.99));
		};
	
	}

}
