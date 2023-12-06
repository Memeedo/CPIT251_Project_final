package cpit251_project;

import java.util.ArrayList;

public class Government {

    private Violation violation;
    private ArrayList<Service> services;
    private User violator;
    private User all_violotors[];

    public Government(User violator) {
        this.violator = violator;
    }

    public Violation getViolation() {
        return violation;
    }

    public void setViolation(Violation violation) {
        this.violation = violation;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }

    public User getViolator() {
        return violator;
    }

    public void setViolator(User violator) {
        this.violator = violator;
    }

    public User[] getAll_violotors() {
        return all_violotors;
    }

    public void setAll_violotors(User[] all_violotors) {
        this.all_violotors = all_violotors;
    }

    public Government() {

        User[] allViolators = new User[4];

        Violation vio1 = new Violation("Over Speeding by more than 25 km/hr", 98765, "150 SAR");
        Violation vio2 = new Violation("Stealing valuables that are less than 500 SAR of Worth", 98845, "600 SAR");
        Violation vio3 = new Violation("Drifting in public streets", 93147, "1000 SAR");

        allViolators[0] = new User("Ahmed", 22, 11223, vio1, "ah2233");
        allViolators[1] = new User("Saleh", 23, 11345, vio2, "sh432");
        allViolators[2] = new User("Wael", 29, 11425, vio3, "lm2943");
        allViolators[3] = new User("Khalid", 21, 12345, vio1, "kh112233");
        all_violotors = allViolators;

        String[] Services_Names = new String[]{"Street Cleanup", "Food Bank assistance for nonprofit org", "Planting Trees"};
        int[] Service_Hours = {5, 7, 8};

        ArrayList<Service> the_services = new ArrayList<Service>();

        for (int i = 0, service_no = 1; i < 3; i++, service_no++) {

            Service service = new Service(Services_Names[i], Service_Hours[i], service_no);
            the_services.add(service);

        }

        services = the_services;

    }

    public boolean Authentication(int ID, String password) {
        boolean verify = false;

        for (int i = 0; i < all_violotors.length; i++) {
            if (all_violotors[i].getID() == ID && all_violotors[i].getPassword().equals(password)) {
                // setting the violator in question
                setViolator(all_violotors[i]);
                verify = true;
            }

        }

        return verify;

    }

    public boolean requestIsAccepted(int serviceNo) {

        boolean requestAcceptance = true;
        for (int i = 0; i < services.size(); i++) {

            if (serviceNo == services.get(i).getServiceNo()) {

                // and it's accepted from the governemnt then return true........
                
                //Setting the service for the violatior in question
                violator.setService(services.get(i));

                return true;

            } else {
                requestAcceptance = false;
            }
        }

        return requestAcceptance;

    }

    public int completionKey(int ServiceNo, int ID,int vio_key) {
        int completion_key = 60;
        completion_key  += ServiceNo;
        for (int i = 0; i < all_violotors.length; i++) {
            // updating the database of the government
            if (all_violotors[i].getID() == ID) {
                if (completion_key == vio_key) {
                    //updating the database of the government
                   all_violotors[i].setService(violator.getService()); 
                   return completion_key;
                }
                
            }
        }

        return completion_key;

    }

    public Violation vio_info(int vio_id) {

        for (int i = 0; i < all_violotors.length; i++) {
            if (vio_id == all_violotors[i].getID()) {
                return all_violotors[i].getViolation();
            }
        }
        return null;
    }


}
