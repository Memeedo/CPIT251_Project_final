package cpit251_project;


import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to alternative charge app");
        System.out.println("Login page:");
        System.out.println("Enter ID: ");

        int id = input.nextInt();
        System.out.println("Enter password: ");
        String password = input.next();


        Government gov = new Government();
       
        if (gov.Authentication(id, password) == true) {

            System.out.println("\nSuccesfully logged in\n");
            // the violator entered our system because they refused to buy and chose to do a community service instead.
            System.out.println("This is your violaton info\n");
            Violation violator = gov.vio_info(id);
            System.out.println("Violation number:" + violator.getvioNumber());
            System.out.println("Violation name:" + violator.getVioName());
            System.out.println("The value of the violation fine:" + violator.getVioPrice());
            System.out.println("======================================================");

            System.out.println("Request for the selection of community serivces");
            System.out.println("the selection of cummunity servies\n");
            
            for (int i = 0; i < gov.getServices().size(); i++) {

               gov.getServices().get(i).serviceToString();
                System.out.println("");

            }
            System.out.println("======================================================");
            System.out.println("choose the service by entering the service number of the service");
            System.out.print("the number:");
            int service_no = input.nextInt();
            if (gov.requestIsAccepted(service_no)) {
                System.out.println("");
                System.out.println("your selection is accepted by the governemnt");
                System.out.println("");    
                System.out.println("Upon completion,Enter the given key that was sent to you by the government");
                int key = input.nextInt();
                if (key == gov.completionKey(service_no,id)) {
                    System.out.println("You have successfully done the service and it's verified, you may exit now ");
                    
                } else {
                    System.out.println("the key is incorrect");
                }

            } else {
                System.out.println("the server number you entered is not found");
            }

        } else {
            System.out.println("Failed to login, Wrong ID or passowrd");
        }

    }

}
