public class Movie {
    // Attributes
    String title;
    String genre;
    double rating;

    // Constructor
    public Movie(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    // Method to display movie details
    public void displayMovieDetails() {
        System.out.println("Movie Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating + " / 10");
    }

    // Main method
    public static void main(String[] args) {
        // Creating a movie object
        Movie movie1 = new Movie("Inception", "Science Fiction", 8.8);

        // Displaying movie details
        movie1.displayMovieDetails();
    }
}
