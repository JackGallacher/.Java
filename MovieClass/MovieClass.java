class Movie
{
	String title;
	String genre;
	int rating;
	
	void play()
	{
		System.out.println("playing the movie");
	}
}

class MovieClass
{
	public static void main (String [] args)
	{
		Movie one = new Movie();
		Movie two = new Movie();
		Movie three = new Movie();
		
		one.title = "lord of the rings";
		two.title = "star wars";
		three.title = "the avengers";
		
		one.genre = "fantasy";
		two.genre = "space opera";
		three.genre = "superhero";
		
		one.rating = 9;
		two.rating = 8;
		three.rating = 9;
		
		System.out.println(one.title + ", " + one.genre + ", " + one.rating);
		System.out.println(two.title + ", " + two.genre + ", " + two.rating);
		System.out.println(three.title + ", " + three.genre + ", " + three.rating);
	}
}