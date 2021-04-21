package com.coforge.JenkinsMavenExa;

import com.coforge.JenkinsMavenEx.Players;

public class PlayersMain {
  
	public static void main(String[] args) {
		Players sachin = new Players(10,"Sachin","Maharashtra"); 
		System.out.println(sachin.getJerseyNo()+" : "
		+sachin.getPlayerName()+" : "+sachin.getState());
	
	}

}
