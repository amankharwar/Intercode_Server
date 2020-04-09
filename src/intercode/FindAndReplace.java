/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercode;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rtextarea.SearchContext;
import org.fife.ui.rtextarea.SearchEngine;

/**
 *
 * @author amank
 */
public class FindAndReplace extends javax.swing.JFrame  implements  ActionListener{

    /**
     * Creates new form FindAndReplace
     */
    
    
   //private RSyntaxTextArea textArea;
   private JTextField searchField;
   private JCheckBox regexCB;
   private JCheckBox matchCaseCB;
   
   static {
       
       Coding.textArea.requestFocusInWindow();
   }
    
    public FindAndReplace() {
        JPanel cp = new JPanel(new BorderLayout());
        JToolBar toolBar = new JToolBar();
      searchField = new JTextField(30);
      toolBar.add(searchField);
      final JButton nextButton = new JButton("Find Next");
      nextButton.setActionCommand("FindNext");
      nextButton.addActionListener(this);
      toolBar.add(nextButton);
      searchField.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            nextButton.doClick(0);
         }
      });
      JButton prevButton = new JButton("Find Previous");
      prevButton.setActionCommand("FindPrev");
      prevButton.addActionListener(this);
      toolBar.add(prevButton);
      regexCB = new JCheckBox("Regex");
      toolBar.add(regexCB);
      matchCaseCB = new JCheckBox("Match Case");
      toolBar.add(matchCaseCB);
      cp.add(toolBar, BorderLayout.NORTH);

      setContentPane(cp);
      setTitle("Find and Replace Demo");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      pack();
      setLocationRelativeTo(null);

        initComponents();
    }

    
      public void actionPerformed(ActionEvent e) {

      // "FindNext" => search forward, "FindPrev" => search backward
      String command = e.getActionCommand();
      boolean forward = "FindNext".equals(command);

      // Create an object defining our search parameters.
      SearchContext context = new SearchContext();
      String text = searchField.getText();
      if (text.length() == 0) {
         return;
      }
      context.setSearchFor(text);
      context.setMatchCase(matchCaseCB.isSelected());
      context.setRegularExpression(regexCB.isSelected());
      context.setSearchForward(forward);
      context.setWholeWord(false);

      boolean found = SearchEngine.find(Coding.textArea, context).wasFound();
      if (!found) {
         JOptionPane.showMessageDialog(this, "Text not found");
      }

   }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}