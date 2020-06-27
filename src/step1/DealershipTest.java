package step1;

import java.util.Scanner;

public class DealershipTest {

    private static Dealership dealership = new Dealership("Cool Cars", "Rick Sanchez");

    public static void main(String[] args) {
        while (true) {
            String menu = "MENU\n1, ADD MAKE\n2, REMOVE MAKE\n3, DISPLAY MAKES\n0, EXIT";
            switch (getOption(menu, 4)) {
                case 0:
                    if (getYesNo("ARE YOU SURE?")) System.exit(0);
                    break;
                case 1:
                    if(dealership.addMake(getString("ENTER MAKE"))) {
                        System.out.println("MAKE ADDED");
                    } else {
                        System.out.println("MAKE ALREADY ADDED");
                    }
                    break;
                case 2:
                    if(dealership.removeMake(getString("ENTER MAKE"))){
                        System.out.println("MAKE REMOVED");
                    } else {
                        System.out.println("MAKE NOT FOUND");
                    }
                    break;
                case 3:
                    System.out.println("MAKES AT " + dealership.getName());
                    if(dealership.getMakes().size() > 0){
                        for (String make: dealership.getMakes()) {
                            System.out.println(make);
                        }
                    } else {
                        System.out.println("NOTHING TO SHOW");
                    }
                    break;
            }
        }
    }

    public static String getString(String prompt) {
        System.out.print(prompt + "> ");
        return new Scanner(System.in).nextLine();
    }

    public static int getInt(String prompt) {
        System.out.print(prompt + "\n> ");
        try {
            return Integer.valueOf(new Scanner(System.in).nextLine());
        } catch (Exception e) {
            System.out.println("INVALID OPTION");
            return getInt(prompt);
        }
    }

    public static int getOption(String prompt, int optionsNum) {
        int choice = getInt(prompt);
        if(choice < 0 || choice >= optionsNum) {
            System.out.println("INVALID OPTION");
            return getOption(prompt, optionsNum);
        }
        return choice;
    }

    public static boolean getYesNo(String prompt) {
        String choice = getString(prompt + " (y/n)");
        if(!choice.equals("y") && !choice.equals("n")) {
            System.out.println("INVALID OPTION");
            return getYesNo(prompt);
        }
        return choice.equals("y");
    }
}
