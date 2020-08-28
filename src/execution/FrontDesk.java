/*  Created by IntelliJ IDEA.
 *  User: Naman Seth (namanseth01)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;

import java.util.Scanner;

public class FrontDesk {
    public static final byte ISSUE_NEW_BOOK = 1;
    public static final byte RETURN_BOOK = 2;
    public static final byte LIST_OF_ALL_BOOKS_ISSUED = 3;
    public static final byte QUIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        int studentInput;
        long studentUniversityRollNumber;
        String studentName, bookName;
    }
}
