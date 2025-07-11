package day1;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string-");
		String s = sc.nextLine();
		
		int[] freq = new int[256];
		for(int i=0;i<s.length();i++) {
			freq[s.charAt(i)]++;
			
		}
		
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>1) {
				System.out.println("duplicate characters-"+ (char)i +":"+freq[i]);
			}
		}
		
		sc.close();

	}

}
