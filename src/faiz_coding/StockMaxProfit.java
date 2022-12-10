package faiz_coding;

public class StockMaxProfit {
	public static int MaxProfit(int[] arr) {
		//ith day to start of array i.e array[0]
        int day = arr[0];
        int maxProfit =0;
        int size = arr.length;
    
        for (int i = 0; i < size; i++) {
        	int profit = 0;
            if (arr[i] > day) {
                profit = arr[i] - day;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            } else {
                day = arr[i];
            }
        }
        return maxProfit;
        
    }
	public static void main(String[] args) {
		 int arr[] = {7,1,5,3,6,4};
	        System.out.println("Maximum profit :" + MaxProfit(arr));

		}

}
