package uaiContacts.controller;

import org.hsqldb.util.DatabaseManager;
import org.hsqldb.util.DatabaseManagerSwing;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bd")
public class DBManager {

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody String lunchHSQLManager(){
		/*
		String[] args = {"--url", "jdbc:hsqldb:hsql//localhost/uaiContacts", "--noexit","--user", "sa", "--password", ""}};
		DatabaseManagerSwing.main(args);
		*/
		DatabaseManager.threadedDBM();
		return "ok";
	}

}
