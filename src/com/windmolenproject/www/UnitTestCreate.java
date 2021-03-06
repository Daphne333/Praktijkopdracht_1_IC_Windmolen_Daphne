package com.windmolenproject.www;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.junit.Test;

public class UnitTestCreate {
	
	@Test
	  public void testCreate() throws RemoteException {
	    WindmolenSoapBindingImpl windmolen = new WindmolenSoapBindingImpl();
	    String test = windmolen.createWindmolen("7t84h5k", "IndustriŽleWindmolen", "90883076", "C:\\Users\\Staples\\Desktop\\Windmolen.txt");
	    assertEquals("De volgende windmolen is aangemaakt: Code: 7t84h5k, Type: IndustriŽleWindmolen, Capaciteit: 90883076;   ", test);
	}

}
