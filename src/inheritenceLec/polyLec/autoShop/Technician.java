package inheritenceLec.polyLec.autoShop;

public class Technician {

    private String name;

    public Technician(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car repair(Car car) {
        System.out.println("repairing car");
        return car;
    }

    public static void main(String[] args) {
        Technician bob = new Technician("bob");

//        Car toyota = new Toyota();
//        Car ford = new Ford();
//        Car kia = new Kia();


    }
}
