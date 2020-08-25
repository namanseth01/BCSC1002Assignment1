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

    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getNameOfAuthorOfBook() {
        return nameOfAuthorOfBook;
    }

    public String getISBNNumberOfBook() {
        return ISBNNumberOfBook;
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

    public Book(String nameOfBook, String nameOfAuthorOfBook, String ISBNNumberOfBook) {
        this.nameOfBook = nameOfBook;
        this.nameOfAuthorOfBook = nameOfAuthorOfBook;
        this.ISBNNumberOfBook = ISBNNumberOfBook;
    }
}
