package day55_abstraction.flags;

import javax.swing.*;
import java.awt.*;

public class Grid extends JPanel {

    private static final long serialVersionUID = 0L;
    private static final int MARGIN_SIZE = 5;
    private int scaleH;
    private int scaleW;
    private Color[][] colors;
    private static final int SQUARE_SIZE = 15;  // pixel size of each square
    private JFrame frame;

    public Grid() {
        this(10);
    }

    public Grid(int scale) {
        this.scaleH = scale;
        this.scaleW = 2 * scale;
        int overallSizeH = scaleH + 2 * MARGIN_SIZE;
        int overallSizeW = scaleW + 2 * MARGIN_SIZE;
        colors = new Color[overallSizeH][overallSizeW];
        for (int i = 0; i < overallSizeH; i++)
            for (int j = 0; j < overallSizeW; j++)
                colors[i][j] = Color.LIGHT_GRAY;

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
                createAndShowFrame();
            }
        });
    }

    public int getScale() {
        return scaleH;
    }

    public int getHt() {
        return scaleH;
    }

    public int getWd() {
        return scaleW;
    }

    private void createAndShowFrame() {
        frame = new JFrame("Flag");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize((scaleW + 2 * MARGIN_SIZE) * SQUARE_SIZE,
                ((scaleH) + 2 * MARGIN_SIZE) * SQUARE_SIZE);
        frame.setContentPane(this);
        frame.pack();
        frame.setVisible(true);
        frame.toFront();
        frame.setAlwaysOnTop(true);
    }

    public void setColor(int row, int col, Color color) {
        colors[row + MARGIN_SIZE][col + MARGIN_SIZE] = color;
        this.repaint();
    }

    public Color getColor(int row, int col) {
        return colors[row + MARGIN_SIZE][col + MARGIN_SIZE];
    }

    public void kill() {
        if (frame != null)
            frame.dispose();
    }

    public Dimension getPreferredSize() {
        return new Dimension((scaleW + 2 * MARGIN_SIZE) * SQUARE_SIZE + 1,
                ((scaleH) + 2 * MARGIN_SIZE) * SQUARE_SIZE + 1);
    }

    public void paint(Graphics g) {
        super.paint(g);

        int offset = MARGIN_SIZE * SQUARE_SIZE;

        for (int i = 0; i < scaleH + 2 * MARGIN_SIZE; i++)
            for (int j = 0; j < scaleW + 2 * MARGIN_SIZE; j++) {
                g.setColor(colors[i][j]);
                g.fillRect(j * SQUARE_SIZE + 1, i * SQUARE_SIZE + 1,
                        SQUARE_SIZE, SQUARE_SIZE);
            }
        g.setColor(Color.BLACK);
        for (int i = 0; i < scaleW + 1; i++)
            g.drawLine(offset + i * SQUARE_SIZE, offset,
                    offset + i * SQUARE_SIZE, offset + scaleH * SQUARE_SIZE);
        for (int j = 0; j < scaleH + 1; j++)
            g.drawLine(offset, offset + j * SQUARE_SIZE,
                    offset + scaleW * SQUARE_SIZE, offset + j * SQUARE_SIZE);
    }
}