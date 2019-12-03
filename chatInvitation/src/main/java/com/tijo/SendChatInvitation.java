package com.tijo;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.xmpp.JID;
import com.google.appengine.api.xmpp.XMPPService;
import com.google.appengine.api.xmpp.XMPPServiceFactory;

public class SendChatInvitation extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException {
		sendInvite(request,response);
	}

	@SuppressWarnings("deprecation")
	private void sendInvite(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		XMPPService xmpp = XMPPServiceFactory.getXMPPService();
		String invite = request.getParameter("invite");
		try {
			xmpp.sendInvitation(new JID(invite));
			response.getWriter().println("Chat Invite Send to: "+invite);
		}catch(Exception e)
		{
			e.printStackTrace();
			response.getWriter().println("Unable to send Chat to invite: "+invite);
		}
	}
	
}
