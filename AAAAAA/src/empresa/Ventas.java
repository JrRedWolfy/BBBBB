
package empresa;

public class Ventas {

	private String cliente;
	
	private int producto;
	
	private int cantidad;
	
	private double precioU;  //Precio Unitario

	// Constructor
	public Ventas(String cliente, int producto, int cantidad, double precioU) {
		this.cliente = cliente;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precioU = precioU;
	}

	//Cliente
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	//Producto
	public int getProducto() {
		return producto;
	}
	public void setProducto(int producto) {
		this.producto = producto;
	}

	//Cantidad
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	//Precio
	public double getPrecioU() {
		return precioU;
	}
	public void setPrecioU(double precioU) {
		this.precioU = precioU;
	}

	// ToString
	@Override
	public String toString() {
		return "+ " + cliente + ": " + producto + ";  x" + cantidad + "               Precio por unidad"
				+ precioU;
	}
	
	
	
	public static void rellenarVector(Ventas[] vVenta, String info, int longitud, int nVenta){
		
		String cliente ="";
		int producto = 000000;
		int cantidad = 0;
		double precioU = 0;
		int check = 0;
		
		for (int i = 0; i <= longitud; i++){
			
			if (info.substring(i, i+1).equalsIgnoreCase("<")){
				
				for (int j = i; ((!info.substring(j, j+1).equalsIgnoreCase("<"))||(j == longitud)); j++){
					
					if (info.substring(j, j+1).equalsIgnoreCase(">")){
						
						check += 1;
						switch (check){
						case 1:
							cliente = (String) info.substring(i, j);
							
							break;
						case 2:
							
							producto = Integer.parseInt(info.substring(i, j));
							
							break;
						case 3:
							cantidad = Integer.parseInt(info.substring(i, j));
							
							break;
						case 4:
							precioU = Double.parseDouble(info.substring(i, j));
							
							break;
						default:
							System.out.println("Pero que ha pasado D:");
							break;
						}
						i = j;
					}
				
				}
				
			}
			
		}
		
		
		
		
		
		 vVenta[nVenta] = new Ventas(cliente, producto, cantidad, precioU);
		
	}
	
	
	public static void calcularGanancia(String cliente, Ventas[] vVenta){
		
		double total = 0;
		
		for (Ventas x: vVenta){
			if (x != null){
				
				if (x.getCliente().equalsIgnoreCase(cliente)){
					
					total += (x.getCantidad()*x.getPrecioU());
					
				}	
			}
		}
		
		System.out.println( cliente + " ha gastado un total de " + total + " euros.");
		
	}
	
	
	public static void nClientes(Ventas[] vVenta, String[] vCliente){
		
		int nCliente = 0;
		String cliente = "";
		
		
		for (Ventas x: vVenta){
			
			boolean repetido = false;
			if (x != null){
				cliente = x.getCliente();
				
				for (String y: vCliente){
				
					if (!y.equalsIgnoreCase(cliente)){
						
						
						
					}
				}
			}
		}
		
		
		
		
	}
	
	
	
	
	
	
}
