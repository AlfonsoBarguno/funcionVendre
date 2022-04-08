import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Arbre extends Producte {
	private String idArbre;
	private double alçaria;

	public Arbre() {
	}

	public Arbre(String idArbre, String nom, double alçaria, double preu_compra, int quantitat) {
		super(nom, preu_compra, quantitat);
		this.idArbre = idArbre;
		this.alçaria = alçaria;
	}

	@Override
	public String toString() {
		return " idArbre: " + this.idArbre + " Arbre nom: " + this.getNom() + " Alçaria:" + this.alçaria
				+ " Preu de compra: " + this.getPreu_compra() + " â‚¬ Quantitat: " + this.getQuantitat();
	}

	public String getIdArbre() {
		return idArbre;
	}

	public void setIdArbre(String idArbre) {
		this.idArbre = idArbre;
	}

	public double getAlçaria() {
		return alçaria;
	}

	public void setAlçaria(double alçaria) {
		this.alçaria = alçaria;
	}

	public void EscribirFicheroArbol(ArrayList<Arbre> array) {

		FileOutputStream fos = null;
		ObjectOutputStream salida = null;

		try {
			// Se crea el fichero
			fos = new FileOutputStream("Arbre.txt");
			salida = new ObjectOutputStream(fos);
			for (int i = 0; i < array.size(); i++) {
				salida.writeObject(array.get(i));
			}
			salida.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public ArrayList<Arbre> LecturaFicheroArboles() throws IOException, ClassNotFoundException {
		ArrayList<Arbre> array = new ArrayList<Arbre>();
		FileInputStream fis = null;

		Arbre a = new Arbre();

		fis = new FileInputStream("Arbre.txt");
		ObjectInputStream entrada = new ObjectInputStream(fis);

		boolean cont;
		cont = true;

		while (cont) {
			try {
				a = (Arbre) entrada.readObject();
				array.add(a);

			} catch (Exception e) {
				cont = false;
			}
		}
		entrada.close();
		return array;

	}

	public void vendreArbre(ArrayList<Arbre> listaArbre) {

		

		Scanner input = new Scanner(System.in);

		System.out.println("¿Quin és l'id de l'arbre que vol comprar?");
		String idArbre = input.nextLine();

		for (int i = 0; i < listaArbre.size(); i++) {

			if (listaArbre.get(i).getIdArbre().equalsIgnoreCase(idArbre)) {
				System.out.println("Arbre trobat.");
			} /*else {
				System.out.println("Arbre no trobat.");

				vendreArbre(listaArbre);
			}*/
		}

		System.out.println("¿Quants en vol?");
		int cantidad = input.nextInt();

		for (int i = 0; i < listaArbre.size(); i++) {

			if (listaArbre.get(i).getQuantitat() > cantidad) {
				// modificar la quantitat
				listaArbre.get(i).setQuantitat(listaArbre.get(i).getQuantitat() - cantidad);

				// afegir dades a la entrada
				String nom = listaArbre.get(i).getNom();
				String id = listaArbre.get(i).getIdArbre();
				double preu = listaArbre.get(i).getPreu_compra();
				int quantitat = listaArbre.get(i).getQuantitat();

				EntradaTicket entrada = new EntradaTicket(id, nom, preu, quantitat);

				ArrayList<EntradaTicket> Ticket = new ArrayList<EntradaTicket>();

				Ticket.add(entrada);
			}
			// venta.add(
			else {
				System.out.println("Quantitat insuficient.");
				vendreArbre(listaArbre);
			}}

			System.out.println("El árbol se ha añadido al carrito. "
					+ "¿Qué desea hacer? 1. Comprar otro árbol. 2. Comprar otro producto. " + "3. Validar compra");

			int respuesta = input.nextInt();

			switch (respuesta) {
			case 1:
				vendreArbre(listaArbre);
				break;
			case 2: // menu2();
				break;
			case 3: // afegirHistorial(Ticket);
					// EscribirFicheroTicket(Ticket);
					// mostrarTicket(Ticket);
				break;
			}
		}
	}


