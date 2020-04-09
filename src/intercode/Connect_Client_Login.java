/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercode;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amank
 */






public class Connect_Client_Login implements  Runnable{

    /**
     *
     */
    static ServerSocket sa[] = new ServerSocket[5];
    static Socket sd[] = new Socket[5];

    static int check=0;

    public void run()
    {

        try {

            int i=0;
            int arr[] = { 5333 , 5444 , 5445 , 5446  , 5447};
            while(i<5)
            {
                sa[i] = new ServerSocket(arr[i]);
                sd[i]= sa[i].accept();
                i++;
            }
           
            OutputStream os = sd[0].getOutputStream();
            DataOutputStream dout = new DataOutputStream(os);

            System.out.println(MyConnection.forname);
            dout.writeUTF(MyConnection.forname);
            dout.writeUTF(MyConnection.host);
            dout.writeUTF(MyConnection.root);
            dout.writeUTF(MyConnection.pwd);

            check = 1;

            /*System.out.println(MyConnection.forname);
              System.out.println("hi");


            ServerSocket ss = new ServerSocket(4333);
            Socket s = ss.accept();



            OutputStream os = s.getOutputStream();
            DataOutputStream dout = new DataOutputStream(os);

            System.out.println(MyConnection.forname);
            dout.writeUTF(MyConnection.forname);
            dout.writeUTF(MyConnection.host);
            dout.writeUTF(MyConnection.root);
            dout.writeUTF(MyConnection.pwd);

            */



        } catch (IOException ex) {
            Logger.getLogger(Connect_Client_Login.class.getName()).log(Level.SEVERE, null, ex);
        }





    }

      static Socket getQues()
        {
        return  sd[1];
        }


      static Socket getMsg()
        {
        return  sd[2];
        }

      static Socket getCode()
      {
          return sd[3];
      }
      
      static Socket is_client_login()
      {
          return sd[4];
      }


      static int getchceck()
      {
          return  check;
      }

}
