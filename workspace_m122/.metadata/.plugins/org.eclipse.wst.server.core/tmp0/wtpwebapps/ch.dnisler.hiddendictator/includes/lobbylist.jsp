<%@page import="ch.dnisler.hiddendictator.Lobby"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page import="ch.dnisler.hiddendictator.Server"%>
<%@page import="java.util.Map"%>
<h1>Lobby List</h1>
<ul>

	<%
		response.setIntHeader("Refresh", 15);
		Map<String, Lobby> lobbyMap = Server.getLobbyMap();
		Iterator it = lobbyMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			out.print("<li>");
			out.print(pair.getKey());
			out.print("<a href='includes/util.jsp?join=" + pair.getKey() + "'> join</a>");
			out.print("</li>");
		}
	%>
</ul>
<form method="get" action="includes/util.jsp">
	<input name="lobbyname" class="form-control" type="text"></input> <input
		class="form-control" type="submit"></input>
</form>