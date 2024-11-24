import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();

        nums.add(5);
        nums.add(10);
        nums.add(55);
        nums.add(10);
        nums.add(28);
        nums.add(91);

        // sets didn't store same values and it doesn't follow sequence
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
