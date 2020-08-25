/*  Created by IntelliJ IDEA.
 *  User: Naman Seth (namanseth01)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String nameOfBook;
    private String nameOfAuthorOfBook;
    private String ISBNNumberOfBook;
    private boolean isBookAvailable;

    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getNameOfAuthorOfBook() {
        return nameOfAuthorOfBook;
    }

    public String getISBNNumberOfBook() {
        return ISBNNumberOfBook;
    }

    public boolean isBookAvailable() {
        return isBookAvailable;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public void setNameOfAuthorOfBook(String nameOfAuthorOfBook) {
        this.nameOfAuthorOfBook = nameOfAuthorOfBook;
    }

    public void setISBNNumberOfBook(String ISBNNumberOfBook) {
        this.ISBNNumberOfBook = ISBNNumberOfBook;
    }

    public void setBookAvailable(boolean bookAvailable) {
        this.isBookAvailable = bookAvailable;
    }

    public Book(String nameOfBook, String nameOfAuthorOfBook, String ISBNNumberOfBook, boolean isBookAvailable) {
        this.nameOfBook = nameOfBook;
        this.nameOfAuthorOfBook = nameOfAuthorOfBook;
        this.ISBNNumberOfBook = ISBNNumberOfBook;
        this.isBookAvailable = isBookAvailable;
    }

    public String toString() {
        return "Name of the book: " + getNameOfBook() + "Name of the author of the book: " + getNameOfAuthorOfBook() + "ISBn Number of the code: " + getISBNNumberOfBook() + "Is book available? " + isBookAvailable();
    }
}
