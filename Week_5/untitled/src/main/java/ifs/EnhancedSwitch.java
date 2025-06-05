package ifs;

import java.util.Scanner;

enum Browser {
    CHROME,
    FIREFOX,
    OPERA,
    EDGE,
    IE
}

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vul in welke browser je gebruikt: ");
        String input = scanner.nextLine();
        Browser browser;

        try {
            browser = Browser.valueOf(input.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Je gebruikt een niet ondersteunde browser");
            return;
        }


        String message = switch (browser) {
            case EDGE -> "Je gebruikt Edge";
            case CHROME, FIREFOX, OPERA -> "Je gebruikt een moderne browser";
            case IE -> "Waarom gebruikt je internet explorer";
        };

        System.out.println(message);
    }
}
