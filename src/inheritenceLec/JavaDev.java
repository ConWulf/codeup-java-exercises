package inheritenceLec;

public class JavaDev extends Developer {

    public JavaDev() {

    }

    public JavaDev(String name) {
        super(name);
    }

    @Override
    public void working() {
        super.work();
    }

    public static void main(String[] args) {

        Developer sophia = new JavaDev("Sophia");
        System.out.println(sophia.name);
        sophia.work();
        sophia.working();

    }
}
