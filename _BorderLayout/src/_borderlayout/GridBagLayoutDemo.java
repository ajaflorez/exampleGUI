/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _borderlayout;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutDemo {
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

    public static void addComponentsToPane(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);   // Orientación de los objetos
        }

        
	pane.setLayout(new GridBagLayout());
        
        //For each component to be added to this container:
        //...Create the component...
        //...Set instance variables in the GridBagConstraints instance...
	GridBagConstraints c = new GridBagConstraints();    // Objeto que permite personalizar los objetos en el add del panel
        
	if (shouldFill) {
	//natural height, maximum width
            c.fill = GridBagConstraints.HORIZONTAL;
	}

        /*
            gridx, gridy
                Specify the row and column at the upper left of the component. 
            gridwidth, gridheight
                Specify the number of columns (for gridwidth) or rows (for gridheight) in the component's display area.
            fill
                Used when the component's display area is larger than the component's requested size to determine whether and how to resize the component.
            ipadx, ipady
                Specifies the internal padding: how much to add to the size of the component. The default value is zero.
            insets
                Specifies the external padding of the component -- the minimum amount of space between the component and the edges of its display area.
            anchor
                Used when the component is smaller than its display area to determine where (within the area) to place the component.
            weightx, weighty
                Specifying weights is an art that can have a significant impact on the appearance of the components a GridBagLayout controls.
        */
        
        //----------------------------------------------
        JButton button;
        
	button = new JButton("Button 1");
	if (shouldWeightX) {
            c.weightx = 0.5;
	}
	c.fill = GridBagConstraints.HORIZONTAL;    // Espacion suficiente para mostrar el objeto
	c.gridx = 0;    // Ubicación X en el Grid
	c.gridy = 0;    // Ubicación y en el Grid
	pane.add(button, c);

	button = new JButton("Button 2");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.5;
	c.gridx = 1;
	c.gridy = 0;
	pane.add(button, c);

	button = new JButton("Button 3");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.5;
	c.gridx = 2;
	c.gridy = 0;
	pane.add(button, c);
        
        //--------------------------------------------------
	button = new JButton("Long-Named Button 4");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.ipady = 50;      //make this component tall   // El alto del objeto 
	c.weightx = 0.0;
	c.gridwidth = 3;    // El numero del celdas que ocupa
	c.gridx = 0;
	c.gridy = 1;
	pane.add(button, c);
        
        //--------------------------------------------------
	button = new JButton("5");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.ipady = 0;       //reset to default
	c.weighty = 1.0;   //request any extra vertical space
	c.anchor = GridBagConstraints.PAGE_END; //bottom of space
	c.insets = new Insets(20,0,0,0);  //top padding
	c.gridx = 1;       //aligned with button 2
	c.gridwidth = 2;   //2 columns wide
	c.gridy = 2;       //third row
	pane.add(button, c);
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("GridBagLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void mainGrid(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}