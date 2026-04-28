import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;


public class GameBoard {
    public static void main(String[]args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);//width n height

        frame.setLayout(new BorderLayout());//rows and colums
        JPanel board = new JPanel();
        board.setLayout(new GridLayout(4,5));
        frame.add(board);
        frame.setVisible(true);


    }


    
    
}
