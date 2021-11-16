package it.unical.demacs.AlberoNatalePrototype;
//entità concrete che verranno realmente copiate(Pallina,Nastro,Fiocco)
public class Pallina extends AlberoPrototype {

	public Pallina(String tipoDecorazione) {
		super(tipoDecorazione);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void printModel() {
        System.out.println(tipoDecorazione);
    }
}