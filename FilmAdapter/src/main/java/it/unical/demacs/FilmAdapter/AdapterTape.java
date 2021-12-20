package it.unical.demacs.FilmAdapter;

public class AdapterTape extends DVD{
	Tape tape;
	
	public AdapterTape(Tape tape) {
		this.tape=tape;
	}	

	
	public void newDVD() {
		tape.play();	
	}
	


}
