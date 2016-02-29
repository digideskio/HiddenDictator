package ch.dnisler.hiddendictator;

import javax.servlet.http.HttpSession;

public class Util {
	public static String getPage(HttpSession session) {
		if (session.getAttribute("status") != null) {
			if (session.getAttribute("status").equals("registered")) {
				return "lobbylist";
			} else if (session.getAttribute("status").equals("inlobby")) {
				return "lobby";
			} else {
				return "home";
			}
		} else {
			return "home";
		}
	}

}