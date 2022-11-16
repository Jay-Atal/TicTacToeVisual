import java.awt.*;
//import java.awt.Canvas;
//import java.awt.Graphics;
//import javax.swing.JFrame;
import javax.swing.*;

public class TicTacToe extends Canvas {
    public static void main(String args[]) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new TicTacToe();


        canvas.setSize(canvas.getMaximumSize());


        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);


    }

    public void paint(Graphics g) {
        Dimension size = this.getBounds().getSize();
        //int w = this.getSize().width;

        int h = this.getBounds().height;
        int w = this.getBounds().width;
        int boardLength;

        if (h < w) {
            boardLength = h - h / 8;
        } else {
            boardLength = w - w / 8;
        }

        int boardStartingPointX = (w - boardLength) / 2;
        int boardStartingPointY = (h - boardLength) / 2;

        int verticalLine1 = boardStartingPointX + boardLength / 3;
        int verticalLine2 = boardStartingPointX + 2 * boardLength / 3;

        int horizontalLine1 = boardStartingPointY + boardLength / 3;
        int horizontalLine2 = boardStartingPointY + 2 * boardLength / 3;


        g.drawRect(boardStartingPointX, boardStartingPointY, boardLength, boardLength);
        g.drawLine(verticalLine1, boardStartingPointY, verticalLine1, boardStartingPointY + boardLength);
        g.drawLine(verticalLine2, boardStartingPointY, verticalLine2, boardStartingPointY + boardLength);
        g.drawLine(boardStartingPointX, horizontalLine1, boardStartingPointX + boardLength, horizontalLine1);
        g.drawLine(boardStartingPointX, horizontalLine2, boardStartingPointX + boardLength, horizontalLine2);


    }
}
