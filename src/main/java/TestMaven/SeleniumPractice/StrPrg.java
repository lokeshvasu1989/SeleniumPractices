package TestMaven.SeleniumPractice;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StrPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      rev(); wordRev(); strLen(); arrLar();
      String sent = "hello world";
      String result=    rev(sent,"world");
      System.out.println(result);
	}
	
	public static void rev()
	{
		String name= "Lokesh Bert";
		String rev= "";
		
		for(int i=0; i<name.length(); i++)
		{
			rev = name.charAt(i) + rev;
		}
		System.out.println(rev);
	}
	
	public static void wordRev()
	{
		String name = "don jon";
		String rev= Arrays.asList(name.split(" "))
		.stream()
		.map(s-> new StringBuilder(s).reverse())
		.collect(Collectors.joining(" "));
		System.out.println(rev);
		
	}
	
	public static String rev(String sent, String wordRev)
	{
		String[] words= sent.split(" ");
		
		for(int i=0; i<words.length; i++)
		{
			if(words[i].equals(wordRev))
			{
				StringBuilder sb = new StringBuilder(words[i]);
				sb.reverse();
			words[i]=	sb.toString();
			}
		}
		return String.join(" ", words);
	}
	
	public static void strLen()
	{
		String nam= "Akash Singh";
		int count =0;
		for(int i=0;i<nam.length(); i++)
		{
			if(nam.charAt(i)!= ' ')
			{
				count ++;
			}
		}
		System.out.println(count);
	}
	
	public static void arrLar()
	{
		 int array[] = {10, 20, 25, 63, 96, 57};
	      int size = array.length;
	      Arrays.sort(array);
	      System.out.println("sorted Array ::"+Arrays.toString(array));
	      int res = array[size-1];
	      System.out.println("largest element is ::"+res);
	}
	

}
