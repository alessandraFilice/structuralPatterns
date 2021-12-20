package it.unical.demacs.FilmAdapter;

public class DVD implements MoviePlayer{
	private String name;
	
	public void setDVD (String name) {
		this.name=name;
	}
	
	@Override
	public void play() {
		System.out.println("[DVD: ] " + name);
		
	}

}
