import java.util.ArrayList;
import java.util.List;

public class Keyword {
    // Basic properties
    private String word;
    private String definition;
    private List<Keyword> seeAlso; // List of related keywords

    // Constructor
    public Keyword(String word, String definition) {
        this.word = word;
        this.definition = definition;
        this.seeAlso = new ArrayList<>(); // Initialize empty list
    }

    // Check if this keyword matches a search term
    public boolean matches(String searchTerm) {
        return this.word.equalsIgnoreCase(searchTerm); // Case-insensitive match
    }

    // Add a related keyword
    public void addSeeAlso(Keyword relatedKeyword) {
        if (!seeAlso.contains(relatedKeyword)) { // Avoid duplicates
            seeAlso.add(relatedKeyword);
        }
    }

    // Get all related keywords
    public List<Keyword> getSeeAlso() {
        return new ArrayList<>(seeAlso); // Return copy for safety
    }

    // Getters
    public String getWord() {
        return word;
    }

    public String getDefinition() {
        return definition;
    }

    // Main method to test our class
    public static void main(String[] args) {
        // Create some keywords
        Keyword java = new Keyword("Java", "A popular programming language");
        Keyword python = new Keyword("Python", "Another programming language");
        Keyword oop = new Keyword("OOP", "Object-Oriented Programming");

        // Set up relationships
        java.addSeeAlso(python);
        java.addSeeAlso(oop);
        oop.addSeeAlso(java);

        // Test matching
        System.out.println("Does 'java' match 'Java'? " + java.matches("Java"));
        System.out.println("Does 'java' match 'python'? " + java.matches("python"));

        // Show related keywords
        System.out.println("\nSee also for Java:");
        for (Keyword related : java.getSeeAlso()) {
            System.out.println("- " + related.getWord() + ": " + related.getDefinition());
        }
    }
}