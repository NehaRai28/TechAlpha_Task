package Task;

public class Task3 {

	public static void main(String[] args) {
    
		//Java String Program to Remove leading zeros
		//Input : 00000123789
		//Output : 123789
		
		String input="00000123789";
		char c[]=input.toCharArray();
		int count=c.length;
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			if(c[i]=='0')
				i++;
			else
				System.out.print(c[i]);
		}
		
	}

}
