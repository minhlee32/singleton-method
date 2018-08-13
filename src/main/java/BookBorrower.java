public class BookBorrower {
    private BookSingleton borrowedBook;
    private boolean haveBook = false;

    public void borrowBook() {
        borrowedBook = BookSingleton.borrowBook();

        if (borrowedBook == null) {
            haveBook = false;
        } else {
            haveBook = true;
        }
    }


}
