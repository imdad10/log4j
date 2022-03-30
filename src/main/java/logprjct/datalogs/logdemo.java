package logprjct.datalogs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class logdemo {

	
	 private static Logger log=LogManager.getLogger(logdemo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.trace("trace is completed");
		log.error("button is not clickable");
		log.info("we have successfully login to account");
		log.debug("webelement is displayed");
		log.fatal("page is not loaded");
	}

}
