/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercode;

import static intercode.Coding.textArea;
import java.awt.Font;

/**
 *
 * @author amank
 */
public class Set_Font implements  Runnable{
    
    
    Font fontc;
    int check=0;
    public void run()
    {
        
        
        int check=0;
        String size="";
        String style="";
        String font_name="";
        
        while(true)
        {
        check = Font_class.ischeck();
            System.out.println(check);
        if(check==1)
        {
            size = Font_class.getSize_value();
            style = Font_class.getStyle();
            font_name = Font_class.getFont_name();
            int size_value = Integer.parseInt(size);
          if(style.equals("PLAIN"))
            fontc = new Font(font_name , Font.PLAIN ,size_value);
          
          else if(style.equals("BOLD"))
          {
              fontc = new Font(font_name , Font.BOLD ,size_value);
          }
          
           else if(style.equals("ITALIC"))
          {
              fontc = new Font(font_name , Font.ITALIC ,size_value);
          }
          
           else if(style.equals("BOLD ITALIC"))
          {
              fontc = new Font(font_name , Font.BOLD + Font.ITALIC ,size_value);
          }
          
          break;
          
        }
        
        }
        
        
        textArea.setFont(fontc);
        
        
        
    }
    
}
