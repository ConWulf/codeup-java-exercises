package abstrClasses.interfaces;

//interface declaration
public interface McFranchise {

    //properties
 String companyName = "McDonalds";

 // abstract methods (must wright out when implementing)

    public void broilStuff(String menuItem);
    public void businessHours(int openTime, int closeTime);
    public String iceCreamMachineWorking();
}
