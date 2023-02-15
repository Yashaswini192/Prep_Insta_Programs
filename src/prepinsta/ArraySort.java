package prepinsta;

import java.util.HashSet;
import java.util.Set;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[9];
		arr[0] = 54;
		arr[1] = 98;
		arr[2] = 26;
		arr[3] = 12;
		arr[4] = 23;
		arr[5] = 56;
		arr[6] = 12;
		arr[7] = 23;
		arr[8] = 66;
		int temp = 0;
		
		//sorting array elements
		for(int i = 0;i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i< arr.length; i++)
		System.out.println(arr[i]+" ");
		
		//removing duplicate values
		Set hash_set = new HashSet();
		for(int i = 0; i < arr.length; i++) 
			hash_set.add(arr[i]);
		System.out.println(hash_set);
		}
	}
	

