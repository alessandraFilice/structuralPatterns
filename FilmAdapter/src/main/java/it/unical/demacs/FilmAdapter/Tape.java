package it.unical.demacs.FilmAdapter;

public class Tape implements MoviePlayer{
	private String name;
	
	public void setTape (String name) {
		this.name=name;
	}
	
	public String getTapeName() {
		return name;
	}
	
	@Override
	public void play() {
		System.out.println("[Tape: ] " + "Harry Potter");
		
	}

}
