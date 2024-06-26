package fr.diginamic.tp_grasps.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class DateUtils {

	public DateUtils() {
		// TODO Auto-generated constructor stub
	}
	
	/** formatter Standard*/
	private static final DateTimeFormatter FORMAT_STANDARD = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	/** Transforme une date au format String en {@link LocalDateTime}
	 * @param dateStr date au format String
	 * @return LocalDateTime
	 */
	public static LocalDateTime toDate(String dateStr) {	
		return LocalDateTime.parse(dateStr, FORMAT_STANDARD);
	}

}
