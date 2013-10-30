import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import com.posbravo.count.Counter;


public class TestCount {
	Counter c;
	@Test
	public void test() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter start number");
		int start = scan.nextInt();
		System.out.println("Enter end number");
		int end = scan.nextInt();
		c = new Counter(start,end);
		
		for(int i=start; i<=end; i++)
		System.out.println(c.increment());
	}

}
