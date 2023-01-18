import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    // create a List to store employee names
    static List<String> information = new ArrayList<>();
    // create a Scanner object to read input
    static Scanner input = new Scanner(System.in);

    // method to add employee names to the List
    static void addInfo() {
        String fName, lName;
        int num;
        System.out.println("How many employees are there");
        num = input.nextInt();

        // loop to take input for employee names
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the fisrt name of employee: " + (i + 1));
            fName = input.next();
            System.out.println("Enter the last name of employee: " + (i + 1));
            lName = input.next();
            information.add(fName + " " + lName);
        }
    }

    // method to display employee names in the List
    static void displayInfo() {
        System.out.println("The names stored are: ");
        for (int i = 0; i < information.size(); i++) {
            System.out.println(i + " " + information.get(i));
        }
    }


    // method to delete employee information
    static void delInfo() {
        System.out.println("List of employee names");
        displayInfo();
        System.out.println("What number on the list would you like to delete?");
        int loc = input.nextInt();
        information.remove(loc);
        System.out.println("The name was deleted");
        System.out.println("New list of employees");
        displayInfo();
    }

    // method to insert employee information
    static void insInfo() {
        System.out.println("Enter the location on the list you want to insert the information");
        int loc = input.nextInt();
        System.out.println("Enter the first name of the employee you want to add:");
        String newfName = input.next();
        System.out.println("Enter the last name of the employee you want to add:");
        String newlName = input.next();
        information.add(loc, (newfName + " " + newlName));
        displayInfo();
    }

    // method to search for an employee name in the List
    static void searchInfo() {
        System.out.println("Enter the first name you would like to search for");
        String fName = input.next();
        System.out.println("Enter the last name you would like to search for");
        String lName = input.next();
        String name = (fName + " " + lName);
        
        //Checking if the employee's name is on the list
        if (information.contains(name)) {
            System.out.println(name + " is at number:" + information.indexOf(name) + " on the list of employee's");
        } else {
            System.out.println("There is no employee on the list with that name. Please type another name");
        }
    }

    // method to update an employee name in the List
    static void updateInfo() {
        System.out.println("List of employees:");
        displayInfo();
        System.out.print("Enter the number on list you would like to update: ");
        int loc = input.nextInt();
        input.nextLine();
        System.out.print("Enter the new first name of employee: ");
        String fName = input.next();
        System.out.print("Enter the new last name of employee: ");
        String lName = input.next();

        information.set(loc, fName + " " + lName);
        System.out.println("New list of employees:");
        displayInfo();
    }

    //Runs The Program
    public static void main(String[] args) {
        char c;
        do {
            System.out.println("==========Employee Information==========");
            System.out.println("Press 1 to add employee information \nPress 2 to insert employee information" +
                    " \nPress 3 to Update the employee information \nPress 4 to delete the employee information \nPress 5 to search for employee" +
                    " information \nPress 6 to Display the employee information");
            int choice = input.nextInt();
            char ch;
            
            //If the users input is outside of the expected range then tell them to enter a number within teh range
            while (choice < 1 || choice > 6) {
                System.out.print("Invalid input, please enter a number from 1-6: ");
                choice = input.nextInt();
            }

            switch (choice) {
                
                //If the user enters 1, run the method for adding employee's to the list
                case 1:
                    do {
                        System.out.println("==========Add Information==========");
                        addInfo();
                        System.out.print("Do you want to add more employee's? Press 'y' for Yes and 'n' for No: ");
                        ch = input.next().charAt(0);
                        while (ch != 'y' && ch != 'n') {
                            System.out.println("Invalid input, please enter 'y' or 'n' ");
                            ch = input.next().charAt(0);
                        }
                    } while (ch == 'y');
                    break;

                //If the user enters 2, run the method for inserting new employees in a specific spot on the list     
                case 2:
                    do {
                        System.out.println("==========Insert Information==========");
                        displayInfo();
                        insInfo();
                        System.out.print("Do you want to insert more employee's? Press 'y' for Yes and 'n' for No: ");
                        ch = input.next().charAt(0);
                        while (ch != 'y' && ch != 'n') {
                            System.out.println("Invalid input, please enter 'y' or 'n' ");
                            ch = input.next().charAt(0);
                        }
                    } while (ch == 'y');
                    break;

                //If the user enters 3, run the method for updating employee information
                case 3:
                    do {
                        System.out.println("==========Update Information==========");
                        updateInfo();
                        System.out.print("Do you want to update any more names? Press 'y' for Yes and 'n' for No: ");
                        ch = input.next().charAt(0);
                        while (ch != 'y' && ch != 'n') {
                            System.out.println("Invalid input, please enter 'y' or 'n' ");
                            ch = input.next().charAt(0);
                        }
                    } while (ch == 'y');
                    break;

                //If the user enters 4, run the method for deleting employee information
                case 4:
                    do {
                        System.out.println("==========Delete Information==========");
                        delInfo();
                        System.out.print("Do you want to delete any more employees? Press 'y' for Yes and 'n' for No: ");
                        ch = input.next().charAt(0);
                        while (ch != 'y' && ch != 'n') {
                            System.out.println("Invalid input, please enter 'y' or 'n' ");
                            ch = input.next().charAt(0);
                        }
                    } while (ch == 'y');
                    break;

                //If the user enters 4, run the method for searching for employee information
                case 5:
                    do {
                        System.out.println("==========Search Information==========");
                        searchInfo();
                        System.out.print("Do you want to search for another employee? Press 'y' for Yes and 'n' for No: ");
                        ch = input.next().charAt(0);
                        while (ch != 'y' && ch != 'n') {
                            System.out.println("Invalid input, please enter 'y' or 'n' ");
                            ch = input.next().charAt(0);
                        }
                    } while (ch == 'y');
                    break;

                //If the user enters 6, run the method to display the list of employee's 
                case 6:
                    System.out.println("==========Display Information==========");
                    displayInfo();
                    break;
            }

            //ask if the user wants to return to the main menu from the menu they are in or if they want to close the program
            System.out.print("Do you want to return to the main menu? Press 'y' for Yes and 'n' for No: ");
            c = input.next().charAt(0);
        } while (c == 'y');
    }
}
