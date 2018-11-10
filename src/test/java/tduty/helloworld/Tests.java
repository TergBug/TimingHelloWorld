package tduty.helloworld;

import static org.junit.Assert.assertEquals;

import java.time.LocalTime;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.junit.Test;

public class Tests {
	private static final Logger log = LogManager.getLogger(Tests.class.getName());
	@Test
	public final void testHello_world() {
		for(int h = 0; h<24; h++) {
			for(int m = 0; m<60; m++) {
				if((h>=6&&h<9) && (m>=0&&m<60)) {
					log.info("Test for time "+h+":"+m);
					assertEquals(h+":"+m+" is morning", "morning", App.hello_world(LocalTime.of(h, m)));
				}
				else if((h>=9&&h<19) && (m>=0&&m<60)) {
					log.info("Test for time "+h+":"+m);
					assertEquals(h+":"+m+" is day", "day", App.hello_world(LocalTime.of(h, m)));
				}
				else if((h>=19&&h<23) && (m>=0&&m<60)) {
					log.info("Test for time "+h+":"+m);
					assertEquals(h+":"+m+" is evening", "evening", App.hello_world(LocalTime.of(h, m)));
				}
				else if(((h>=23&&h<24)||(h<6&&h>=0)) && (m>=0&&m<60)) {
					log.info("Test for time "+h+":"+m);
					assertEquals(h+":"+m+" is night", "night", App.hello_world(LocalTime.of(h, m)));
				}
			}
		}
		
		
	}
}
