package inheritenceLec;

public class Developer extends Employee{

    public Developer () {
    }

    public Developer (String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("coding...");
    }

    public void working() { super.work(); }

    public void debug () {
        System.out.println("debugging");
    }

    public static void main(String[] args) {

        Employee bob = new Employee("Bob");
        bob.work();
        System.out.println(bob.getName());
        Developer john = new Developer("John");
        john.work();
        john.debug();
        john.working();
        System.out.println(john.getName());
        Employee charles = new Developer("Charles");
        System.out.println(charles.getName());
        charles.work();
    }

}