package DataStructureandAlgorithm.Data_Structure;

import java.util.HashMap;
import java.util.Map;

public class StudentDatabase {
    public static void main(String[] args) {
        HashMap<Integer, String[]> db = new HashMap<>();

        // Add students: id -> [name, grade]
        db.put(101, new String[]{"Alice", "A"});
        db.put(102, new String[]{"Bob", "B"});
        db.put(103, new String[]{"Charlie", "A+"});

        // Display all
        System.out.println("Student Database:");
        System.out.printf("%-6s %-12s %s%n", "ID", "Name", "Grade");
        for (Map.Entry<Integer, String[]> e : db.entrySet())
            System.out.printf("%-6d %-12s %s%n", e.getKey(), e.getValue()[0], e.getValue()[1]);

        // Search
        int searchId = 102;
        if (db.containsKey(searchId))
            System.out.println("Found: " + db.get(searchId)[0] + " - " + db.get(searchId)[1]);

        // Delete
        db.remove(101);
        System.out.println("After deleting 101, size: " + db.size());
    }
}