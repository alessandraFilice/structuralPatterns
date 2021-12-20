package it.unical.demacs.SweetFactoryComposite1;

import java.util.ArrayList;


/*Questa classe è la vera e propria classe Composite corrispondente alla gerarchia.
 * E' composta da più componenti Division e contiene metodi per aggiungere ulteriori 
 * elementi (addDivision) o rimuovere elementi esistenti (removeDivision), in aggiunta al metodo 
 * printDivision():*/

public class CompositeDivision implements Division{

	private ArrayList<Division> divisions=new ArrayList<Division>();
	

	public void addDivision(Division division) {
		divisions.add(division);
	}

	
	public void removeDivision(Division division) {
		divisions.remove(division);

	} 
	
    @Override
    public void printDivision(){
    	for(Division div:divisions)
        {
            div.printDivision();
        }
    }

	

	
}
