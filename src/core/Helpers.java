package core;

import java.time.LocalDate;
import java.util.Calendar;

public class Helpers {

	public static String getFechaFormat(Calendar fecha) {
		
		int Mes =(fecha.get(Calendar.MONTH))+1;
		String strFecha = fecha.get(Calendar.DATE)+"/"+Mes+"/"+fecha.get(Calendar.YEAR);
		return strFecha;
	}
	
	public static LocalDate getLocalDate(Calendar fecha) {
		 String strFecha = fecha.get(Calendar.YEAR)+"-"+fecha.get(Calendar.MONTH)+"-"+fecha.get(Calendar.DATE);
		 return LocalDate.parse(strFecha);
	}
	
	public static String getFechaFormatBetween(Calendar fecha) {
		int Mes =(fecha.get(Calendar.MONTH))+1;
		String strFecha = fecha.get(Calendar.YEAR)+"-"+Mes+"-"+fecha.get(Calendar.DATE);
		return strFecha;
	}
	
	public static String ponerPuntos(String txt) {

		String cadena = "";
		
		while(txt.length() > 3) {
			cadena =  "."+txt.substring(txt.length()-3, txt.length())+cadena; 
			txt = txt.substring(0, txt.length()-3);
		}
		
		txt = txt + cadena;
		
		
		return txt;
	}
	
	public static String currency(String txt) {
		return ponerPuntos(txt)+"$";
	}
	
	public static String getnombreMes(int mes) {
		
		switch (mes) {
		case 0:
			return "Enero";
		case 1:
			return "Febrero";
		case 2:
			return "Marzo";
		case 3:
			return "Abril";
		case 4:
			return "Mayo";
		case 5:
			return "Junio";
		case 6:
			return "Julio";
		case 7:
			return "Agosto";
		case 8:
			return "Septiembre";
		case 9:
			return "Octubre";
		case 10:
			return "Nobiembre";
		case 11:
			return "Diciembre";
		default:
			return "";
		}
		
	}
	
}
