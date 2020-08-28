/*  Created by IntelliJ IDEA.
 *  User: Naman Seth (namanseth01)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static final byte ISSUE_NEW_BOOK = 1;
    public static final byte RETURN_BOOK = 2;
    public static final byte LIST_OF_ALL_BOOKS_ISSUED = 3;
    public static final byte QUIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentInput;
        long studentUniversityRollNumber;
        String studentName, bookName;
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issued book from me.");
            System.out.println("3. Show me all my issued books.");
            System.out.println("4. Exit.");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case ISSUE_NEW_BOOK -> {
                    System.out.print("Enter university roll number: ");
                    studentUniversityRollNumber = scanner.nextLong();
                    System.out.print("Enter your name: ");
                    scanner.nextLine();
                    studentName = scanner.nextLine();
                    Student student = new Student(studentName, studentUniversityRollNumber);
                    System.out.print("Enter the name of book you want to issue: ");
                    bookName = scanner.nextLine();
                    student.doIssueBook(bookName);
                }
                case RETURN_BOOK -> {
                    System.out.print("Enter university roll number: ");
                    studentUniversityRollNumber = scanner.nextLong();
                    System.out.print("Enter your name: ");
                    scanner.nextLine();
                    studentName = scanner.nextLine();
                    Student student1 = new Student(studentName, studentUniversityRollNumber);
                    System.out.println("Enter the name of book you want to return: ");
                    bookName = scanner.nextLine();
                    student1.doReturnBook(bookName);
                }
                case LIST_OF_ALL_BOOKS_ISSUED -> {
                    System.out.print("Enter university roll number: ");
                    studentUniversityRollNumber = scanner.nextLong();
                    System.out.print("Enter your name: ");
                    scanner.nextLine();
                    studentName = scanner.nextLine();
                    Student student2 = new Student(studentName, studentUniversityRollNumber);
                    System.out.println("List of all books issued:");
                    student2.showListOfBooksIssued();
                }

                case QUIT -> {
                }
                default -> System.out.println("Invalid Input..");
            }
        } while (studentInput != QUIT);
        scanner.close();
    }
}