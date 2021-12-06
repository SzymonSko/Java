import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Main implements ActionListener
{
   JTextField t1;
   JButton b1;
   JButton b2;
   JButton b3;
   JButton b4;
   JButton b5;
   JButton b6;
   JButton b7;
   JButton b8;
   JButton b9;
   JButton b0;
   JButton bplus,bminus,bmult,bdiv,bback,bsquer,broot,brow,bclear,bswitch;

   double x,buf;
   String operation;
   public void actionPerformed(ActionEvent e)                  
   {            


      
      Object target = e.getSource();  
      if(target==b1)                                           
      {                                                        
         t1.setText(t1.getText()+((JButton)target).getText()); 
         t1.requestFocus();                                    
      }           
      
      
      if(target==b2)                                           
      {                                                        
         t1.setText(t1.getText()+((JButton)target).getText()); 
         t1.requestFocus();                                    
      }             

      
      if(target==b3)                                           
      {                                                        
         t1.setText(t1.getText()+((JButton)target).getText()); 
         t1.requestFocus();                                    
      }             

      
      if(target==b4)                                           
      {                                                        
         t1.setText(t1.getText()+((JButton)target).getText()); 
         t1.requestFocus();                                    
      }             

      
      if(target==b5)                                           
      {                                                        
         t1.setText(t1.getText()+((JButton)target).getText()); 
         t1.requestFocus();                                    
      }             

      
      if(target==b6)                                           
      {                                                        
         t1.setText(t1.getText()+((JButton)target).getText()); 
         t1.requestFocus();                                    
      }             

      
      if(target==b7)                                           
      {                                                        
         t1.setText(t1.getText()+((JButton)target).getText()); 
         t1.requestFocus();                                    
      }            
      
      if(target==b8)                                           
      {                                                        
         t1.setText(t1.getText()+((JButton)target).getText()); 
         t1.requestFocus();                                    
      }             
      
      
      if(target==b9)                                           
      {                                                        
         t1.setText(t1.getText()+((JButton)target).getText()); 
         t1.requestFocus();                                    
      }           

      if(target==b0)                                           
      {                                                        
         t1.setText(t1.getText()+((JButton)target).getText()); 
         t1.requestFocus();                                    
      }              

      else if(target==bplus)                                   
      {                                                        
         buf=Double.parseDouble(t1.getText());                 
         t1.setText("");                                       
         t1.requestFocus();
         this.operation = "Add"; 
                              
      }
      else if(target==bminus)                                   
      {                                                        
         buf=Double.parseDouble(t1.getText());                 
         t1.setText("");                                       
         t1.requestFocus();
         this.operation = "Substract"; 
                           
      } 

      else if(target==bmult)                                   
      {                                                        
         buf=Double.parseDouble(t1.getText());                 
         t1.setText("");                                       
         t1.requestFocus();
         this.operation = "Mult"; 
                           
      } 
      else if(target==bdiv)                                   
      {                                                        
         buf=Double.parseDouble(t1.getText());                 
         t1.setText("");                                       
         t1.requestFocus();
         this.operation = "Div"; 

   
         
         
      } 
      else if(target==bback)
      {
         if (t1.getText().isEmpty())
         {
         t1.setText("0");
         } 
         else
         {
            t1.setText(t1.getText().substring(0, t1.getText ().length() - 1));
         } 
      }
      else if (target==bsquer)
      {                                        
         Double k=Double.parseDouble(t1.getText()); 
         t1.setText(Double.toString(k*k));    
         t1.requestFocus();                    
      }

      else if (target==broot)
      {                                        
         Double k=Double.parseDouble(t1.getText()); 
         k =  Math.sqrt(k);
         t1.setText(Double.toString(k));    
         t1.requestFocus();                    
      }
      else if (target==bclear)
      {                                        
         t1.setText(null);
         t1.requestFocus();                    
      }

      else if (target==bswitch)
      {                                        
         Double k=Double.parseDouble(t1.getText()); 
         k = k * -1;
         t1.setText(Double.toString(k));    
         t1.requestFocus();                    
      }
      
      
      else if(target==brow||target==t1)                        
      {
         System.out.println(operation);
         if(operation.equals("Add")){
            x=Double.parseDouble(t1.getText());                   
            x=buf+x;                                              
            t1.setText(Double.toString(x));                       
            t1.requestFocus(); 
         }                                                       
         else if(operation.equals("Substract")){
            x=Double.parseDouble(t1.getText());                   
            x=buf-x;                                              
            t1.setText(Double.toString(x));                       
            t1.requestFocus();                                                                 
         }
         else if(operation.equals("Mult")){
            x=Double.parseDouble(t1.getText());                   
            x=buf*x;                                              
            t1.setText(Double.toString(x));                       
            t1.requestFocus();                                                                 
         }
         else if(operation.equals("Div")){
            x=Double.parseDouble(t1.getText());   
            if (x == 0){
               JOptionPane.showMessageDialog(null, "You cannot divide by 0", "Login error", JOptionPane.ERROR_MESSAGE);
            }
            else{
               x=buf/x;                                              
               t1.setText(Double.toString(x));                       
               t1.requestFocus();   
            }               
                                                            
         }
      } 
   }                                                           

   void init()                                                                   
   {                                                                            
                                                

      JFrame f=new JFrame();                                                    
      Container c=f.getContentPane();                                           

      GridBagLayout gbl=new GridBagLayout();                                    
      GridBagConstraints gbc=new GridBagConstraints();                          
      gbc.fill=GridBagConstraints.HORIZONTAL;                                   
      c.setLayout(gbl);                                                         



      t1=new JTextField(15);   
      t1.setEditable(false);                 
      t1.addActionListener(this);                                               
      t1.setHorizontalAlignment(JTextField.RIGHT);                              
      gbc.gridx=0;                                                              
      gbc.gridy=0;                                                              
      gbc.gridwidth=5;                                                          
      gbc.ipadx=0;                                                              
      gbc.ipady=5;                                                              
      gbc.insets=new Insets(5,5,0,5);                                           
      gbl.setConstraints(t1,gbc);                                               
      c.add(t1);    
      
      

      b1=new JButton("1");                                                      
      b1.addActionListener(this);                                               
      b1.setFocusable(false);                                                   
      gbc.gridx=0;                                                              
      gbc.gridy=1;                                                              
      gbc.gridwidth=1;                                                          
      gbc.ipadx=0;                                                              
      gbc.ipady=0;                                                              
      gbc.insets=new Insets(5,5,0,0);                                           
      gbl.setConstraints(b1,gbc);                                               
      c.add(b1);
      
      b2=new JButton("2");                                                      
      b2.addActionListener(this);                                               
      b2.setFocusable(false);                                                    
      gbc.gridx=1;                                                              
      gbc.gridy=1;                                                              
      gbc.gridwidth=1;                                                          
      gbc.ipadx=0;                                                              
      gbc.ipady=0;                                                              
      gbc.insets=new Insets(5,5,0,0);                                           
      gbl.setConstraints(b2,gbc);                                               
      c.add(b2);     

      b3=new JButton("3");                                                      
      b3.addActionListener(this);                                               
      b3.setFocusable(false);                                                   
      gbc.gridx=2;                                                              
      gbc.gridy=1;                                                              
      gbc.gridwidth=1;                                                          
      gbc.ipadx=0;                                                              
      gbc.ipady=0;                                                              
      gbc.insets=new Insets(5,5,0,0);                                           
      gbl.setConstraints(b3,gbc);                                               
      c.add(b3);     

      b4=new JButton("4");                                                      
      b4.addActionListener(this);                                               
      b4.setFocusable(false);                                                   
      gbc.gridx=0;                                                              
      gbc.gridy=2;                                                              
      gbc.gridwidth=1;                                                          
      gbc.ipadx=0;                                                              
      gbc.ipady=0;                                                              
      gbc.insets=new Insets(5,5,0,0);                                           
      gbl.setConstraints(b4,gbc);                                               
      c.add(b4);     

      b5=new JButton("5");                                                      
      b5.addActionListener(this);                                               
      b5.setFocusable(false);                                                   
      gbc.gridx=1;                                                              
      gbc.gridy=2;                                                              
      gbc.gridwidth=1;                                                          
      gbc.ipadx=0;                                                              
      gbc.ipady=0;                                                              
      gbc.insets=new Insets(5,5,0,0);                                           
      gbl.setConstraints(b5,gbc);                                               
      c.add(b5);     

      b6=new JButton("6");                                                      
      b6.addActionListener(this);                                               
      b6.setFocusable(false);                                                   
      gbc.gridx=2;                                                              
      gbc.gridy=2;                                                              
      gbc.gridwidth=1;                                                          
      gbc.ipadx=0;                                                              
      gbc.ipady=0;                                                              
      gbc.insets=new Insets(5,5,0,0);                                           
      gbl.setConstraints(b6,gbc);                                               
      c.add(b6);     

      b7=new JButton("7");                                                      
      b7.addActionListener(this);                                               
      b7.setFocusable(false);                                                   
      gbc.gridx=0;                                                              
      gbc.gridy=3;                                                              
      gbc.gridwidth=1;                                                          
      gbc.ipadx=0;                                                              
      gbc.ipady=0;                                                              
      gbc.insets=new Insets(5,5,0,0);                                           
      gbl.setConstraints(b7,gbc);                                               
      c.add(b7);     

      b8=new JButton("8");                                                      
      b8.addActionListener(this);                                               
      b8.setFocusable(false);                                                   
      gbc.gridx=1;                                                              
      gbc.gridy=3;                                                              
      gbc.gridwidth=1;                                                          
      gbc.ipadx=0;                                                              
      gbc.ipady=0;                                                              
      gbc.insets=new Insets(5,5,0,0);                                           
      gbl.setConstraints(b8,gbc);                                              
      c.add(b8);

      b9=new JButton("9");                                                      
      b9.addActionListener(this);                                               
      b9.setFocusable(false);                                                   
      gbc.gridx=2;                                                              
      gbc.gridy=3;                                                              
      gbc.gridwidth=1;                                                          
      gbc.ipadx=0;                                                              
      gbc.ipady=0;                                                              
      gbc.insets=new Insets(5,5,0,0);                                           
      gbl.setConstraints(b9,gbc);                                              
      c.add(b9);   

      b0=new JButton("0");                                                      
      b0.addActionListener(this);                                               
      b0.setFocusable(false);                                                   
      gbc.gridx=2;                                                              
      gbc.gridy=4;                                                              
      gbc.gridwidth=1;                                                          
      gbc.ipadx=0;                                                              
      gbc.ipady=0;                                                              
      gbc.insets=new Insets(5,5,0,0);                                           
      gbl.setConstraints(b0,gbc);                                              
      c.add(b0);   



      bplus=new JButton("+");                                                   
      bplus.addActionListener(this);                                            
      bplus.setFocusable(false);                                                
      bplus.setToolTipText("dodawanie");                                        
      gbc.gridx=3;                                                              
      gbc.gridy=1;                                                              
      gbc.gridwidth=2;                                                          
      gbc.ipadx=30;                                                             
      gbc.ipady=0;                                                              
      gbc.insets=new Insets(5,5,0,5);                                           
      gbl.setConstraints(bplus,gbc);                                            
      c.add(bplus);                                                             

      bminus=new JButton("-");                                                   
      bminus.addActionListener(this);                                            
      bminus.setFocusable(false);                                                
      bminus.setToolTipText("odejmownaie");                                        
      gbc.gridx=3;                                                              
      gbc.gridy=2;                                                              
      gbc.gridwidth=2;                                                          
      gbc.ipadx=30;                                                             
      gbc.ipady=0;                                                              
      gbc.insets=new Insets(5,5,0,5);                                           
      gbl.setConstraints(bminus,gbc);                                            
      c.add(bminus); 
      
      bmult=new JButton("*");                                                   
      bmult.addActionListener(this);                                            
      bmult.setFocusable(false);                                                
      bmult.setToolTipText("mnozenie");                                        
      gbc.gridx=3;                                                              
      gbc.gridy=3;                                                              
      gbc.gridwidth=2;                                                          
      gbc.ipadx=30;                                                             
      gbc.ipady=0;                                                              
      gbc.insets=new Insets(5,5,0,5);                                           
      gbl.setConstraints(bmult,gbc);                                            
      c.add(bmult); 

      bdiv=new JButton("/");                                                   
      bdiv.addActionListener(this);                                            
      bdiv.setFocusable(false);                                                
      bdiv.setToolTipText("dzielenie");                                        
      gbc.gridx=3;                                                              
      gbc.gridy=4;                                                              
      gbc.gridwidth=2;                                                          
      gbc.ipadx=30;                                                             
      gbc.ipady=0;                                                              
      gbc.insets=new Insets(5,5,0,5);                                           
      gbl.setConstraints(bdiv,gbc);                                            
      c.add(bdiv); 

      bback=new JButton("<=");                                                   
      bback.addActionListener(this);                                            
      bback.setFocusable(false);                                                
      bback.setToolTipText("backspace");                                        
      gbc.gridx=5;                                                              
      gbc.gridy=1;                                                              
      gbc.gridwidth=2;                                                          
      gbc.ipadx=30;                                                             
      gbc.ipady=0;                                                              
      gbc.insets=new Insets(5,5,0,5);                                           
      gbl.setConstraints(bback,gbc);                                            
      c.add(bback); 

      bsquer=new JButton("^2");                                                   
      bsquer.addActionListener(this);                                            
      bsquer.setFocusable(false);                                                
      bsquer.setToolTipText("squer");                                        
      gbc.gridx=5;                                                              
      gbc.gridy=2;                                                              
      gbc.gridwidth=2;                                                          
      gbc.ipadx=30;                                                             
      gbc.ipady=0;                                                              
      gbc.insets=new Insets(5,5,0,5);                                           
      gbl.setConstraints(bsquer,gbc);                                            
      c.add(bsquer); 

      broot=new JButton("\u221a");                                                   
      broot.addActionListener(this);                                            
      broot.setFocusable(false);                                                
      broot.setToolTipText("squer");                                        
      gbc.gridx=5;                                                              
      gbc.gridy=3;                                                              
      gbc.gridwidth=2;                                                          
      gbc.ipadx=30;                                                             
      gbc.ipady=0;                                                              
      gbc.insets=new Insets(5,5,0,5);                                           
      gbl.setConstraints(broot,gbc);                                            
      c.add(broot); 
      
      
      
      brow=new JButton("=");                                                    
      brow.addActionListener(this);                                             
      brow.setFocusable(false);                                                 
      brow.setToolTipText("wykonaj działanie");                                 
      gbc.gridx=0;                                                              
      gbc.gridy=4;                                                              
      gbc.gridwidth=2;                                                          
      gbc.ipadx=30;                                                             
      gbc.ipady=0;                                                              
      gbc.insets=new Insets(5,5,5,0);                                           
      gbl.setConstraints(brow,gbc);                                             
      c.add(brow);     

      bclear=new JButton("C");                                                      
      bclear.addActionListener(this);                                               
      bclear.setFocusable(false);                                                   
      gbc.gridx=5;                                                              
      gbc.gridy=0;                                                              
      gbc.gridwidth=2;                                                          
      gbc.ipadx=0;                                                              
      gbc.ipady=0;                                                              
      gbc.insets=new Insets(5,5,0,0);                                           
      gbl.setConstraints(bclear,gbc);                                               
      c.add(bclear); 

      bswitch=new JButton("+/-");                                                      
      bswitch.addActionListener(this);                                               
      bswitch.setFocusable(false);                                                   
      gbc.gridx=5;                                                              
      gbc.gridy=4;                                                              
      gbc.gridwidth=2;                                                          
      gbc.ipadx=0;                                                              
      gbc.ipady=0;                                                              
      gbc.insets=new Insets(5,5,0,0);                                           
      gbl.setConstraints(bswitch,gbc);                                               
      c.add(bswitch); 
      

      f.pack();                                                                 
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                         
      f.setTitle("Calculator");                                                       
      f.setVisible(true);                                                       
   }                                                                            

   public static void main(String[] args)          
   {                                               
      //do wersji 1.4                              
      //new Kalk().init();                         

      //od wersji 1.5                              
         SwingUtilities.invokeLater(new Runnable() 
      {                                            
         public void run()                         
         {                                         
            new Main().init();                     
         }                                         
      });                                          
   }                                               
}