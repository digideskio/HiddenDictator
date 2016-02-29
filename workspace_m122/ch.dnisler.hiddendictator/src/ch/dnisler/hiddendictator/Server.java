package ch.dnisler.hiddendictator;

import java.util.HashMap;
import java.util.Map;

public class Server {
	private static Map<String, User> userMap = new HashMap<>();
	private static Map<String, Lobby> lobbyMap = new HashMap<>();

	public static User addUser(String username) {
		if (userMap.containsKey(username)) {
			return userMap.get(username);
		} else {
			return userMap.put(username, new User(username));
		}
	}

	public static Lobby addLobby(String lobbyname) {
		return lobbyMap.put(lobbyname, new Lobby());
	}

	public static Map<String, Lobby> getLobbyMap() {
		return lobbyMap;
	}

	public static User getUser(String username) {
		return userMap.get(username);
	}
}
