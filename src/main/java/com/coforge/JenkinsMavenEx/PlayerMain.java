package com.coforge.JenkinsMavenEx;

public class PlayerMain {
 
	public static void main(String[] args) {
		Players sachin = new Players(10,"Sachin","Maharashtra"); 
		System.out.println(sachin.getJerseyNo()+" : "
		+sachin.getPlayerName()+" : "+sachin.getState());
	
	}

}
