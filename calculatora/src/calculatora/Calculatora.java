/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatora;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author bassma
 */
public class Calculatora extends JFrame{

 
    private JTextField t1;
    private JPanel pan1;
    private JButton []b;
    private JButton add;
    private  JButton sub;
    private JButton eq;
    private JButton dot;
    private JButton clear;
     private double num1;
     private double num2;
     private double res;
    private String op;
     private int num3;
   
    
    public Calculatora()  throws HeadlessException{
        
    setLayout(new FlowLayout());
     pan1=new JPanel();
      pan1.setLayout(new GridLayout(3,5)) ;
      add(pan1);
    t1=new JTextField(20);
    add(t1);
  b=new JButton [10];
   for(int i=0;i<10;i++)
   {
       b[i]=new JButton(i+"");
     pan1.add(b[i]);
     b[i].addActionListener(new listenToNUm());
     
   }
       
  add=new JButton("+")  ;   
  sub=new JButton("-")     ;
  eq=new JButton("=")  ;
  clear=new JButton("cl")  ;
  dot=new JButton(".")  ;
  
   pan1.add(add);
   pan1.add(sub);
   pan1.add(eq);
   pan1.add(clear);
   pan1.add(dot);
   
   add.addActionListener(new listenToop());//creat object);
   sub.addActionListener(new listenToop() );
   eq.addActionListener(new lisenToeq ());
   dot.addActionListener(new listenToop1());
   clear.addActionListener (new listenerTop2());
   
setSize(300,500);
    setVisible(true);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
    
}
    

    /*
     * @param args th command line arguments
     */
    public static void main(String[] args) {
       new Calculatora();
    }
    

class listenToNUm implements ActionListener{

  
    @Override
    public void actionPerformed(ActionEvent e) {
t1.setText(t1.getText()+e.getActionCommand());
        
    }
    
    
}
 class listenerTop2 implements ActionListener {
    @Override
        public void actionPerformed(ActionEvent e) {
            num1=Double.parseDouble(t1.getText());
            t1.setText(t1.getText().substring(0, t1.getText().length()-1));
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

 class listenToop1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        int num3=Integer .parseInt(t1.getText())   ;
        if(!t1.getText().contains("."))
       t1.setText(t1.getText()+e.getActionCommand());
      
        
            throw new UnsupportedOperationException("Not supported yet.");
        }
     
 }   

 class listenToop implements ActionListener{
     @Override
        public void actionPerformed(ActionEvent e) {
             num1=Double.parseDouble(t1.getText())  ;
          op=e.getActionCommand();
          t1.setText(" ");
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
  class lisenToeq implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            num2=Double.parseDouble(t1.getText());
            if(op.equals("+"))
            {
                res=num1+num2;
                 t1.setText(res+"");
                 
            }
            else if(op.equals("-"))
            {
                res=num1-num2;
                 t1.setText(res +"");
            }
          
         
         
          
            throw new UnsupportedOperationException("Not supported yet.");
        
    }
  }
}
