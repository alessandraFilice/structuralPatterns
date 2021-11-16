package it.unical.demacs.AlberoNatalePrototype;

/*in questa classe è definito un oggetto map che contiene oggetti di tipo AlberoCPrototype identificati da un membro dell'enum 
 *dando origine così alla coppia <Enum, AlberoPrototype>.
  Il metodo populateMap() popola la mappa con tre oggetti, uno per ogni elemento dell'enum. Il metodo getDecorazione() invece restituisce
  la copia di una decorazione che stiamo cercando in base al suo identificatore nell'hashmap se e solo se esiste, altrimenti restituisce null.
*/

import java.util.HashMap;
import java.util.Map;

public class AddobbaAlbero {
	 private Map<Enum,AlberoPrototype> decoraziones = new HashMap<>();

	    public AlberoPrototype getDecorazione(TipoDecorazione tipo){
	        AlberoPrototype decorazione=decoraziones.get(tipo);
	        if(decorazione==null){
	            return null;
	        }
	        return decorazione.clone();
	    }

	    public void populateMap(){
	        decoraziones.put(TipoDecorazione.PALLINA, new Pallina("Pallina Rossa"));
	        decoraziones.put(TipoDecorazione.NASTRO, new Nastro("Nastro Oro"));
	        decoraziones.put(TipoDecorazione.FIOCCO, new Fiocco("Fiocco Bianco"));
	    }
}
