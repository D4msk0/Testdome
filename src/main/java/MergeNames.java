import java.util.ArrayList;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {

        // Create an ArrayList to store unique names
        ArrayList<String> uniqueNamesList = new ArrayList<>();

        // Add names from the first array
        for (String name : names1) {
            if (!uniqueNamesList.contains(name)) {
                uniqueNamesList.add(name);
            }
        }

        // Add names from the second array, checking for duplicates
        for (String name : names2) {
            if (!uniqueNamesList.contains(name)) {
                uniqueNamesList.add(name);
            }
        }

        // Convert the ArrayList to an array and return
        return uniqueNamesList.toArray(new String[0]);



    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}