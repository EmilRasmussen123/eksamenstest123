public class Bil {
    private String navn;
    private int vægt; // vægt i kg
    private Trailer trailer; // kan være null hvis ingen trailer

    public Bil(String navn, int vægt) {
        this.navn = navn;
        this.vægt = vægt;
    }

    // Metode til at tilkoble en trailer
    public boolean tilkoblTrailer(Trailer trailer) {
        // Tjek om totalvægt vil blive for høj
        if (this.vægt + trailer.getVægt() > 3500) {
            System.out.println("Advarsel: Kan ikke tilkoble trailer - totalvægt vil overstige 3500kg");
            return false; // ikke tilkoblet
        }

        this.trailer = trailer;
        System.out.println("Trailer tilkoblet til " + this.navn);
        return true; // tilkoblet succesfuldt
    }

    // Beregn totalvægt
    public int getTotalVægt() {
        if (trailer == null) {
            return vægt; // kun bilens vægt
        } else {
            return vægt + trailer.getVægt(); // bil + trailer
        }
    }

    // Get metoder
    public String getNavn() {
        return navn;
    }

    public int getVægt() {
        return vægt;
    }

    public Trailer getTrailer() {
        return trailer;
    }
}

class Trailer {
    private String navn;
    private int vægt; // vægt i kg

    public Trailer(String navn, int vægt) {
        this.navn = navn;
        this.vægt = vægt;
    }

    // Get metoder
    public String getNavn() {
        return navn;
    }

    public int getVægt() {
        return vægt;
    }
}

// Test klasse
 class Main {
    public static void main(String[] args) {
        // Opret biler og trailere
        Bil bil1 = new Bil("Volvo", 2000);
        Bil bil2 = new Bil("Lille Bybil", 800);

        Trailer trailer1 = new Trailer("Stor trailer", 1600);
        Trailer trailer2 = new Trailer("Lille trailer", 500);

        // Test tilkobling
        System.out.println("\nPrøver at tilkoble trailer til Volvo:");
        boolean succes1 = bil1.tilkoblTrailer(trailer1);
        System.out.println("Totalvægt for " + bil1.getNavn() + ": " + bil1.getTotalVægt() + "kg");

        System.out.println("\nPrøver at tilkoble stor trailer til bybil:");
        boolean succes2 = bil2.tilkoblTrailer(trailer1);

        System.out.println("\nPrøver at tilkoble lille trailer til bybil:");
        boolean succes3 = bil2.tilkoblTrailer(trailer2);
        System.out.println("Totalvægt for " + bil2.getNavn() + ": " + bil2.getTotalVægt() + "kg");
    }
}