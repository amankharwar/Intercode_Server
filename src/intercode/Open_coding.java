/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercode;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author amank
 */
public class Open_coding implements  Runnable{
    
    static InputStream pin = null;
   static  DataInputStream diin = null;
   static Socket sock;
   

    
   
   
    
    public void run()
    {
        
        while(true)
        {
            
        int x=Connect_Client_Login.getchceck();
          System.out.println(" ");
          
         if( x==1) 
         {     
        try {
            
            System.out.println("Inside try : Open_coding class");
            
            sock = Connect_Client_Login.is_client_login();
            
            try{
            pin = sock.getInputStream();
             diin= new DataInputStream(pin);
        
            }catch(Exception exception)
            {
                System.out.println("sock.getInputstream me kuch dikkat hai.");
            }
            
            int count=0;
            
            int key=0;
            
            while(true)
            {
             //din= new DataInputStream(in);
             key = diin.readInt();
                
             
                System.out.println(key);
            
            if(key==1)
            {
                  
                
                Coding.x=1;
                Coding.t.start();
                break;
                
            }
            
            count++;
            
            if(count==1)
            {
                JOptionPane.showMessageDialog(null, "Interviewee is not logged in. ");
                 
            }
                
            
            if(count==500)
            {
                break;
            }
         
            
           
            
            }
        
        
    } catch (Exception ex) {
            //Logger.getLogger(Open_coding.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        break;
        
         }
        }
    
}
    

}
