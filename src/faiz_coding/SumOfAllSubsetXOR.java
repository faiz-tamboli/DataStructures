package faiz_coding;

public class SumOfAllSubsetXOR {

	public static void main(String[] args) {
		int arr[] = {1,3};
		int size =arr.length;
        System.out.println("The XOR total of an array :" + xorSum(arr, size));

	}


public static int xorSum(int arr[], int n) 
{  
    int bits = 0; 
    // Finding bitwise OR of all elements 
    for (int i = 0; i < n; i++) 
        bits |= arr[i]; 
    int ans = bits * (int)Math.pow(2, n-1); 
    return ans; 

}
}
