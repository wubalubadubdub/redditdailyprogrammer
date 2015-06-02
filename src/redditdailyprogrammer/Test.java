package redditdailyprogrammer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Test {

	private Object playerHand;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> dealt = new ArrayList<String>();
		dealt.add("5h");
		dealt.add("2c");
		
		System.out.println(dealt.contains("5h"));
		
		String[] playerHand = new String[2];
		Test t1 = new Test();
		
		
		
		String[] hand = {"5h", "Js"};
		String[] board = {"10s", "Kc", "Ah", "3s", "3d"};
		
		String[] total = Stream.concat(Arrays.stream(hand), Arrays.stream(board))
				.toArray(String[]::new);
		
		for (String s: total) {
			System.out.println(s);
		}
		

	}

}
