package it.unical.demacs.TravelAgencyFacade1;
public class Paris implements Travel{
	String hotel= "ParisHotel: 320euro";
	String stay= "10/12/2021 - 15/12/2021";
	String fly= "Rome-Paris (8:50 AM)=41euro\n"
			+ "Paris-Rome(13:20)= 37euro " ;
			
	
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
		System.out.println("Paris:\n" + stay + "\n"+ hotel +"\n"+ fly + "\n");
	}

}
