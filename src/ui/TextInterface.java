package ui;

import domain.Library;
import logic.SystemControl;

import java.util.Scanner;

public class TextInterface {
    private Scanner scanner;
    private Library library;
    private SystemControl systemControl;

    public TextInterface(SystemControl systemControl, Scanner scanner) {
        this.scanner = scanner;
//        this.library = library;
        this.systemControl = systemControl;
    }

    public void start() {

        System.out.println(this.library.getName() + " Management System");

        while (true) {
            System.out.println("[1] Search");
            System.out.println("[2] Add");
            System.out.println("[3] Remove");
            System.out.println("[q] Exit");

            String input = this.scanner.nextLine();

            if (input.equals("q")) {
                break;
            }

            switch (input) {
                case "1" :
                    break;

                case "2":
                    addOption();
                    break;

                case "3":
                    break;

                default:
                    System.out.println("Invalid");
                    break;
            }


        }

    }

    public void addOption() {
        while (true) {
            System.out.println("Add");
            System.out.println("---------");
            System.out.println("[1] Add Bookshelf");
            System.out.println("[2] Add DVDshelf");
            System.out.println("[q] Go Back");

            String input = this.scanner.nextLine();
            if (input.equals("q")) {
                break;
            }

            switch(input) {
                case "1":
                    System.out.println("Name of Book shelf: ");
                    String bookshelf = this.scanner.nextLine();
                    System.out.println("Capacity of bookshelf " + bookshelf + ": ");
                    int capacity = Integer.valueOf(this.scanner.nextLine());
                    this.systemControl.addBookshelf(bookshelf, capacity);
                    break;

                case "2":
                    System.out.println("Name of DVD shelf: ");
                    String dvdshelf = this.scanner.nextLine();
                    System.out.println("Capacity of bookshelf " + dvdshelf + ": ");
                    int cap = Integer.valueOf(this.scanner.nextLine());
                    this.systemControl.addDVDshelf(dvdshelf, cap);
                    break;

                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }

    }
}
