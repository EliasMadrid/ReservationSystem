/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visao;

    
import java.awt.*;
import javax.swing.*;

 public class CustomComponent1 extends JFrame {
        JScrollPane jsp = new JScrollPane();
        
        public CustomComponent1(){
            add(addComp());
            setSize(1200,1000);// largura x altura
            setVisible(true);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        
        
    
     private JComponent addComp(){
         JScrollPane jsp = new JScrollPane();
         JPanel painel = new JPanel();
         painel.setBorder(BorderFactory.createTitledBorder("TABLES"));
         
          JPanel p = new JPanel();
          p.setLayout(new GridLayout(0,4));
          
           
          int controle = 30;
          for (int i=1; i< controle; i++){
              String nome = "Table" + i;
             // JCheckBox box = new JCheckBox(nome);
              
             JButton box = new JButton(nome);
              p.add(box);
          }
          jsp.setPreferredSize(new Dimension(1000,750));// largura x altura
          jsp.setViewportView(p);
          painel.add(jsp);
          return painel;
          
          
      }
     
     
    public static void main(String[] args) {
        Runnable r = new Runnable() {

            @Override
            public void run() {
                //CustomComponent1 a = new CustomComponent1();
                CustomComponent1 main = new CustomComponent1();
                //main.display();
            }
        };
        javax.swing.SwingUtilities.invokeLater(r);
    }
  }




//---------------------------------------------------------/PANEL/----------
/*public class CustomComponent1 extends JFrame {

    private static final long serialVersionUID = 1L;

    public CustomComponent1() {
        setTitle("Custom Component Test / GridLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void display() {
        setLayout(new GridLayout(10, 10, 10, 10));
        for (int row = 0; row < 50; row++) {
            add(new CustomComponents1());
        }
        //pack();
        // enforces the minimum size of both frame and component
        setMinimumSize(getMinimumSize());
        setPreferredSize(getPreferredSize());
        setVisible(true);
    }

    public static void main(String[] args) {
        Runnable r = new Runnable() {

            @Override
            public void run() {
                CustomComponent1 a = new CustomComponent1();
                //CustomComponent1 main = new CustomComponent1();
                //main.display();
            }
        };
        javax.swing.SwingUtilities.invokeLater(r);
    }
}

class CustomComponents1 extends JLabel {

    private static final long serialVersionUID = 1L;

    @Override
    public Dimension getMinimumSize() {
        return new Dimension(20, 20);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(20, 20);
    }

    @Override
    public void paintComponent(Graphics g) {
        int margin = 10;
        Dimension dim = getSize();
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(margin, margin, dim.width - margin * 2, dim.height - margin * 2);
    }
}
*/