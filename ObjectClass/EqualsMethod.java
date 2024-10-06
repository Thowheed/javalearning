package ObjectClass;

class Laptop {
    String model;
    int price;

    public String toString() {
        return model + " : " + price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    // public boolean equals(Laptop that) {
    // if (this.model.equals(that.model) && this.price == that.price) {
    // return true;
    // } else {
    // return false;
    // }
    // }

}

public class EqualsMethod {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "Samsung";
        obj1.price = 2000;

        System.out.println(obj1);// prints toString method
        // if we have tostring method it will print what we return if not it prints what
        // objectclass returns some hascode memory
        Laptop obj2 = new Laptop();

        obj2.model = "Samsung";
        obj2.price = 2000;
        System.out.println(obj1 == obj2);

        // prints false

        System.out.println(obj1.equals(obj2)); // prints false if there not equal method we define since it takes it
                                               // from
        // object class else it prints according to our condition

    }

    // instead using equals method right click and in source actin we can use
    // generate hashCode() and equals() this is good practise
}
