package faiz_coding;

public class LeaderInArray {

	public static void main(String[] args) {
		{
		      int arr[] = {7, 10, 4, 10, 6, 5, 2};
		      int size = arr.length;
		      int right =arr[size-1];
		      System.out.print(right+" ");
		      for (int i= size-2;i>=0;i--)
		      if(arr[i]>right)
		      {
		          right=arr[i];
		          System.out.print(right+" ");
		      }
		      }

	}

}
