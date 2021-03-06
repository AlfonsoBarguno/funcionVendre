import java.io.Serializable;

public class Producte implements Serializable {
	private String nom;
	private double preu_compra;
	private int quantitat;
	private boolean disponible = false;

	public Producte() {
	}
	public Producte(String nom, double preu_compra, int quantitat) {
		
		this.nom = nom;
		this.preu_compra = preu_compra;
		this.quantitat = quantitat;
	}
	
	public String toString() {
		return "Nom: " + this.getNom() + "\n"
				+ "Preu de compra: " + this.getPreu_compra() + " €\n" 
				+ "Quantitat: " + this.getQuantitat() + "\n";
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPreu_compra() {
		return preu_compra;
	}
	public void setPreu_compra(double preu_compra) {
		this.preu_compra = preu_compra;
	}
	public int getQuantitat() {
		return quantitat;
	}
	public void setQuantitat(int quantitat) {
		this.quantitat = quantitat;
	}
	
	public boolean estaDisponible(){ 
		if(getQuantitat()>0) this.disponible = true;
		return this.disponible;}
}
	



