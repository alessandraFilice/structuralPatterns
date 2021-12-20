package it.unical.demacs.SweetFactoryComposite1;

public class IcingDivision implements Division{
	int empl; 
	String name=getClass().getSimpleName();
	
	
	public IcingDivision (int emp) {
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
