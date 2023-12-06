package cpit251_project;

public class Service {

    private String serviceName;
    private int serviceHours;
    private int serviceNo;

    public Service(String serviceName, int serviceHours) {
        this.serviceName = serviceName;

        this.serviceHours = serviceHours;
    }

    public Service(String serviceName, int serviceHours, int serviceNo) {
        this.serviceName = serviceName;

        this.serviceHours = serviceHours;
        this.serviceNo = serviceNo;
    }
    
     public void serviceToString() {
        System.out.println("Service name: " + serviceName);
        System.out.println("Service hours: " + serviceHours);
        System.out.println("Service Number: " + serviceNo);

    }

    public Service() {
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }


    public int getServiceHours() {
        return serviceHours;
    }

    public void setServiceHours(int serviceHours) {
        this.serviceHours = serviceHours;
    }

   

    public int getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(int serviceNo) {
        this.serviceNo = serviceNo;
    }

    @Override
    public String toString() {
        return "Service{" + "serviceName=" + serviceName + ",  serviceHours=" + serviceHours + ", serviceNo=" + serviceNo + '}';
    }

}
