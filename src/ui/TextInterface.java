package ui;

import domain.Library;

import java.util.Scanner;

public class TextInterface {
    private Scanner scanner;
    private Library library;

    public TextInterface(Scanner scanner, Library library) {
        this.scanner = scanner;
        this.library = library;
    }

    public void start() {

        System.out.println(this.library.getName() + " Management System");

        while (true) {
            System.out.println("[1] Search");
            System.out.println("[1] Search");
            System.out.println("[1] Search");
            System.out.println("[1] Search");
            System.out.println("[1] Search");
            System.out.println("[quit] Exit");

            String input = this.scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            switch (input) {
                case "1" :
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }


        }

    }
}
