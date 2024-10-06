class Computer {

    // void doesn't return anything
    public void playMusic() {
        System.out.println("Music is playing");
    }

    // returning a string
    // to get pen u need to pass the amount
    public String getMePen(int Cost) {

        return Cost == 10 ? "Pen" : "Nothing";
    }

    // here class is an blueprint
    // to use that we need an object
}

public class Methods1 {

    // we always have a main method
    // this is where start of execution happens
    public static void main(String[] args) {
        // Creating an object to get the value
        Computer com = new Computer();

        com.playMusic();
        System.out.println(com.getMePen(9));
    }
}
