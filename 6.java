import java.io.*;
import java.net.*;
import java.util.*;
  
public class IP {
    public static void main(String[] args)
        throws UnknownHostException {
        // To get and print InetAddress of Local Host
        InetAddress address1 = InetAddress.getLocalHost();
        System.out.println("InetAddress of Local Host : "
                           + address1);
  
        // To get and print InetAddress of Named Host
        InetAddress address2
            = InetAddress.getByName("45.22.30.39");
        System.out.println("InetAddress of Named Host : "
                           + address2);  
        
        InetAddress ip1=InetAddress.getByName("www.google.com");
        System.out.println(ip1);
            }

        }
   