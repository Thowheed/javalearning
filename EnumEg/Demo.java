package EnumEg;

enum Status { // basically this status is class here
    Running,
    Failed,
    Success

    // all this are actually object
    // these are named constatns
}
// we can have this as constants

// we cannot extend enum
// but we can use methods, constructors

// by default enum extends enum class

enum Laptop {
    Macbook(2000), XPS(3000), Surface(1500);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Demo {
    public static void main(String[] args) {

        Status s = Status.Running;
        System.out.println(s); // RUnning is printed

        System.out.println(s.getClass().getSuperclass());

        System.out.println(s.ordinal());// gives it index

        Status ss[] = Status.values();

        System.out.println(ss);

        for (Status status : ss) {
            System.out.println(status + " " + status.ordinal());
        }

        Status eg = Status.Running;

        if (eg == Status.Failed)
            System.out.println("Status failed");
        else if (eg == Status.Running)
            System.out.println("Success");
        else
            System.out.println("Running");

        switch (s) {
            case Running:
                System.out.println("Running");
                break;

            default:
                System.out.println("Not running");
                break;
        }

        Laptop lap = Laptop.Macbook;

        System.out.println(lap.getPrice());
    }
}
