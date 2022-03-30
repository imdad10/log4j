package demos;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class dam {

	
	
	 private static Logger log=LogManager.getLogger(dam.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.trace("trace 2 is completed");
		log.error("button 2 is not clickable");
		log.info("we 2 have successfully login to account");
		log.debug("webelement is displayed");
		log.fatal("page is not loaded");
		
		
	}

}
