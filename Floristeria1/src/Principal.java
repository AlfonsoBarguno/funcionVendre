import java.util.ArrayList;

public class Principal {
	
	public static void main (String [] args) {
		
		
		
		ArrayList<Arbre> listaArbre = new ArrayList<Arbre>();
		
		Arbre a1 = new Arbre("mrt", "Pino", 34, 23, 200);
		Arbre a2 = new Arbre("ghm", "Roble", 35, 25, 50);
		Arbre a3 = new Arbre("jku", "Abeto", 31, 24, 130);
		Arbre a4 = new Arbre("yui", "Abeto", 31, 24, 130);

		a1.getAlçaria();
		a1.getQuantitat();
		
		listaArbre.add(a1);
		listaArbre.add(a2);
		listaArbre.add(a3);
		
		//a1.vendreArbre(listaArbre);
		
		
		
		
		

	}
}
	