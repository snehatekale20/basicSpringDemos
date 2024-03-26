package com.SimpleSpring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	
	Heart heart;

	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public Human(Heart heart) {
		this.heart = heart;
	}

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void startPumping() {
		heart.pump();
	}

}
