package redditdailyprogrammer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TexasHoldThem {

	private static Scanner sc = new Scanner(System.in);
	private static int numOfPlayers;

	Random rankSuit = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playerCount();
		HoldemPlayer You = new HoldemPlayer();
		HoldemPlayer p2 = new HoldemPlayer();
		HoldemPlayer p3 = new HoldemPlayer();
		HoldemPlayer p4 = new HoldemPlayer();
		HoldemPlayer p5 = new HoldemPlayer();
		HoldemPlayer p6 = new HoldemPlayer();
		HoldemPlayer p7 = new HoldemPlayer();
		HoldemPlayer p8 = new HoldemPlayer();
		
		
		
		
		You.dealHand();
		p2.dealHand();
		p3.dealHand();
		p4.dealHand();
		p5.dealHand();
		p6.dealHand();
		p7.dealHand();
		p8.dealHand();
		

	}

	public static int playerCount() {
		System.out.println("How many players? (2-8): ");
		numOfPlayers = sc.nextInt();
		
		ArrayList <HoldemPlayer> playerList = new ArrayList <HoldemPlayer>(numOfPlayers);
		
		//String [] playerNames = {"You", "CPU1", "CPU2", "CPU3", "CPU4", "CPU5", "CPU6", "CPU7"};
		for (int i = 0; i < numOfPlayers; i++) {
			HoldemPlayer p = new HoldemPlayer();
			playerList.add(p);
		}
		
		
		return numOfPlayers;

	}

}




