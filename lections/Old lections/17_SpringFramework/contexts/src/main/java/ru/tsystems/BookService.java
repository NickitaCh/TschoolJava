package ru.tsystems;

//@Component
public class BookService {

    //    @Autowired
    private BookDao bookDao;

    public BookService() {
    }

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void orderBook() {
        bookDao.saveOrder();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
