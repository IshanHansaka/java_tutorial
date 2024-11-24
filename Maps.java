import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> marks= new HashMap<> ();

        marks.put("Ishan", 75);
        marks.put("Jeewan", 86);
        marks.put("Weditha", 85);
        marks.put("Manuka", 83);
        marks.put("Sachin", 79);
        marks.put("Thamoj", 71);

        for(String key : marks.keySet()) {
            System.err.println(key + "\t :   " + marks.get(key));
        }
    }
}
