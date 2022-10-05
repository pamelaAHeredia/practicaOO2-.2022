package ar.edu.unlp.info.oo2.repaso_p1_ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String sName; 
	private List<Tweet> tweets; 
	
	public Usuario(String sName) {
		this.sName = sName; 
		this.tweets = new ArrayList<Tweet>(); 
	}
	
	public boolean esNombre(String name) {
		return this.sName.equals(name); 
	}
	
	public void eliminarTweets() {
		tweets.clear(); 
	}
	
	public Tweet nuevoTweet(String txt) {
		if(txt.length() > 0 && txt.length() < 15) {
			Tweet tw = new Tweet(txt); 
			tweets.add(tw); 
			return tw; 
		}
		return null; 
	}
	
	public Tweet compartirTweet(String txt, Tweet origen) {
		if(txt.length() > 0 && txt.length() < 15) {
			Tweet tw = new Tweet(txt, origen); 
			tweets.add(tw); 
			return tw; 
		}
		return null; 
	}

	public String getsName() {
		return sName;
	}


	public List<Tweet> getTweets() {
		return tweets;
	}

	public void setTweets(List<Tweet> tweets) {
		this.tweets = tweets;
	}
	
	
}
