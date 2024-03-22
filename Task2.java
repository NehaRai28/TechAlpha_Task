package Task;

public class Task2 {

	public static void main(String[] args) {
            
		//FIRST HALF
		int num=5;
		for(int i=1;i<=num;i++){
			//for first left triangle
			char a='A';	
			for(int j=1;j<=i;j++){
				if(j==1 || j==i)
				System.out.print(a);
				else
					System.out.print(" ");
				a++;
			}		
			
			//for spacing
			for(int s=1;s<=2*(num-i);s++)
				System.out.print(" ");
			
			//for right side triangle
			char b='A';
			for(int j2=1;j2<=i;j2++){
				if(j2==1 || j2==i)
				System.out.print(b);
				else
					System.out.print(" ");
				b++;
			}
			
			//for moving next line
			System.out.println("");
		}
		
		
		//SECOND HALF
		
		for(int i2=num;i2>=1;i2--){
			//for left triangle
			char a='A';
			for(int j2=1;j2<=i2;j2++){
				if(j2==1 || j2==i2)
				System.out.print(a);
				else
					System.out.print(" ");
				a++;
			}		
			
			//for spacing
			for(int s2=1;s2<=2*(num-i2);s2++)
				System.out.print(" ");
			
			//for right side triangle
			char b='A';
			for(int j1=1;j1<=i2;j1++){
				if(j1==1 || j1==i2)
				System.out.print(b);
				else
					System.out.print(" ");
				b++;
			}
			
			//for moving next line
			System.out.println("");
		}
		
		
		
	}

}
