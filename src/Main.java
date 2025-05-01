import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>(100); // 100 бакетов
        Random rand = new Random();

        for (int i = 0; i < 10000; i++) {
            int id = rand.nextInt(1000000);
            table.put(new MyTestingClass(id), "student" + i);
        }

        System.out.println("elements: " + table.size());
        table.printTable();
    }
}