package com.tijo;

import java.io.IOException;
import java.util.logging.Level;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.xmpp.JID;
import com.google.appengine.api.xmpp.Message;
import com.google.appengine.api.xmpp.MessageBuilder;
import com.google.appengine.api.xmpp.PresenceShow;
import com.google.appengine.api.xmpp.PresenceType;
import com.google.appengine.api.xmpp.SendResponse;
import com.google.appengine.api.xmpp.XMPPService;
import com.google.appengine.api.xmpp.XMPPServiceFactory;

public class MessageReceiver extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException {
		messageReceiver(request,response);
	}

	private void messageReceiver(HttpServletRequest request, HttpServletResponse response) throws IOException {
		XMPPService xmpp = XMPPServiceFactory.getXMPPService();
		Message message = xmpp.parseMessage(request);
		JID fromJid = message.getFromJid();
		String msgBody = "We will offer 10% discount";
		Message msg = new MessageBuilder().withRecipientJids(fromJid).withBody(msgBody).build();
		SendResponse status = xmpp.sendMessage(msg);
		xmpp.sendPresence(fromJid, PresenceType.AVAILABLE, PresenceShow.NONE, "Sales Executive");
		boolean messageSent = (status.getStatusMap().get(fromJid) == SendResponse.Status.SUCCESS);
		if(!messageSent)
		{
			response.getWriter().println("Could not reply to the message");
		}
	}
}
