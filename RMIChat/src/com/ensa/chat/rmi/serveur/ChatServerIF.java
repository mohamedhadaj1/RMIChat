package com.ensa.chat.rmi.serveur;

import java.rmi.RemoteException;

import java.rmi.Remote;

import com.ensa.chat.rmi.client.ChatClientIF;


public interface ChatServerIF extends Remote{
	
	void registerChatClient(ChatClientIF chatClient) throws RemoteException;
	
	
	void broadcastMessage(String message) throws RemoteException; }
