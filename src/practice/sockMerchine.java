package practice;
import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class sockMerchine {
	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		int count = 0;
		List <Integer> weGotIt = new ArrayList<>(n);
		for (int i = 0;i<ar.length;i++){
			for(int j = i+1;j<ar.length;j++){
				if(weGotIt.contains(ar[i])){
					weGotIt.remove(ar[i]);
					break;
				}else if(ar[i]==ar[j]){
					count++;
					weGotIt.add(ar[i]);
				}
				
			}
		}
		return count;
		
		
		
		
		
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		int[] ar = new int[n];
		
		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}
		
		int result = sockMerchant(n, ar);
		
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		
		bufferedWriter.close();
		
		scanner.close();
	}
}
