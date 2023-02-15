package prepinsta;

public class LargestArray {
	//prints largest and smallest number in an Array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		arr[0] = 54;
		arr[1] = 98;
		arr[2] = 26;
		arr[3] = 12;
		arr[4] = 23;

		int max = arr[0];
		int min=arr[0];

		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			System.out.println(arr[i]);
		}
		System.out.println("largest number is: "+max);

		for(int i=0;i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("smallest number is: "+min);
		System.out.println("sum of elements:"+(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]));
	}
	
}
