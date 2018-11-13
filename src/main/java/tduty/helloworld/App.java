package tduty.helloworld;

import java.util.ResourceBundle;
import java.time.LocalTime;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger log = LogManager.getLogger(App.class.getName());
	
	public static String getTimeOfDay(LocalTime in) {
		if(in.isAfter(LocalTime.of(5, 59, 59, 999999999)) && in.isBefore(LocalTime.of(9, 0, 0, 0))) {
			return "morning";
		}
		else if(in.isAfter(LocalTime.of(8, 59, 59, 999999999)) && in.isBefore(LocalTime.of(19, 0, 0, 0))) {
			return "day";
		}
		else if(in.isAfter(LocalTime.of(18, 59, 59, 999999999)) && in.isBefore(LocalTime.of(23, 0, 0, 0))) {
			return "evening";
		}
		else {
			return "night";
		}
	}
	
	public static void main(String[] args) {
		log.debug("---Starting program---");
		log.debug("Create object ResourceBundle");
		ResourceBundle rb = ResourceBundle.getBundle("message-resource");
		log.debug("Get current time");
		LocalTime lt = LocalTime.now();
		log.debug("Get key-word for time "+lt.toString());
		String key = getTimeOfDay(lt);
		log.debug("Get string from message resource on \""+key+"\" key");
		String s = rb.getString(key);
		log.debug("Display this string in console");
		System.out.println(s);
	}
}
