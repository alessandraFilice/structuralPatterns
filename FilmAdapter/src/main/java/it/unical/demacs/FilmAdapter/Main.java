package it.unical.demacs.FilmAdapter;

public class Main {
	 public static void main(String[] args) {
		 
		 Tape movie1=new Tape ();
		 movie1.setTape("Harry Potter");
		 DVD movie2=new DVD ();
		 movie2.setDVD("Sherlock Holmes");
		 
		 DVD adapterDVD = new AdapterTape(movie1);
		 adapterDVD.setDVD(movie1.getTapeName());
		 
		 movie1.play();
		 movie2.play();
		 System.out.println("\nAdapter from Tape to DVD:");
		 adapterDVD.play();

	 }
}
