package bookstorejoonas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import bookstorejoonas.domain.Book;
import bookstorejoonas.domain.BookRepository;
import bookstorejoonas.domain.Category;
import bookstorejoonas.domain.CategoryRepository;

@SpringBootApplication
public class BookstorejoonasApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstorejoonasApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository repository, CategoryRepository categoryRepository) {
		return (args) -> {

			Category fantasy = new Category("Fantasy");
			Category history = new Category("History");
			Category programming = new Category("Programming");

			categoryRepository.save(fantasy);
			categoryRepository.save(history);
			categoryRepository.save(programming);

			repository.save(new Book(
					"Tuntematon sotilas",
					"Väinö Linna",
					1954,
					"978-951-0-36530-4",
					14.99,
					history));

			repository.save(new Book(
					"Tunnettu sotilas",
					"Jari Sarasvuo",
					1253,
					"822-351-0-36530-4",
					19.99,
					fantasy));
		};
	}
}