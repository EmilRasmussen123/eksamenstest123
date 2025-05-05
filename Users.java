import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// User class with a name field
class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Main class
public class Users {
    public static void main(String[] args) {
        // Create a list of users
        List<User> users = new ArrayList<>();

        // Create 5 users in a loop
        for (int i = 1; i <= 5; i++) {
            users.add(new User("User" + i));
        }

        // Print all users
        System.out.println("Original users:");
        printUsers(users);

        // Change the first user's name to "Hans"
        users.get(0).setName("Hans");
        System.out.println("\nAfter changing first user to Hans:");
        printUsers(users);

        // Sort the users by name
        Collections.sort(users, (u1, u2) -> u1.getName().compareTo(u2.getName()));
        System.out.println("\nAfter sorting users:");
        printUsers(users);

        // Remove the 3rd user (index 2)
        users.remove(2);
        System.out.println("\nAfter removing 3rd user:");
        printUsers(users);

        // Replace first user with "Poul"
        users.set(0, new User("Poul"));
        System.out.println("\nAfter replacing first user with Poul:");
        printUsers(users);
    }

    // Helper method to print users
    private static void printUsers(List<User> users) {
        for (User user : users) {
            System.out.println(user.getName());
        }
    }
}