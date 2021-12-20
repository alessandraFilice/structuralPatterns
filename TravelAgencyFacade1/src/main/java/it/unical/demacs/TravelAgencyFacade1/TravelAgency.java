package it.unical.demacs.TravelAgencyFacade1;

public class TravelAgency {
	
	public void getParis() {
		Paris paris = new Paris();
		paris.getTravel();
	}
	
	public void getWien() {
		Wien wien = new Wien();
		wien.getTravel();
	}
	
	public void getPrague() {
		Prague prague = new Prague();
	    prague.getTravel();
	}
}
