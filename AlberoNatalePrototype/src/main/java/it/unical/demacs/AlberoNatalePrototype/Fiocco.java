package it.unical.demacs.AlberoNatalePrototype;
//entità concrete che verranno realmente copiate(Pallina,Nastro,Fiocco)

public class Fiocco extends AlberoPrototype {

	public Fiocco(String tipoDecorazione) {
		super(tipoDecorazione);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void printModel() {
        System.out.println(tipoDecorazione);
    }
	
}
