package ch.dnisler.hiddendictator;

import java.util.ArrayList;
import java.util.List;

public class Lobby {
	private List<User> userList = new ArrayList<>();
	private boolean ingame = false;

	public boolean addUser(String username, boolean isAdm) {
		Server.getUser(username).setAdm(isAdm);
		return userList.add(Server.getUser(username));
	}

	public void startGame() {

	}

	public List<User> getUserList() {
		return userList;
	}
}