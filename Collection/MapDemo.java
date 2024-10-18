import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // Map<String, Integer> data = new HashMap<String, Integer>();

        Map<String, Integer> data = new Hashtable<String, Integer>();
        // for synchronized we can use Hashtable

        data.put("Thowheed", 56);
        data.put("Ajay", 64);
        data.put("Maari", 76);
        data.put("Thowheed", 80); // this will replace first one

        // this doesn't follow sequence
        System.out.println(data); // {Thowheed=56, Ajay=64, Maari=76}
        System.out.println(data.get("Thowheed"));

        // to get key

        System.out.println(data.keySet());

        for (String name : data.keySet()) {
            System.out.println(name + " " + data.get(name));
        }

        System.out.println(data.values());// prints all values

    }
}
