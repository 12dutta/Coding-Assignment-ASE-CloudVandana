import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};

        // Convert the array to a List
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        // Shuffle the list
        Collections.shuffle(list);

        // Convert the shuffled list back to an array
        array = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(array));
    }
}