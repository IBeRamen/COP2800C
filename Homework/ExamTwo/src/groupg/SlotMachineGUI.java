package groupg;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * The class SlotMachineGUI contains the code for the animation. Once the user clicks
 * the "spin" button the images are changed to one of 6 images in the images folder and
 * then the program closes (all output is in the text file).
 *
 * @author Group G: Nicoli Perez, Omar Rahman, and Phillip Tat
 * @date Oct 13, 2017
 * @purpose Exam 2: Vera goes to Vegas
 *
 */

public class SlotMachineGUI {
	
	static void createAndShowGUI() {
		
		//Create and set up the window.
		JFrame frame = new JFrame("Slot Machine");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon bananaIcon = createImageIcon("images/0.png");
	    ImageIcon cherryIcon = createImageIcon("images/1.png");
	    ImageIcon lemonIcon = createImageIcon("images/2.png");
	    
	    JLabel label1 = new JLabel(bananaIcon);
	    JLabel label2 = new JLabel(cherryIcon);
	    JLabel label3 = new JLabel(lemonIcon);
	    
	    frame.getContentPane().add(label1, BorderLayout.WEST);
	    frame.getContentPane().add(label2, BorderLayout.CENTER);
	    frame.getContentPane().add(label3, BorderLayout.EAST);
	    
	    JButton spinButton = new JButton("SPIN");
	    
	    frame.add(spinButton, BorderLayout.SOUTH);
	    
	    spinButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		Random rand = new Random();
	    		
	    		label1.setIcon(createImageIcon("images/" + rand.nextInt((6)) + ".png"));
    			label2.setIcon(createImageIcon("images/" + rand.nextInt((6)) + ".png"));
    			label3.setIcon(createImageIcon("images/" + rand.nextInt((6)) + ".png"));
    			
    			JOptionPane.showMessageDialog(null, "Thanks for playing! View your results in the text file of this project.");
    			
    			System.exit(0);
	    		
	    	}
	    });
		
		//Display the window
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	
	/** Returns an ImageIcon, or null if the path was invalid. */
	static ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = SlotMachineGUI.class.getResource(path);
		
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
		
	}
}
