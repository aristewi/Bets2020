package gui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import domain.Event;
import businessLogic.BLFacade;
import businessLogic.BLFactory;
import businessLogic.ExtendedIterator;

public class ApplicationLauncher {

	public static void main(String[] args) {
		int isLocal = 1;
		BLFacade BLFacade = (new BLFactory()).getBusinessLogicFactory(isLocal);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date;

		try {

			date = sdf.parse("17/12/2020"); // 17 del mes que viene
			ExtendedIterator<Event> i = BLFacade.getEventsIterator(date);
			Event e;
			System.out.println("_____________________");
			System.out.println("RECORRIDO HACIA ATRÁS");
			i.goLast(); // Hacia atrás
			while (i.hasprevious()) {
				e = i.previous();
				System.out.println(e.toString());
			}
			System.out.println();
			System.out.println("_____________________");
			System.out.println("RECORRIDO HACIA ADELANTE");
			i.goFirst(); // Hacia adelante
			while (i.hasNext()) {
				e = i.next();
				System.out.println(e.toString());
			}

		} catch (ParseException e1) {
			System.out.println("Problems with date?? " + "17/12/2020");
		}

	}
}
