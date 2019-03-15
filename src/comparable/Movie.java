package comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Movie implements Comparable<Movie> {

	String movieName;
	int year;
	int budget;

	public Movie(String movieName, int year, int budget) {
		super();
		this.movieName = movieName;
		this.year = year;
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", year=" + year + ", budget=" + budget + "]";
	}

	@Override
	public int compareTo(Movie o) {
		return this.movieName.compareTo(o.movieName);
	}

	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("RHTDM", 1198, 522332));
		list.add(new Movie("DDLJ", 1195, 522332));
		list.add(new Movie("JNMD", 1199, 522332));

		Collections.sort(list);

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}

}
