package TestMaven.SeleniumPractice;

public class Freq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name = "Study Tonight";
int[] ch = new int[name.length()];
char sh[]= name.toCharArray();

for(int i =0; i<name.length(); i++)
{
	ch[i]=1;
	for(int j=i+1; j<name.length(); j++)
	{
		if(ch[i]==sh[j])
		{
			ch[i]++;
			sh[i]='0';
		}
	}
}

for(int i=0; i<ch.length; i++)
{
	if(sh[i]!= ' ' && sh[i]!= '0')
	{
		System.out.println(sh[i]+"  "+ch[i]);
	}
}
	}

}
