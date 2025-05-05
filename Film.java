import java.time.Year; // For getting current year

public class Film {
    // Movie properties
    private String title;
    private int releaseYear;
    private Producer producer; // Can be null if no producer is set

    // Constructor with title and year
    public Film(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    // Constructor with just title (uses current year)
    public Film(String title) {
        this(title, Year.now().getValue()); // Calls the other constructor
    }

    // Method to connect a producer to this film
    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Producer getProducer() {
        return producer;
    }

    // Producer class (defined inside same file)
    public static class Producer {
        private String name;

        public Producer(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    // Main method to test our classes
    public static void main(String[] args) {
        // Create some films
        Film film1 = new Film("Inception", 2010);
        Film film2 = new Film("New Release"); // Uses current year

        // Create a producer
        Producer producer = new Producer("Christopher Nolan");

        // Connect producer to film
        film1.setProducer(producer);

        // Print film info
        System.out.println("Film 1: " + film1.getTitle() +
                " (" + film1.getReleaseYear() + ")");
        System.out.println("Producer: " +
                (film1.getProducer() != null ?
                        film1.getProducer().getName() : "Unknown"));

        System.out.println("\nFilm 2: " + film2.getTitle() +
                " (" + film2.getReleaseYear() + ")");
        System.out.println("Producer: " +
                (film2.getProducer() != null ?
                        film2.getProducer().getName() : "Unknown"));
    }
}