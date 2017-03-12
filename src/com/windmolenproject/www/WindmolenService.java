/**
 * WindmolenService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.windmolenproject.www;

public interface WindmolenService extends javax.xml.rpc.Service {
    public java.lang.String getWindmolenAddress();

    public com.windmolenproject.www.Windmolen getWindmolen() throws javax.xml.rpc.ServiceException;

    public com.windmolenproject.www.Windmolen getWindmolen(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
