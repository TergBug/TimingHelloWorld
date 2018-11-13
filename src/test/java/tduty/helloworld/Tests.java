package tduty.helloworld;

import static org.junit.Assert.assertEquals;

import java.time.LocalTime;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.junit.Test;

public class Tests {
	private static final Logger LOG = LogManager.getLogger(Tests.class.getName());
	
	@Test
	public final void testGetTimeOfDay() {
		for(int h = 0; h<24; h++) {
			for(int m = 0; m<60; m++) {
				LOG.info("Test for time "+h+":"+m);
				if((h>=6&&h<9) && (m>=0&&m<60)) {
					assertEquals(h+":"+m+" is morning", "morning", App.getTimeOfDay(LocalTime.of(h, m)));
				}
				else if((h>=9&&h<19) && (m>=0&&m<60)) {
					assertEquals(h+":"+m+" is day", "day", App.getTimeOfDay(LocalTime.of(h, m)));
				}
				else if((h>=19&&h<23) && (m>=0&&m<60)) {
					assertEquals(h+":"+m+" is evening", "evening", App.getTimeOfDay(LocalTime.of(h, m)));
				}
				else {
					assertEquals(h+":"+m+" is night", "night", App.getTimeOfDay(LocalTime.of(h, m)));
				}
			}
		}
	}
}
