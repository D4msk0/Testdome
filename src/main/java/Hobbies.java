import java.util.*;

public class Hobbies {

    private final HashMap<String, String[]> hobbies = new HashMap<String, String[]>();

    public void add(String hobbyist, String... hobbies) {
        this.hobbies.put(hobbyist, hobbies);
    }

    public List<String> findAllHobbyists(String hobby) {

        //Create new List
        List<String> hobbyistsList = new ArrayList<>();

        for (Map.Entry<String, String[]> entry : hobbies.entrySet()) {
            String hobbyist = entry.getKey();
            String[] hobbiesArray = entry.getValue();

            if (Arrays.asList(hobbiesArray).contains(hobby)) {
                hobbyistsList.add(hobbyist);
            }
        }

        return hobbyistsList;
    }

    public static void main(String[] args) {
        Hobbies hobbies = new Hobbies();
        hobbies.add("Steve", "Fashion", "Piano", "Reading");
        hobbies.add("Patty", "Drama", "Magic", "Pets");
        hobbies.add("Chad", "Puzzles", "Pets", "Yoga");

        System.out.println(Arrays.toString(hobbies.findAllHobbyists("Yoga").toArray()));
    }
}