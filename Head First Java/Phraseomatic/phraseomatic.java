public class phraseomatic
{
	public static void main (String [] args)
	{
		String [] word_array1 = {"pancratic","hemagglutination","unavengeable","unconcluded","overchased"};
		String [] word_array2 = {"overchased","festoonery","hilliard","thankfully","preform"};
		String [] word_array3 = {"dipterocarpaceous","toran","undiminishing","extraversively","ionisation"};
		
		int word_length1 = word_array1.length;
		int word_length2 = word_array2.length;
		int word_length3 = word_array3.length;
		
		int rand1 = (int) (Math.random() * word_length1);
		int rand2 = (int) (Math.random() * word_length2);
		int rand3 = (int) (Math.random() * word_length3);
		
		String phrase = word_array1[rand1] + " " + word_array2[rand2] + " " + word_array3[rand3];
		
		System.out.println("What we need is a " + phrase);
	}
}