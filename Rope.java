/*
 * @author - Aadhithya Kannan
 * @date - 1 November 2016
 * @period - Period 05
 */
public class Rope_ASK
{
	public static void main(String[] args)
	{
		System.out.println("Test test# (Expected Value) : (Output Value)");
		System.out.println("Testing indexOf(\"bobisawesome\",\"ome\")");
		System.out.println("Test 1 (9): "+indexOf("bobisawesome","ome"));
		System.out.println("\nTesting indexOf(\"bobisawesome\",\"bob\")");
		System.out.println("Test 2 (0): "+indexOf("bobisawesome","bob"));
		System.out.println("\nTesting indexOf(\"bobisawesome\",\"radjesh\")");
		System.out.println("Test 3 (-1): "+indexOf("bobisawesome","radjesh"));
		System.out.println("\nTesting indexOf(\"bobisawesome\",\"o\")");
		System.out.println("Test 4 (1): "+indexOf("bobisawesome","o"));
		System.out.println("\nTesting indexOf(\"bobisawesome\",\"alskdipqwkl;ksdoso\")");
		System.out.println("Test 5 (-1): "+indexOf("bobisawesome","alskdipqwkl;ksdoso"));
		
		System.out.println("\nTesting indexOf(\"bobisawesome\",\"o\",0)");
		System.out.println("Test 1 (9): "+indexOf("bobisawesome","o",0));
		System.out.println("\nTesting indexOf(\"bobisawesome\",\"o\",3)");
		System.out.println("Test 2 (9): "+indexOf("bobisawesome","o",3));
		System.out.println("\nTesting indexOf(\"bobisawesome\",\"o\",5)");
		System.out.println("Test 3 (9): "+indexOf("bobisawesome","o",5));
		System.out.println("\nTesting indexOf(\"bobisawesome\",\"o\",10)");
		System.out.println("Test 4 (-1): "+indexOf("bobisawesome","o",12));
		System.out.println("\nTesting indexOf(\"bobisawesome\",\"o\",10)");
		System.out.println("Test 5 (-1): "+indexOf("bobisawesome","o",12));
		
		System.out.println("\nTesting countVowels(String)");
		System.out.println("Test 1 (10) : "+countVowels("Bob is awesome just cause."));
		
		System.out.println("\nTesting substring(String, int)");
		System.out.println("Test 1 (awesome just cause.) : "+substring("Bob is awesome just cause.",7));
		
		System.out.println("\nTesting equals(String, String)");
		System.out.println("Test 1 (true) : "+equals("Bob is awesome just cause.","Bob is awesome just cause."));
		System.out.println("Test 2 (false) : "+equals("Bob","Stephan"));
		System.out.println("Test 3 (false) : "+equals("Stephen","Stephan"));
	}
	
	//Return the index where needle is located in haystack
	//or return -1 if needle is not found
	public static int indexOf(String haystack, String needle)
	{
		for (int i=0; i<haystack.length(); i++){
			try{
				if (haystack.substring(i,needle.length()+i).equals(needle)){
					return i;
				}
			}catch(Exception e){
				return -1;
			}
		}
		return -1;
	}
	//Return the index where needle is located in haystack AT or AFTER offset
	//or return -1 if needle is not found
	public static int indexOf(String haystack, String needle, int offset)
	{
		haystack = haystack.substring(offset,haystack.length());
		int index = 0;
		try{
			if ((index = indexOf(haystack, needle)) != -1)
				return index+offset;
			else 
				return -1;
		}catch(Exception e){
			return -1;
		}
	}
	
	//Return how many vowles (aeiou) are in source
	public static int countVowels(String haystack){
		String letter;
		int count = 0;
		for (int i = 0; i < haystack.length(); i++){
			letter = haystack.substring(i, i+1);
			if (letter.toLowerCase().matches("a|e|i|o|u")){
				count++;
			}
		}
		
		return count;
	}
	
	
	//Return the substring of source starting at offset and continuing to the end of the String

	public static String substring(String haystack, int a){
		String out = "";
		for (int i = a; i < haystack.length(); i++){
			out+=haystack.charAt(i);
		}
		return out;
	}
	
	
	
	
	//Return true if a and b contain the same characters in the same order (case sensitive)
	public static boolean equals(String haystack, String needle){
		if (haystack.length()!=needle.length())
			return false;
		for (int i = 0; i < haystack.length(); i++){
			if(!haystack.substring(i, i+1).equals(needle.substring(i, i+1)))
				return false;
		}
		
		return true;
	}
}