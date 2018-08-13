public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoanedOut;

    private BookSingleton() {
        author = "Gamma, Helm, Johnson and Vlissides";
        title = "Design Patterns";
        book = null;
        isLoanedOut = false;
    }
}
