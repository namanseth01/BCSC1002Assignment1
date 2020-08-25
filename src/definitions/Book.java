/*  Created by IntelliJ IDEA.
 *  User: Naman Seth (namanseth01)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String nameOfBook;
    private String nameOfAuthorOfBook;
    private String ISBNNumberOfBook;
    private boolean isBookAvailable;

    public Book(String nameOfBook, String nameOfAuthorOfBook, String ISBNNumberOfBook, boolean isBookAvailable) {
        this.nameOfBook = nameOfBook;
        this.nameOfAuthorOfBook = nameOfAuthorOfBook;
        this.ISBNNumberOfBook = ISBNNumberOfBook;
        this.isBookAvailable = isBookAvailable;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getNameOfAuthorOfBook() {
        return nameOfAuthorOfBook;
    }

    public void setNameOfAuthorOfBook(String nameOfAuthorOfBook) {
        this.nameOfAuthorOfBook = nameOfAuthorOfBook;
    }

    public String getISBNNumberOfBook() {
        return ISBNNumberOfBook;
    }

    public void setISBNNumberOfBook(String ISBNNumberOfBook) {
        this.ISBNNumberOfBook = ISBNNumberOfBook;
    }

    public boolean isBookAvailable() {
        return isBookAvailable;
    }

    public void setBookAvailable(boolean bookAvailable) {
        this.isBookAvailable = bookAvailable;
    }

    @Override
    public String toString() {
        return "Name of the book: " + getNameOfBook() + "Name of the author of the book: " + getNameOfAuthorOfBook() + "ISBn Number of the code: " + getISBNNumberOfBook() + "Is book available? " + isBookAvailable();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isBookAvailable() == book.isBookAvailable() &&
                Objects.equals(getNameOfBook(), book.getNameOfBook()) &&
                Objects.equals(getNameOfAuthorOfBook(), book.getNameOfAuthorOfBook()) &&
                Objects.equals(getISBNNumberOfBook(), book.getISBNNumberOfBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfBook(), getNameOfAuthorOfBook(), getISBNNumberOfBook(), isBookAvailable());
    }
}
