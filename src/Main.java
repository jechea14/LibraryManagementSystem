import domain.Library;
import logic.SystemControl;
import ui.TextInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        SystemControl systemControl = new SystemControl();
        Library library = new Library("Park Library");
        TextInterface ui = new TextInterface(systemControl, scanner);
        ui.start();
    }
}