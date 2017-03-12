/**
 * WindmolenSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.windmolenproject.www;

public class WindmolenSoapBindingSkeleton implements com.windmolenproject.www.Windmolen, org.apache.axis.wsdl.Skeleton {
    private com.windmolenproject.www.Windmolen impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.windmolenproject.com/WindmolenRequest", "path"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("readWindmolen", _params, new javax.xml.namespace.QName("http://www.windmolenproject.com/WindmolenResponse", "readWindmolenReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.windmolenproject.com/WindmolenRequest", "readWindmolen"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("readWindmolen") == null) {
            _myOperations.put("readWindmolen", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("readWindmolen")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.windmolenproject.com/WindmolenRequest", "code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.windmolenproject.com/WindmolenRequest", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.windmolenproject.com/WindmolenRequest", "capaciteit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.windmolenproject.com/WindmolenRequest", "path"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("createWindmolen", _params, new javax.xml.namespace.QName("http://www.windmolenproject.com/WindmolenResponse", "createWindmolenReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.windmolenproject.com/WindmolenRequest", "createWindmolen"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("createWindmolen") == null) {
            _myOperations.put("createWindmolen", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("createWindmolen")).add(_oper);
    }

    public WindmolenSoapBindingSkeleton() {
        this.impl = new com.windmolenproject.www.WindmolenSoapBindingImpl();
    }

    public WindmolenSoapBindingSkeleton(com.windmolenproject.www.Windmolen impl) {
        this.impl = impl;
    }
    public java.lang.String readWindmolen(java.lang.String path) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.readWindmolen(path);
        return ret;
    }

    public java.lang.String createWindmolen(java.lang.String code, java.lang.String type, java.lang.String capaciteit, java.lang.String path) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.createWindmolen(code, type, capaciteit, path);
        return ret;
    }

}
