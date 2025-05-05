import java.util.ArrayList;
import java.util.List;

public class Beer {
    // Beer properties
    private String name;
    private double alcoholPercentage;
    private double price;

    // Constructor
    public Beer(String name, double alcoholPercentage, double price) {
        this.name = name;
        setAlcoholPercentage(alcoholPercentage); // Use setter to validate
        setPrice(price); // Use setter to validate
    }

    // Setter for alcohol percentage with validation
    public void setAlcoholPercentage(double alcoholPercentage) {
        if (alcoholPercentage < 0) {
            throw new IllegalArgumentException("Alcohol percentage cannot be negative");
        }
        if (alcoholPercentage > 100) {
            throw new IllegalArgumentException("Alcohol percentage cannot be more than 100%");
        }
        this.alcoholPercentage = alcoholPercentage;
    }

    // Setter for price with validation
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public double getPrice() {
        return price;
    }

    // Main method to test our Beer class
    public static void main(String[] args) {
        // Create a list of beers
        List<Beer> beers = new ArrayList<>();
        beers.add(new Beer("Carlsberg", 4.6, 10.50));
        beers.add(new Beer("Tuborg", 5.0, 12.00));
        beers.add(new Beer("Heineken", 5.2, 15.75));

        // Calculate average price
        double total = 0;
        for (Beer beer : beers) {
            total += beer.getPrice();
        }
        double averagePrice = total / beers.size();

        // Print results
        System.out.println("Our beer selection:");
        for (Beer beer : beers) {
            System.out.printf("- %s (%.1f%% alcohol, %.2f kr)%n",
                    beer.getName(),
                    beer.getAlcoholPercentage(),
                    beer.getPrice());
        }
        System.out.printf("%nAverage price: %.2f kr%n", averagePrice);

    }
}