package Task;

public class Task4 {

	public static void main(String[] args) {
     
		//Input : arr [] = { 1, 2, 3, 4, 5, 6, 7 } , d=2
		//Explanation: d=2 so 2 elements are rotate to the end of the
		//array. So 1 2 is rotate back.
		//So, Final Output : 3, 4, 5, 6, 7, 1, 2
		
		int arr[]={1,2,3,4,5,6,7};
		int cycle=2;
		int temp;
		for(int i=0;i<cycle;i++){
			int last=arr[0];
			for(int j=0;j<arr.length-1;j++)
				arr[j]=arr[j+1];
			
				arr[arr.length-1]=last;
		}
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		
	}

}
