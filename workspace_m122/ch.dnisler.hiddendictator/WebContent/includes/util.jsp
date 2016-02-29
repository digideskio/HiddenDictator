<%@page import="ch.dnisler.hiddendictator.Status"%>
<%@page import="ch.dnisler.hiddendictator.Lobby"%>
<%@page import="ch.dnisler.hiddendictator.User"%>
<%@page import="ch.dnisler.hiddendictator.Server"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		if (request.getParameter("username") != null) {
			String username = request.getParameter("username");
			Server.addUser(username);
			User created = Server.getUser(username);
			created.setStatus(Status.REGISTERED);
			session.setAttribute("status", Status.REGISTERED);
			session.setAttribute("user", username);
			response.sendRedirect("../index.jsp");
		} else if (request.getParameter("lobbyname") != null) {
			String lobbyname = request.getParameter("lobbyname");
			Server.addLobby(lobbyname);
			Server.getLobbyMap().get(lobbyname).addUser(session.getAttribute("user").toString(),true);
			session.setAttribute("status", Status.INLOBBY);
			Server.getUser(session.getAttribute("user").toString()).setStatus(Status.INLOBBY);
			session.setAttribute("lobby", lobbyname);
			response.sendRedirect("../index.jsp");
		} else if (request.getParameter("setready") != null) {
			User user = Server.getUser(session.getAttribute("user").toString());
			user.setReady(!user.isReady());
			response.sendRedirect("../index.jsp");
		} else if (request.getParameter("join") != null) {
			session.setAttribute("lobby", request.getParameter("join"));
			Lobby lobby = Server.getLobbyMap().get(request.getParameter("join"));
			session.setAttribute("status", Status.INLOBBY);
			Server.getUser(session.getAttribute("user").toString()).setStatus(Status.INLOBBY);
			lobby.addUser(session.getAttribute("user").toString(),false);
			response.sendRedirect("../index.jsp");
		}
	%>
</body>
</html>