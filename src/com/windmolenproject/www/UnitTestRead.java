package com.windmolenproject.www;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.junit.Test;

public class UnitTestRead {
	
	@Test
	  public void testRead() throws RemoteException {
	    WindmolenSoapBindingImpl windmolen = new WindmolenSoapBindingImpl();
	    String test = windmolen.readWindmolen("C:\\Users\\Staples\\Desktop\\Windmolen.txt");
	    assertEquals("Code: 7t84h5k, Type: IndustriëleWindmolen, Capaciteit: 90883076;   ", test);
	}

}
