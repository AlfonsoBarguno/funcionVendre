
public class EntradaTicket {
	private String id;
	private String nom;
	private double preu;
	private int quantitat;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

	public int getQuantitat() {
		return quantitat;
	}

	public void setQuantitat(int quantitat) {
		this.quantitat = quantitat;
	}

	public EntradaTicket(String id, String nom, double preu, int quantitat) {
		
		this.id = id;
		this.nom = nom;
		this.preu = preu;
		this.quantitat = quantitat;
		
	}

	public EntradaTicket(String string) {
		// TODO Auto-generated constructor stub
	}
	
	
}


