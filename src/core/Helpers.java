package core;

import java.util.Calendar;

public class Helpers {

	public static String getFechaFormat(Calendar fecha) {
		String strFecha = fecha.get(Calendar.DATE)+"/"+fecha.get(Calendar.MONTH)+"/"+fecha.get(Calendar.YEAR);
		return strFecha;
	}
	
}
