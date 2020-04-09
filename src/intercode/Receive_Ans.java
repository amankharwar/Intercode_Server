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

/**
 *
 * @author amank
 */
public class Receive_Ans implements  Runnable{

     static Socket s;
     
    public Receive_Ans(Socket a) {
        
        s =a;
    }
    
    static   InputStream in ;
    static  DataInputStream din;
    static String msg="";
    
    
    public void run()
    {
        
         try {
            
            in = s.getInputStream();
            din = new DataInputStream(in);
            
            System.out.println("inside client run");
            
            while(!msg.equals("exit"))
            {
                msg = din.readUTF();
                
                System.out.println(msg);
               Coding.ans_area.setText(Coding.ans_area.getText() + "\n"+ msg );
                
                
            }
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Receive_Ans.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
            
    
}
