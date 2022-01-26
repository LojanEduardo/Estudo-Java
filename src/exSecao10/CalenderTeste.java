package exSecao10;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalenderTeste {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2022-01-25T15:55:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d);
		//cal.add(Calendar.HOUR_OF_DAY, 4); //Adicionando 4 horas
		//d = cal.getTime();
		int minutes = cal.get(Calendar.MINUTE); //Get de minutos
		int mounth = 1 + cal.get(Calendar.MONTH);
		
		
		System.out.println(sdf.format(d));
		
		
	}

}
