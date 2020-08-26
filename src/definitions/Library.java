/*  Created by IntelliJ IDEA.
 *  User: Naman Seth (namanseth01)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private Book[] booksCurrentlyAvailable;

    public Library() {
        this.booksCurrentlyAvailable = new Book[20];
        for (int index = 0; index < booksCurrentlyAvailable.length; index++) {
            booksCurrentlyAvailable[index] = new Book();
        }
    }

    public Book[] getBooksCurrentlyAvailable() {
        return booksCurrentlyAvailable.clone();
    }
}
