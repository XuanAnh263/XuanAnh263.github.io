import model.Book;
import repository.BookRepository;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        BookRepository abc = new BookRepository();
        List<Book> All = abc.getListObjectFromJsonFile();

        for (Book book : All) {
            String[] arr = book.getCategory();
            System.out.println(arr.length);
            System.out.println(Arrays.toString(arr));
        }

    }
}
