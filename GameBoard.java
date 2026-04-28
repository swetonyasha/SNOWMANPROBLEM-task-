import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;


public class GameBoard {
    public static void main(String[]args){
        
        //raw frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);//width n height

        frame.setLayout(new BorderLayout());//rows and colums
        JPanel board = new JPanel();
        board.setLayout(new GridLayout(4,5));
        frame.add(board);
        

        //FRAME LEVEL
        JLabel level = new JLabel("level 1",JLabel.CENTER);
        frame.add(level,BorderLayout.SOUTH);


        //images
        ImageIcon hole = new ImageIcon("resources/hole.png");
        


        //gridmaking
        board.add(new JButton(hole));
        board.add(new JButton(hole));
        board.add(new JButton(hole));
        board.add(new JButton(hole));
        board.add(new JButton(hole));

        board.add(new JButton(hole));
        board.add(new JButton(hole));
        board.add(new JButton(hole));
        board.add(new JButton(hole));
        board.add(new JButton(hole));

        board.add(new JButton(hole));
        board.add(new JButton(hole));
        board.add(new JButton(hole));
        board.add(new JButton(hole));
        board.add(new JButton(hole));

        board.add(new JButton(hole));
        board.add(new JButton(hole));
        board.add(new JButton(hole));
        board.add(new JButton(hole));
        board.add(new JButton(hole));
        
        
        frame.add(board);

        frame.setVisible(true);

        

    

        


    }


    
    
}
