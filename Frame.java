

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import java.awt.Label;

import javax.swing.JFrame;


//import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
import static java.lang.System.exit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Karthikeyan
 */
public class Frame  {
    public static String text;
    public static Double p;
    public static Double pr;
   
    private JFrame jFrame1;
    public static double x,x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x13,x12,x14,x15,x16,x17,x18,x19,x20,x21,x22,x23,x24,x25,x26,x27,x28,x29,x30;
    public static double y,y1,y2,y3,y4,y5,y6,y7,y8,y9,y10,y11,y12,y13,y14,y15,y16,y17,y18,y19,y20,y21,y22,y23,y24,y25,y26,y27,y28,y29,y30;
    static double m,m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,m19,m20,m21,m22,m23,m24,m25,m26,m27,m28,m29,m30;
    public static double n,n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16,n17,n18,n19,n20,n21,n22,n23,n24,n25,n26,n27,n28,n29,n30;
   
    private JLabel jLable4;
    private JTextField jTextField4;
    public static double nvertex;
    private JButton jButton2;
    private JButton jButton3;
    public int s=2;
    private JFrame jFrame2;
    private java.lang.String i;
        
   

    /**
     * Creates new form NewJFrame
     */
    public Frame() {
        initComponents();
            }
public Frame(double nvertex,String text,double x,double y){
    this.nvertex=nvertex;
    this.text=text;
    this.x=x;
    this.y=y;
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
jFrame1=new javax.swing.JFrame("VERTEX");


       
        jLable4=new javax.swing.JLabel();
        //jTextField1 = new javax.swing.JTextField();
       
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
      
        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLable4.setText("nVertices");

        

        
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }

    private void jTextField4ActionPerformed(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        });

       
jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               
                jButton1ActionPerformed(evt);
                
                
            }

    public void jButton1ActionPerformed(ActionEvent evt) {
       
        nvertex=Double.parseDouble(jTextField4.getText());
        System.out.print("n="+nvertex);
        Dis d=new Dis();
        
        }
        });
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                      .addComponent(jLable4))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1)
                          .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    )
                .addContainerGap(217, Short.MAX_VALUE))
        );
       
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLable4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGap(44, 44, 44)
                .addComponent(jButton1)
                 .addContainerGap(66, Short.MAX_VALUE)));
        
jFrame1.pack();
        jFrame1.setVisible(true);
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        
    }                                           

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
         // TODO add your handling code here:
             
    }                                           

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
            }                                           

                                           

    /**
     * @param args the command line arguments
     */
  public static void main(String args[]) {
               
      
      
      Frame f=new Frame();
        
              
               
      
}   

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration                   
 
      
    /**
     *
     */
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Karthikeyan
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Karthikeyan
 */
public class Dis extends javax.swing.JFrame {
public int click=0,i=1;
 public Graph<String,String> g;
    /**
     * Creates new form Dis
     */
    public Dis() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setText("GetX");

        jLabel2.setText("GetY");

