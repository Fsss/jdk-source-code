package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/ServerManagerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u231/13620/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Saturday, October 5, 2019 3:13:31 AM PDT
*/

public final class ServerManagerHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.spi.activation.ServerManager value = null;

  public ServerManagerHolder ()
  {
  }

  public ServerManagerHolder (com.sun.corba.se.spi.activation.ServerManager initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.ServerManagerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.ServerManagerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.ServerManagerHelper.type ();
  }

}
