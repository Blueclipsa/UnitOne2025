package Module5Lab1;

import java.util.ArrayList;

public class Driver
{
    public static void main(String[] args)
    {
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Movie> movies = new ArrayList<>();

        books.add(new Book("The Hunger Games", "Young Adult Dystopia", 2008,
                "Suzanne Collins", 374));

        books.add(new Book("The Three-Body Problem", "Science Fiction", 2006,
                "Liu Cixin", 400));

        books.add(new Book("The Martian", "Science Fiction", 2011,
                "Andy Weir", 384));


        // Movie list
        movies.add(new Movie("Spider-Man: Homecoming", "Action-Adventure", 2017,
                "Jon Watts", 133));

        movies.add(new Movie("Captain America: The Winter Soldier", "Thriller, Action", 2016,
                "The Russo Brothers", 146));

        movies.add(new Movie("Fantastic Mr. Fox", "Comedy", 2009,
                "Wes Anderson", 146));


        System.out.println("Books List: ");
        for (Book book : books)
        {
            System.out.println(book.toString());
        }

        System.out.println("\nMovies List: ");
        for (Movie movie : movies)
        {
            System.out.println(movie.toString());
        }
    }
}
