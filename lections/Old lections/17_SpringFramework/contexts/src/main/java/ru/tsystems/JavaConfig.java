package ru.tsystems;

import org.springframework.context.annotation.Bean;

//@Configuration
public class JavaConfig {

    @Bean
    public BookService bookService(BookDao bookDao) {
        BookService bookService = new BookService(bookDao);
        return bookService;
    }

    @Bean
    public BookDao bookDao() {
        BookDao bookDao = new BookDao();
        return bookDao;
    }

}
