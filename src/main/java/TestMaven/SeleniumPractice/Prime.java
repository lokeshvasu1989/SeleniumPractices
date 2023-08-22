package TestMaven.SeleniumPractice;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeOrNot(); primeList(); fibo(); palin(); palinStr();
	}
	
	public static void primeOrNot()
	{
		int num = 94;
		boolean flag= false;
		
		for(int i=2; i<num/2; i++)
		{
			if(num%i==0)
			{
				flag = true;
			}
		}
		
		if(!flag)
		{
			System.out.println(num+" is a prime number");
		}
		else
		{
			System.out.println(num+" is not a prime number");
		}
	}
	
	public static void primeList()
	{
		int i,j, pr;
		
		for(i=2; i<=100; i++)
		{
			pr=0;
			for(j=2; j<=i/2; j++)
			{
				if(i%j==0)
				{
				pr=1;
				break;
				}
			}
			if(pr==0)
			{
				System.out.print(i+" ");
			}
		}
		
		
	}
	
	public static void fibo()
	{
		int n1=0,n2=1,n3, count=10;
		System.out.println("*********************************");
		System.out.print(n1+" "+n2);
		
		for(int i=2; i<=count; i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
	
	public static void palin()
	{
	int r, sum=0, num=151, temp;
	temp=num;
	while(num>0)
	{
		r=num%10;
		sum=(sum*10)+r;
		num=num/10;
	}
	if(temp==sum)
	{
		System.out.println("It is a palindrome");
	}
	else
	{
		System.out.println("It is not a palindrome");
	}
	}
	
	public static void palinStr()
	{
		String name = "gog";
		String rev = "";
		 
		int len=name.length();
		
		for(int i =(len-1); i>=0;--i)
		{
			rev = rev + name.charAt(i);
		}
		
		if(name.toLowerCase().equals(rev.toLowerCase()))
		{
			System.out.println(name+" is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}

}
