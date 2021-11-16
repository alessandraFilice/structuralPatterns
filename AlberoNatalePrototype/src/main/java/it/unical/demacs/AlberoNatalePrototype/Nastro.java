package it.unical.demacs.AlberoNatalePrototype;
//entità concrete che verranno realmente copiate(Pallina,Nastro,Fiocco)
public class Nastro extends AlberoPrototype {

		public Nastro(String tipoDecorazione) {
			super(tipoDecorazione);
			// TODO Auto-generated constructor stub
		}
		
		@Override
	    public void printModel() {
	        System.out.println(tipoDecorazione);
	    }
}
