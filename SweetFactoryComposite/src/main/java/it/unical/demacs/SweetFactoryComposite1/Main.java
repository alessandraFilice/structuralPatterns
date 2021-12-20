package it.unical.demacs.SweetFactoryComposite1;

public class Main {
	public static void main(String[] args) {
		
		//creo la fabbrica di dolci vuota
		CompositeDivision factory= new CompositeDivision();

		
		//Creo la Divisione torte , che è composta dalla divisione "base torta"(sponge) e dalla divisione "glassa" (icing)
		CompositeDivision cakeDivision= new CompositeDivision();
		SpongeDivision spongeDivision= new SpongeDivision( 11);
		IcingDivision icingDivision= new IcingDivision(8);

		cakeDivision.addDivision(spongeDivision);
		cakeDivision.addDivision(icingDivision);
		
		//Creo la Divisione crostata, che è composta dalla divisione "frolla"(pastry) e dalla divisione "marmellata" (jam)
		CompositeDivision pieDivision= new CompositeDivision();
		PastryDivision pastryDivision= new PastryDivision(17);
		JamDivision jamDivision=new JamDivision(6);
		
		pieDivision.addDivision(jamDivision);
		pieDivision.addDivision(pastryDivision);
		
		//inserisco nekla fabbrica di dolci la divisone torte e dalla divisione crostata
		factory.addDivision(pieDivision);
		factory.addDivision(cakeDivision);
		factory.printDivision();

	}
}
