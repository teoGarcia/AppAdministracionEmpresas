package TerceroMedio.UtilizacionDeLaInformacionContable.Deprecacion;

public class Deprecacion {
	
	
	
	public int[][] CalcularDepreciacionLineaRecta(int valorInicial, int valorRescate, int vidaUtil){
		int[][] data = new int[vidaUtil][6];
		int acumulador = 0;
		int depreciacion = ((100/vidaUtil));
		
		for(int i = 0; i<vidaUtil; i++) {
			data[i][0] = (i+1);
			data[i][1] = (valorInicial-valorRescate);
			data[i][2] = depreciacion;
			data[i][3] = ((data[i][1] * data[i][2])/100);
			data[i][4] = acumulador + data[i][3];
			acumulador +=   data[i][3];
			data[i][5] = (data[i][1] - data[i][4])+ valorRescate;
		}
		
		return data;
	}
	
	public int[][] CalcularDepreciacionAcelerada(int valorInicial, int valorRescate, int vidaUtil){
		
		int[][] data = new int[vidaUtil][6];
		
		int acumulador = 0;
		int accLibro = 0;
		int depreciacion = (int) ((((100.0/vidaUtil)/100.0)*2)*100.0);
		
		
		for(int i = 0; i<vidaUtil; i++) {
			data[i][0] = (i+1);
			data[i][1] = accLibro>0?accLibro:valorInicial;
			data[i][2] = depreciacion;
			data[i][3] = ((data[i][1] * data[i][2])/100);
			data[i][4] = acumulador + data[i][3];
			acumulador +=   data[i][3];
			data[i][5] = (data[i][1] - data[i][3]);
			accLibro = data[i][5];
		}
		
		return data;
	}
	

}
