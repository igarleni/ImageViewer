/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.UI;

import Model.Image;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author Italo
 */
public class MainFrame extends JFrame{

    private ActionListener actionListenerPrev;
    private ActionListener actionListenerNext;
    private NorthPanel northPanel;
    private Image currentImage;
    
    public MainFrame(Image currentImage) {
        setTitle("ImageViewer");
        setMinimumSize(new Dimension(300, 180));
        setResizable(false);
        setLocation(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createWidgets();
        this.currentImage = currentImage;
        setVisible(true);
    }

    private void createWidgets() {
        this.add(createSouthPannel(),BorderLayout.SOUTH);
        this.add(createNorthPannel(),BorderLayout.NORTH);
    }

    private Component createSouthPannel() {
        JPanel toolbarPanel = new JPanel();
        toolbarPanel.add(createPrevButton());
        toolbarPanel.add(createNextButton());
        return toolbarPanel;

    }

    private Component createNorthPannel() {
        NorthPanel np = new NorthPanel(currentImage);
        northPanel = np;
        return np;
    }

    private Component createPrevButton() {
        JButton button = new JButton("Prev Image");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionListenerPrev.actionPerformed(e);
            }
        });
        return button;
    }

    private Component createNextButton() {
        JButton button = new JButton("Next Image");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionListenerNext.actionPerformed(e);
            }
        });
        return button;
    }

    public void registerPrevListener(ActionListener actionListener) {
        this.actionListenerPrev = actionListener;
    }

    public void registerNextListener(ActionListener actionListener) {
        this.actionListenerNext = actionListener;
    }

    public NorthPanel getNorthPanel() {
        return northPanel;
    }
    
}
