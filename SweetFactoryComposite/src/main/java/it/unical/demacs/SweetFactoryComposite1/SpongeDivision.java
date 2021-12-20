package it.unical.demacs.SweetFactoryComposite1;

public class SpongeDivision implements Division{
	int empl; 
	String name=getClass().getSimpleName();
	
	
	public SpongeDivision (int emp) {
		this.empl=emp;
	}
	
	@Override
	public void printDivision() {
		System.out.println("Division: " + name + "	Numb of Employeer: " + empl );
		
	}

	public int getEmpl() {
		return empl;
	}

	public String getName() {
		return name;
	}

}
