/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercode;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

/**
 *
 * @author amank
 */
public class Receive_code implements  Runnable{
    
    
    static Socket s;
    public Receive_code(Socket a) {
        s=a;
    }
    
   static InputStream in = null;
   static  DataInputStream din;
   String code="";
    
   public void run()
   {
       try{
           
           System.out.println("inside receive code run");
           
           in = s.getInputStream();
           din = new DataInputStream(in);
           
           while(true){
               
           code = din.readUTF();
               System.out.println(code);
           Coding.textArea.setText(code);
           
           }
           
       }catch(Exception e )
       {
           System.out.println("Exception inside receive code : " + e);
       }
       
       
   }
   
    
}
