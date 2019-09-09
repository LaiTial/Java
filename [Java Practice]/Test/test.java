
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Ex1 extends JFrame{
    ImageIcon i = new ImageIcon("Image00.png");
    Image im=i.getImage();
    Ex1(){
        this.setTitle("Image00.png");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MyPanel panel = new MyPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JButton("Hello"));
        
        this.add(panel);
        this.setSize(400,400);
        this.setVisible(true);
    }
    class MyPanel extends JPanel{
            
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(im,0,0,getWidth(),getHeight(),this);
        }
    }
}
public class test {
    public static void main(String[] args) {
         new Ex1();
    } 
    
}
