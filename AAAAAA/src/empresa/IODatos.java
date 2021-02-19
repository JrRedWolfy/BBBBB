package empresa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IODatos {

	public static void generarVector(Ventas[] vVenta) {
		
		File f = new File("ventas.dat");
		FileReader fr =null;
		Scanner leer = null;
		int nVenta = 0;
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		try {
			fr = new FileReader(f);
			leer = new Scanner(fr);
			
			while(leer.hasNext()) {
				String info = leer.nextLine();
				
				int longitud = info.length();
				
				Ventas.rellenarVector(vVenta, info, longitud, nVenta);	
				nVenta += 1;
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			leer.close();
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
		
		
		
}

