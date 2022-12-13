package Repository;

import Database.BookDatabase;
import Model.Book;
public class BookRepository {
    public Book[] findAll() {
        return BookDatabase.books;
    }
}
