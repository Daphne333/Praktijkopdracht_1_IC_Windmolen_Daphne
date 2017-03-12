/**
 * Windmolen.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.windmolenproject.www;

public interface Windmolen extends java.rmi.Remote {
    public java.lang.String readWindmolen(java.lang.String path) throws java.rmi.RemoteException;
    public java.lang.String createWindmolen(java.lang.String code, java.lang.String type, java.lang.String capaciteit, java.lang.String path) throws java.rmi.RemoteException;
}
