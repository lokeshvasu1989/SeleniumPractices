package TestMaven.SeleniumPractice;

public class FreqCharStr {

	public static void main(String[] args) {
		  String str = "Study Tonight";  
	        int[] freq = new int[str.length()];  
	        System.out.println("The entered string is "+str);
	        //Convert the given string into character array  
	        char str1[] = str.toCharArray();            
	        for(int i = 0; i <str.length(); i++) 
	        {  
	            freq[i] = 1;  
	            for(int j = i+1; j <str.length(); j++) 
	            {  
	                if(str1[i] == str1[j])
	                {  
	                    freq[i]++;  
	                      
	                    //Set str1[j] to 0 to avoid printing visited character  
	                    str1[j] = '0';  
	                }  
	            }  
	        }            
	       
	        
	        for(int i = 0; i <freq.length; i++) 
	        {  
	            if(str1[i] != ' ' && str1[i] != '0')  
	                System.out.println(str1[i] + "              " + freq[i]);  
	        }  
	}

}
