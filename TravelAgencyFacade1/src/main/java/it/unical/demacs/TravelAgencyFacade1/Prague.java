package it.unical.demacs.TravelAgencyFacade1;

public class Prague implements Travel{
	String hotel= "PragueHotel = 248euro";
	String stay= "21/12/2021 - 25/12/2021";
	String fly= "Turin-Prague (3:00 PM) = 41euro\n"
			+ "Prague-Turin (8:30 AM) = 19euro" ;
			
	
	public String getPlace() {
		return getClass().getSimpleName();
	}

	
	public String getHotel() {
		return hotel;
	}

	
	public String getFly() {
		return fly;
	}

	
	public String getStay() {
		return stay;
	}
	

	@Override
	public void getTravel() {
		System.out.println("Prague:\n"+stay +"\n"+ hotel + "\n"+fly+"\n");
	}

}