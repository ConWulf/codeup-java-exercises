package abstrClasses;

//abstract class declaration
public abstract class Franchise {
    // all the methods in an abstract class are like a list of rules or requirements for what needs to be implemented in any class that **extends** the abstract class

    //if we were to create a class that extends a Franchise class
    // i.e. McDonalds on I-10 v.s one on Loop 1604

    //properties (constant values)
    private final String companyName = "McDonnalds"; //this is always the same no mater where we build the restaurant
private String managerName;

    public Franchise(String managerName) {
        this.managerName = managerName;
    }

    //methods
    public abstract void broilStuff(String menuItem); //broilStuff("igMac")
//ex. 8am = 800, 10pm = 2200
    public abstract void businessHours(int openTime, int closeTime);

    //non void abstract method
    public abstract boolean iceCreamMachineIsWorking();

    //non abstract method
    public void greetCustomer() {
        //must have method body w/o abstract keyword
        System.out.println("welcome to "+this.companyName);
    }

    //getter/setter

    public String getCompanyName() {
        return companyName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}
