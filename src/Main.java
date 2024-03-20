import domain.Library;
import ui.TextInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        Library library = new Library("Park Library");
        TextInterface ui = new TextInterface(scanner, library);
        ui.start();
    }
}