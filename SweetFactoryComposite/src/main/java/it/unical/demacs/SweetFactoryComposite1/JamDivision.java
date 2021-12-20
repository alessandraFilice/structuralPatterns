package it.unical.demacs.SweetFactoryComposite1;

public class JamDivision implements Division{
	int empl; 
	String name=getClass().getSimpleName();
	
	
	public JamDivision (int emp) {
		this.empl=emp;
	}
	
	@Override
	public void printDivision() {
		System.out.println("Division: " + name + "Numb of Employeer: " + empl );
		
	}
}
