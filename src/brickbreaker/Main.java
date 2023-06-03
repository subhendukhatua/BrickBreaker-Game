
package brickbreaker;

import javax.swing.JFrame;



public class Main {
    
    public static void main(String args[]){
        JFrame obj = new JFrame();
        Gameplay gameplay = new Gameplay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Breakout Ball");
        obj.setResizable(false);
        obj.setDefaultCloseOperation(1);
        obj.add(gameplay);
        obj.setVisible(true);
        
        
        
    }
    
}
