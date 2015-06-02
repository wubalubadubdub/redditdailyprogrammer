package redditdailyprogrammer;

import java.util.ArrayList;

public class HoldemPlayer {
	
	public String name;
	public ArrayList <String> hand = new ArrayList<String>();
	
	HoldemPlayer(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}

}
