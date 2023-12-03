package cpit251_project;

public class User {

    private String name;
    private int age;
    private int ID;
    private Violation violation;
    private String password;
    private Service service;

    public User(String name, int age, int ID,String password) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        
        this.password = password;
    }

    
    public User(String name, int age, int ID, Violation violation, String password) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.violation = violation;
        this.password = password;
    }

    public Violation getViolation() {
        return violation;
    }

    public void setViolation(Violation violation) {
        this.violation = violation;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
    
    
  
       public User(int ID,String password) {
        this.ID = ID;
        
        this.password = password;
    }

    public User() {

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}
