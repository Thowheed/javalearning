package EnumEg;

enum Status { // basically this status is class here
    Running,
    Failed,
    Success

    // all this are actually object
    // these are named constatns
}
// we can have this as constants

public class Demo {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s); // RUnning is printed

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
    }
}
