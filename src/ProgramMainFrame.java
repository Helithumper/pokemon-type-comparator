import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class ProgramMainFrame extends JPanel {
	// fields
	private String attDefChoice = "ATTACKING", typeChoice;
	private int choiceNum = 0;
	private JPanel choicePanel, resultPanel;
	private JComboBox choiceBox;
	private JRadioButton attChoice, defChoice;
	private final String[] pokemonTypes = { "Normal", "Fire", "Water", "Grass",
			"Electric", "Ice", "Fighting", "Poison", "Ground", "Flying",
			"Psychic", "Bug", "Rock", "Ghost", "Dragon", "Dark", "Steel",
			"Fairy" };
	private JLabel title;
	private PokeTable table = new PokeTable("MainTable");
	private JLabel[] typeText = new JLabel[18];
	private JLabel[] typePicture = new JLabel[18];

	// Constructor
	public ProgramMainFrame() {

		// setLayout
		setLayout(new BorderLayout());

		// Title Panel
		choicePanel = new JPanel();
		choicePanel.setLayout(new BoxLayout(choicePanel, BoxLayout.PAGE_AXIS));

		title = new JLabel(
				"<html><div style=\"text-align: center;\"><font color = blue>Pokemon Matchup<br>Simulator</font></html>",
				SwingConstants.CENTER);
		title.setFont(new Font("Futura", Font.PLAIN, 47));
		choicePanel.add(title);
		title.setAlignmentX(Component.CENTER_ALIGNMENT);
		choicePanel.add(Box.createRigidArea(new Dimension(0, 5)));

		attChoice = new JRadioButton("Attacking", true);
		attChoice.setActionCommand("ATTACKING");
		// attChoice.setSelected(true);

		defChoice = new JRadioButton("Defending", false);
		defChoice.setActionCommand("DEFENDING");
		// defChoice.setSelected(false);

		choicePanel.add(attChoice);
		choicePanel.add(defChoice);
		attChoice.setAlignmentX(Component.CENTER_ALIGNMENT);
		defChoice.setAlignmentX(Component.CENTER_ALIGNMENT);

		ButtonGroup group = new ButtonGroup();
		group.add(attChoice);
		group.add(defChoice);

		attChoice.addItemListener(new HandlerClass("ATTACKING"));
		defChoice.addItemListener(new HandlerClass("DEFENDING"));

		choiceBox = new JComboBox(pokemonTypes);

		choiceBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				if (event.getStateChange() == ItemEvent.SELECTED) {
					typeChoice = pokemonTypes[choiceBox.getSelectedIndex()];
					// System.out.println(pokemonTypes[choiceBox.getSelectedIndex()]);
					choiceNum = choiceBox.getSelectedIndex();
					updateMatches();
				}
			}
		});
		choicePanel.add(choiceBox);
		choiceBox.setAlignmentX(Component.CENTER_ALIGNMENT);
		choiceBox.setMaximumSize(new Dimension(300, 50));

		// Result Panel
		add(choicePanel, BorderLayout.NORTH);
		setBackground(Color.WHITE);

		resultPanel = new JPanel();
		resultPanel.setLayout(new GridLayout(9, 4));

		for (int i = 0; i < typePicture.length; i++) {
			typePicture[i] = new JLabel(new ImageIcon("src/Icons/"
					+ pokemonTypes[i].toLowerCase() + ".png"));
		}
		for (int i = 0; i < typeText.length; i++) {
			typeText[i] = new JLabel(
					"<html><font color = black>1x</font></html>");
			typeText[i].setFont(new Font("Futura", Font.PLAIN, 20));
		}

		for (int i = 0; i < typeText.length; i++) {
			resultPanel.add(typePicture[i]);
			resultPanel.add(typeText[i]);
		}

		add(resultPanel);
	}

	private class HandlerClass implements ItemListener {
		private String attDefChoice2;

		public HandlerClass(String s) {
			attDefChoice2 = s;
		}

		// Sets the string to the passed in String
		public void itemStateChanged(ItemEvent event) {
			attDefChoice = attDefChoice2;
			updateMatches();

		}

	}

	protected void updateMatches() {
		switch (attDefChoice) {
		case "ATTACKING":
			for (int i = 0; i < typeText.length; i++) {
				typeText[i].setText(table.getMatchup(choiceNum, i));
			}

			break;
		case "DEFENDING":
			for (int i = 0; i < typeText.length; i++) {
				typeText[i].setText(table.getMatchup(i, choiceNum));
			}

			break;
		}
	}
}