        jLabel3.setText("node"+0);

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("NEXT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jButton1))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
        setVisible(true);
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         if(click<=nvertex){
         jLabel3.setText("node"+i);
        System.out.print("n="+nvertex); 
         if (click==0){
        x=Double.parseDouble(jTextField1.getText());
         y=Double.parseDouble(jTextField2.getText());
          }else
        if (click==1){
        x1=Double.parseDouble(jTextField1.getText());
         y1=Double.parseDouble(jTextField2.getText());
          }else
            if (click==2){
        x2=Double.parseDouble(jTextField1.getText());
         y2=Double.parseDouble(jTextField2.getText());
           }else
                if (click==3){
        x3=Double.parseDouble(jTextField1.getText());
         y3=Double.parseDouble(jTextField2.getText());
          }else
                    if (click==4){
        x4=Double.parseDouble(jTextField1.getText());
         y4=Double.parseDouble(jTextField2.getText());
          }else
                        if (click==5){
        x5=Double.parseDouble(jTextField1.getText());
         y5=Double.parseDouble(jTextField2.getText());
             }else
                            if (click==6){
        x6=Double.parseDouble(jTextField1.getText());
         y6=Double.parseDouble(jTextField2.getText());
             }else
                                if (click==7){
        x7=Double.parseDouble(jTextField1.getText());
         y7=Double.parseDouble(jTextField2.getText());
                 }else if (click==8){
        x8=Double.parseDouble(jTextField1.getText());
         y8=Double.parseDouble(jTextField2.getText());
             }else
        if (click==9){
        x9=Double.parseDouble(jTextField1.getText());
         y9=Double.parseDouble(jTextField2.getText());
                 }else if (click==10){
        x10=Double.parseDouble(jTextField1.getText());
         y10=Double.parseDouble(jTextField2.getText());
                 }else if (click==11){
        x11=Double.parseDouble(jTextField1.getText());
         y11=Double.parseDouble(jTextField2.getText());
                 }else if (click==12){
        x12=Double.parseDouble(jTextField1.getText());
         y12=Double.parseDouble(jTextField2.getText());
                }else if (click==13){
        x13=Double.parseDouble(jTextField1.getText());
         y13=Double.parseDouble(jTextField2.getText());
                 }else if (click==14){
        x14=Double.parseDouble(jTextField1.getText());
         y14=Double.parseDouble(jTextField2.getText());
        }else if (click==15){
        x15=Double.parseDouble(jTextField1.getText());
         y15=Double.parseDouble(jTextField2.getText());
              }else if (click==16){
        x16=Double.parseDouble(jTextField1.getText());
         y16=Double.parseDouble(jTextField2.getText());
                }else if (click==17){
        x17=Double.parseDouble(jTextField1.getText());
         y17=Double.parseDouble(jTextField2.getText());
              }else if (click==18){
        x18=Double.parseDouble(jTextField1.getText());
         y18=Double.parseDouble(jTextField2.getText());
              }else if (click==19){
        x19=Double.parseDouble(jTextField1.getText());
         y19=Double.parseDouble(jTextField2.getText());
              }else if (click==20){
        x20=Double.parseDouble(jTextField1.getText());
         y20=Double.parseDouble(jTextField2.getText());
             }else if (click==21) {
            x21 = Double.parseDouble(jTextField1.getText());
             y21 = Double.parseDouble(jTextField2.getText());
               }
         else if (click==22) {
            x22 = Double.parseDouble(jTextField1.getText());
             y22 = Double.parseDouble(jTextField2.getText());
               }
         else if (click==23) {
            x23 = Double.parseDouble(jTextField1.getText());
             y23 = Double.parseDouble(jTextField2.getText());
               }
         else if (click==24) {
            x24 = Double.parseDouble(jTextField1.getText());
             y24 = Double.parseDouble(jTextField2.getText());
               }else if (click==25) {
            x25 = Double.parseDouble(jTextField1.getText());
             y25 = Double.parseDouble(jTextField2.getText());
               }
         else if (click==26) {
            x26 = Double.parseDouble(jTextField1.getText());
             y26 = Double.parseDouble(jTextField2.getText());
               }
         else if (click==27) {
            x27= Double.parseDouble(jTextField1.getText());
             y27 = Double.parseDouble(jTextField2.getText());
               }
         else if (click==28) {
            x28= Double.parseDouble(jTextField1.getText());
             y28 = Double.parseDouble(jTextField2.getText());
               }
         else if (click==29) {
            x29= Double.parseDouble(jTextField1.getText());
             y29 = Double.parseDouble(jTextField2.getText());
               }
         else if (click==30) {
            x30 = Double.parseDouble(jTextField1.getText());
             y30 = Double.parseDouble(jTextField2.getText());
               }
        //click++;
        }
           click++;
          i++;      
        g=readNet();      
    }                                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         System.out.print("x="+x);
        System.out.print("y="+y);
        System.out.print("n="+nvertex);
        System.out.print("d="+g);
        Design e=new Design(g);
    }                                        

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration    
    public Graph<String,String>  readNet() {
        // Graph<V, E> where V is the type of the vertices
        // and E is the type of the edges
              Graph<String,String> g2=new  SparseMultigraph<String, String>();
             
              for(int i = 0;i<=nvertex;i++)
              {
                  g2.addVertex(""+i);
              }
     
              return g2;
         }
}

}


