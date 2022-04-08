import java.util.ArrayList;



public class Ticket {
	private static int idTicket;
	private double precioTotal;
	
	//ArrayList<Producte> listaProductes;
	//ArrayList de cada producto
	
	public ArrayList<Ticket> historial;
	
	//private String EntradaTicket;
	
	public ArrayList<EntradaTicket> ticket;

	//public ArrayList<Producte> listaProductes;
	

	public Ticket(ArrayList<EntradaTicket> ticket) {

		this.ticket = ticket;

	}

	
	public void mostrarTicket(ArrayList<EntradaTicket> entradas) {

		for (EntradaTicket e : entradas) {
			System.out.println(e.toString());
		}

	}

	public void afegirHistorial(Ticket t) {

		historial.add(t);
		++idTicket;

	}

	public ArrayList<Ticket> mostrarHistorial() {

		return historial;
	}
	
	//función precio total doble for (ticket/entradaticket.getpreu)

	/*public double PreuTotalTicket() {
		double totalVenta = 0;
		for (int i = 0; i < listaProductes.size(); i++) {

			totalVenta += listaProductes.get(i).getPreu_compra() * cantidad;
		}

		return Math.round(totalVenta * 100d) / 100d;
	}*/
}
