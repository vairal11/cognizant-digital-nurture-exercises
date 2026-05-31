package com.cognizant.ex19;

public class Piano implements Playable {

	@Override
	public void play() {

		System.out.println("Playing Piano");

	}

	public static void main(String[] args) {

		Playable g = new Guitar();
		Playable p = new Piano();

		g.play();
		p.play();
	}

}
