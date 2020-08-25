/*  Created by IntelliJ IDEA.
 *  User: Naman Seth (namanseth01)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String name;
    private long universityRollNUmber;
    private int numberOfBooksIssued;
    private Book[] booksIssued;

    public Student(String name, long universityRollNUmber, int numberOfBooksIssued) {
        this.name = name;
        this.universityRollNUmber = universityRollNUmber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.booksIssued = new Book[1];
    }

    public Student() {
        this.booksIssued = new Book[1];
        booksIssued[0] = new Book();
    }

    public String getName() {
        return name;
    }

    public long getUniversityRollNUmber() {
        return universityRollNUmber;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public Book[] getBooksIssued() {
        return booksIssued.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUniversityRollNUmber(long universityRollNUmber) {
        this.universityRollNUmber = universityRollNUmber;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public void setBooksIssued(Book[] booksIssued) {
        this.booksIssued = booksIssued;
    }

    public String toString() {
        return "Student Name: " + getName() + "University Roll Number: " + getUniversityRollNUmber() + "Number of books issued by student: " + getUniversityRollNUmber() + "Names of book issued: " + Arrays.toString(getBooksIssued());
    }
}
