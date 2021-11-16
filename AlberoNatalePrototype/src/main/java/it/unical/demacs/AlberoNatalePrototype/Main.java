package it.unical.demacs.AlberoNatalePrototype;
//Nel main creo un costruttore e a popolo l'hashmap. Si usano i metodi definiti nell'AddobbaAlbero per estrarre dati dalla mappa.

public class Main {
	 public static void main(String[] args){

	        AddobbaAlbero addobba=new AddobbaAlbero();
	        addobba.populateMap();

	        AlberoPrototype pallina=addobba.getDecorazione(TipoDecorazione.PALLINA);
	        System.out.println(pallina.getTipoDecorazione());
	        pallina.printModel();
	        AlberoPrototype nastro = addobba.getDecorazione(TipoDecorazione.NASTRO);
	        System.out.println(nastro.getTipoDecorazione());
	        nastro.printModel();
	    }
}
