import java.util.*;

public class lambda {
    public static void main(String[] args) {

        List<String> list =
                Arrays.asList("Ravi","Anu","Kumar","Bala");

        Collections.sort(list,(a,b)->a.compareTo(b));

        System.out.println(list);
    }
}
