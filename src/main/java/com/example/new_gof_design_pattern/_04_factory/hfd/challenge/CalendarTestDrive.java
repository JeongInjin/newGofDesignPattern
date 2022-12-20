package com.example.new_gof_design_pattern._04_factory.hfd.challenge;

import java.util.Arrays;
import java.util.List;

public class CalendarTestDrive {
 
	public static void main(String[] args) {
		ZoneFactory zoneFactory = new ZoneFactory();
		Calendar calendar = new PacificCalendar(zoneFactory);
		List<String> appts = Arrays.asList("appt 1", "appt 2");
		calendar.createCalendar(appts);
		calendar.print();
	}
}
