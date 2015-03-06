import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class MainFrame extends JFrame implements MenuListener, ActionListener {
	// Fields
	ProgramMainFrame pmf;
	JMenuBar menuBar;
	JMenu aboutMenu;
	JMenuItem aboutItem, howToItem;

	Image Icon;

	// Constructor
	public MainFrame() {

		// Try to add the Program's Icon
		try {
			Icon = ImageIO.read(new File("src/Icons/705.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Initialize the Toolbar and Panels
		pmf = new ProgramMainFrame();
		pmf.updateMatches();
		menuBar = new JMenuBar();
		aboutMenu = new JMenu("Help");
		aboutMenu.addMenuListener(this);
		aboutItem = new JMenuItem("About");
		aboutItem.addActionListener(this);
		aboutMenu.add(aboutItem);
		howToItem = new JMenuItem("How To");
		howToItem.addActionListener(this);
		aboutMenu.add(howToItem);
		menuBar.setVisible(true);
		menuBar.add(aboutMenu);

		// Set Frame Appearance
		setIconImage(Icon);
		setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		setTitle("Pokemon Matchups");
		setMinimumSize(new Dimension(500, 600));

		// Set Operations
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(pmf);
		setResizable(false);
		pack();
	}

	// AM
	@Override
	public void menuSelected(MenuEvent me) {
		if (me.getSource().equals(aboutMenu)) {
			System.out.println("hi");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(aboutItem)) {
			JOptionPane.showMessageDialog(this,
					"Developer: Peyton Duncan\nJanuary 2014");
		}
		if (e.getSource().equals(howToItem)) {
			JOptionPane
					.showMessageDialog(
							this,
							"1.) Enter wheather your pokemon is Attacking or Defending.\n2.) Enter the Type of your Pokemon.\n3.) View the results on the lower half of the screen."
									+ "\n\n2x    Super Effective!\n1x    Normal Damage\n1/2x  It's not very effective...\n0x    It Doesn't Affect...");
		}

	}

	@Override
	public void menuCanceled(MenuEvent arg0) {
	}

	@Override
	public void menuDeselected(MenuEvent arg0) {
	}
}
