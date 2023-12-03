
package cpit251_project;

public class Violation {
 private String vioName;
 private int vioNumber;
 private String vioPrice;

    public Violation(String vioName, int vioNumber, String vioPrice) {
        this.vioName = vioName;
        this.vioNumber = vioNumber;
        this.vioPrice = vioPrice;
    }

    public Violation() {
    }

    public String getVioName() {
        return vioName;
    }

    public void setVioName(String vioName) {
        this.vioName = vioName;
    }

    public int getvioNumber() {
        return vioNumber;
    }

    public void setvioNumber(int vioNumber) {
        this.vioNumber = vioNumber;
    }

    public String getVioPrice() {
        return vioPrice;
    }

    public void setVioPrice(String vioPrice) {
        this.vioPrice = vioPrice;
    }
 
   
    
    
}


