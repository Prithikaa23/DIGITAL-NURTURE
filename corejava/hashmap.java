import java.util.HashMap;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> map = new HashMap<>();

        map.put(101,"Ram");
        map.put(102,"Sam");
        map.put(103,"Ravi");

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        System.out.println("Name: " + map.get(id));
    }
}