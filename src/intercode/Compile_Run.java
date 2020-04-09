/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercode;

import static intercode.Coding.textArea;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author amank
 */
public class Compile_Run implements  Runnable{
    public String a ;

    public Compile_Run(String s) {
        a = s;
    }
    
    String pathf="";
    String pathval ="";
    String filename="";
    
    String filena="";
    
    public void run()
    {
        
        
             if(a.equalsIgnoreCase("C")){
          try {
          filename = Path.getFileName();
          pathval = Path.getPath();
          
          if(pathval.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Give the path.");
            return;
        }
        
        else if(filename.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Give the filename with extension.");
            return;
        }
          
          pathf =pathval+"\\"+"\\"+filename+".c";
          
          filena = filename+".c";
          
        //FileWriter fileWriter=new FileWriter(filena);
         FileWriter fileWriter=new FileWriter(pathf);
        fileWriter.write(Coding.textArea.getText());
       ////setTitle(filename);
       
        
       
        fileWriter.close();
        } catch (IOException e) {
                      System.out.println("file not found");          
        }
      // String command[] = {"gcc","D:\\JavaProject\\Intercode\\prog.c"};
      
      
      String command[] = {"gcc", pathf };
      
      
       System.out.println("file compiled");
ProcessBuilder processBuilder = new ProcessBuilder(command);

java.lang.Process process = null;
    try {
       
        
       
        
        process = processBuilder.start();
        
        
       /* OutputStream out = process.getOutputStream();
        PrintWriter writer=new PrintWriter(out);
        String inp = Coding.Coding.input.getText();
        System.out.println(inp);
        writer.write(inp+"\n");*/
        
        
        //InputStream inp=process.getInputStream();
        //inp.read();
        /*System.out.println("done    "+Coding.input.getText());
        byte [] bytes =Coding.input.getText().getBytes();
            out.write(bytes);
            System.out.println("done 22222"+bytes);
            out.close();*/
        
        
       //-------------New Code 16/03/2020-----------
        
    /*    
        
        OutputStream outstream = process.getOutputStream();
        PrintStream ps = new PrintStream(outstream);
        int i=0;
        while(i<100){
            System.out.println(i);
        ps.print(Integer.toString(i));
          ps.flush();
        i++;
        
        }
        ps.flush();
        
       ps.close();
        
        */
        //--------------new Code end -- 16/03/2020 -------
        
        
        
        

    } catch (IOException ex) {
        Logger.getLogger(Coding.class.getName()).log(Level.SEVERE, null, ex);
    }


    try {
        if( process.getErrorStream().read() != -1 ){
            print("Compilation Errors",process.getErrorStream());
        }   } catch (IOException ex) {
        Logger.getLogger(Coding.class.getName()).log(Level.SEVERE, null, ex);
    }

if( process.exitValue() == 0 ){
           try {
               process = new ProcessBuilder(new String[]{"a"}).start();
               
               
               
               String inputvalue = Coding.input.getText();
               
               
               if(inputvalue.length()>0)
               {
               
               OutputStream outstream = process.getOutputStream();
        PrintStream ps = new PrintStream(outstream);
        
        
        
        
        int input = Integer.parseInt(inputvalue);
        
        ps.println(input);
        ps.flush();
        
       ps.close();
               
               }
               
               
               
               
         /*OutputStream out = process.getOutputStream();
        PrintWriter writer=new PrintWriter(out);
        String inp = Coding.input.getText();
        System.out.println(inp);
        writer.write(inp+"\n");*/
         
         
        
           } catch (IOException ex) {
               Logger.getLogger(Coding.class.getName()).log(Level.SEVERE, null, ex);
           }
           try {
              
               if( process.getErrorStream().read() != -1 ){
                  print("Errors ",process.getErrorStream());
                  return;
               }
               else{
                   print("Output ",process.getInputStream());
               }          } catch (IOException ex) {
               Logger.getLogger(Coding.class.getName()).log(Level.SEVERE, null, ex);
           }

}
    }
             
             
    else if(a.equalsIgnoreCase("Java")){
            try {
           filename = Path.getFileName();
          pathval = Path.getPath();
          
          if(pathval.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Give the path.");
            return;
        }
        
        else if(filename.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Give the filename with extension.");
            return;
        }
          
          pathf =pathval+"\\"+"\\"+filename+".java";
          
           filena = filename + ".java";
          
       //FileWriter fileWriter=new FileWriter(filena);
         FileWriter fileWriter=new FileWriter(pathf);
        fileWriter.write(textArea.getText());
        //setTitle(filename);
        fileWriter.close();
        } catch (IOException e) {
                      System.out.println("file not found");          
        }
       String command[] = {"javac",pathf};
       System.out.println("file compiled");
ProcessBuilder processBuilder = new ProcessBuilder(command);

java.lang.Process process = null;
    try {
        process = processBuilder.start();
        

    } catch (IOException ex) {
        Logger.getLogger(Coding.class.getName()).log(Level.SEVERE, null, ex);
    }


    try {
        if( process.getErrorStream().read() != -1 ){
            print("Compilation Errors",process.getErrorStream());
            return;
            
        }   } catch (IOException ex) {
        Logger.getLogger(Coding.class.getName()).log(Level.SEVERE, null, ex);
    }

if( process.exitValue() == 0 ){
           try {
              
          
               
              process = new ProcessBuilder(new String[]{"java","-cp",pathval,filename}).start();
              // process = new ProcessBuilder(new String[] {"java"," Javaprog" }).start();
              
             
               String inputvalue = Coding.input.getText();
               
               
               if(inputvalue.length()>0)
               {
               
               OutputStream outstream = process.getOutputStream();
        PrintStream ps = new PrintStream(outstream);
        
        
        
        
        int input = Integer.parseInt(inputvalue);
        
        ps.println(input);
        ps.flush();
        
       ps.close();
               
               }
              
              
              
           } catch (IOException ex) {
               Logger.getLogger(Coding.class.getName()).log(Level.SEVERE, null, ex);
           }
           try {
               
               if( process.getErrorStream().read() != -1 ){
                   print("Errors ",process.getErrorStream());
                   return;
               }
               else{
                   print("Output ",process.getInputStream());
                   return;
               }          } catch (IOException ex) {
               Logger.getLogger(Coding.class.getName()).log(Level.SEVERE, null, ex);
           }

}
    }
    else if(a.equalsIgnoreCase("C++")){
                try {
          filename = Path.getFileName();
          pathval = Path.getPath();
          
          if(pathval.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Give the path.");
            return;
        }
        
        else if(filename.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Give the filename with extension.");
            return;
        }
          
          pathf =pathval+"\\"+"\\"+filename+".cpp";
          
          
          
          
          
           filena = filename+".cpp";
       //FileWriter fileWriter=new FileWriter(filena);
         FileWriter fileWriter=new FileWriter(pathf);
        fileWriter.write(textArea.getText());
        //setTitle(filename);
        fileWriter.close();
        } catch (IOException e) {
                      System.out.println("file not found");          
        }
       String command[] = {"g++",pathf};
       System.out.println("file compiled");
ProcessBuilder processBuilder = new ProcessBuilder(command);

java.lang.Process process = null;
    try {
        process = processBuilder.start();
       

            
    } catch (IOException ex) {
        Logger.getLogger(Coding.class.getName()).log(Level.SEVERE, null, ex);
    }


    try {
        if( process.getErrorStream().read() != -1 ){
            print("Compilation Errors",process.getErrorStream());
            return;
        }   } catch (IOException ex) {
        Logger.getLogger(Coding.class.getName()).log(Level.SEVERE, null, ex);
    }

if( process.exitValue() == 0 ){
           try {
               process = new ProcessBuilder(new String[]{"a"}).start();
               
               
                
               String inputvalue = Coding.input.getText();
               
               
               if(inputvalue.length()>0)
               {
               
               OutputStream outstream = process.getOutputStream();
        PrintStream ps = new PrintStream(outstream);
        
        
        
        
        int input = Integer.parseInt(inputvalue);
        
        ps.println(input);
        ps.flush();
        
       ps.close();
               
               }
               
               
           } catch (IOException ex) {
               Logger.getLogger(Coding.class.getName()).log(Level.SEVERE, null, ex);
           }
           try {
               /** Check if RuntimeException or Errors encounter during execution then print errors on console
                * Otherwise print Output
                */
               if( process.getErrorStream().read() != -1 ){
                   print("Errors ",process.getErrorStream());
                   return;
               }
               else{
                   print("Output ",process.getInputStream());
               }          } catch (IOException ex) {
               Logger.getLogger(Coding.class.getName()).log(Level.SEVERE, null, ex);
           }

}
    }
    else if(a.equalsIgnoreCase("Pyth")){
         try {
             
             
           filename = Path.getFileName();
          pathval = Path.getPath();
          
          if(pathval.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Give the path.");
            return;
        }
        
        else if(filename.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Give the filename with extension.");
            return;
        }
          
          pathf =pathval+"\\"+"\\"+filename+".py";
          
          
          
           filena = filename+".py";
        //FileWriter fileWriter=new FileWriter(filena);
         FileWriter fileWriter=new FileWriter(pathf);
        fileWriter.write(textArea.getText());
        //setTitle(filename);
        fileWriter.close();
        } catch (IOException e) {
                      System.out.println("file not found");          
        }
       String command[] = {"python",pathf};
       System.out.println("file compiled");
ProcessBuilder processBuilder = new ProcessBuilder(command);

java.lang.Process process = null;
    try {
        process = processBuilder.start();
         
               String inputvalue = Coding.input.getText();
               
               
               if(inputvalue.length()>0)
               {
               
               OutputStream outstream = process.getOutputStream();
        PrintStream ps = new PrintStream(outstream);
        
        
        
        
        int input = Integer.parseInt(inputvalue);
        
        ps.println(input);
        ps.flush();
        
       ps.close();
               
               }

    } catch (IOException ex) {
        Logger.getLogger(Coding.class.getName()).log(Level.SEVERE, null, ex);
    }


    try {
        if( process.getErrorStream().read() != -1 ){
            print("Compilation Errors",process.getErrorStream());
            return;
        }   } catch (IOException ex) {
        Logger.getLogger(Coding.class.getName()).log(Level.SEVERE, null, ex);
    }

if( process.exitValue() == 0 ){
    
    System.out.println("run successfully");
           try {
              
               if( process.getErrorStream().read() != -1 ){
                   print("Errors ",process.getErrorStream());
                   return;
               }
               else{
                   print("Output ",process.getInputStream());
               }          } catch (IOException ex) {
               Logger.getLogger(Coding.class.getName()).log(Level.SEVERE, null, ex);
           }

        }


    }
    
             
      
          
}
    
    
      private void print(String status,InputStream input) throws IOException{
BufferedReader in = new BufferedReader(new InputStreamReader(input));
System.out.println("************* "+status+"***********************");
//TF.setText("************* "+status+"***********************");
String line = "",k,g;
do{k=Coding.Output.getText();

 System.out.println(line);

 Coding.Output.setText(k+"\n"+line);
}while((line = in.readLine()) != null );
in.close();
}
    
}
