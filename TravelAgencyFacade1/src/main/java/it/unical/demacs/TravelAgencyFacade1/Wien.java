package it.unical.demacs.TravelAgencyFacade1;

public class Wien implements Travel{
	String hotel= "WienHotel= 296";
	String stay= "23/12/2021 - 28/12/2021";
	String fly= "Milan-Wien (10:30 AM) = 26euro\n"
			+ "Wien-Milan (4:30 PM) = 31euro" ;
			
	
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
		System.out.println("Wien:\n"+ stay  + "\n"+ hotel + "\n"+ fly + "\n");
	}

	
	

}
