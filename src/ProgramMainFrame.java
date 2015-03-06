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
	//fields
	private String attDefChoice = "ATTACKING",typeChoice;
	private int choiceNum = 0;
	private JLabel title,normal,fire,water,grass,electric,ice,fighting,poison,ground,flying,psychic,bug,rock,ghost,dragon,dark,steel,fairy;
	private JPanel choicePanel,resultPanel;
	private JComboBox choiceBox;
	private JRadioButton attChoice,defChoice;
	private final String[] pokemonTypes = {"Normal","Fire","Water","Grass","Electric","Ice","Fighting","Poison","Ground","Flying","Psychic","Bug","Rock","Ghost","Dragon","Dark","Steel","Fairy"};
	private JLabel normalEff,fireEff,waterEff,grassEff,electricEff,iceEff,fightingEff,poisonEff,groundEff,flyingEff,psychicEff,bugEff,rockEff,ghostEff,dragonEff,darkEff,steelEff,fairyEff;
	private PokeTable table = new PokeTable("MainTable");
	
	//Constructor
	public ProgramMainFrame(){
		
		
		//setLayout
		setLayout(new BorderLayout());
		
		//Title Panel
		choicePanel = new JPanel();
		choicePanel.setLayout(new BoxLayout(choicePanel,BoxLayout.PAGE_AXIS));
		
		title = new JLabel("<html><div style=\"text-align: center;\"><font color = blue>Pokemon Matchup<br>Simulator</font></html>",SwingConstants.CENTER);
		title.setFont(new Font("Futura",Font.PLAIN,47));
		choicePanel.add(title);
		title.setAlignmentX(Component.CENTER_ALIGNMENT);
		choicePanel.add(Box.createRigidArea(new Dimension(0,5)));
		
		
		attChoice = new JRadioButton("Attacking",true);
		attChoice.setActionCommand("ATTACKING");
		//attChoice.setSelected(true);
		
		defChoice = new JRadioButton("Defending",false);
		defChoice.setActionCommand("DEFENDING");
		//defChoice.setSelected(false);
		
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
		
		
		choiceBox.addItemListener(
				new ItemListener(){
					public void itemStateChanged(ItemEvent event){
						if(event.getStateChange()==ItemEvent.SELECTED){
							typeChoice = pokemonTypes[choiceBox.getSelectedIndex()];
							//System.out.println(pokemonTypes[choiceBox.getSelectedIndex()]);
							choiceNum = choiceBox.getSelectedIndex();
							updateMatches();
						}
					}
				}
		);
		choicePanel.add(choiceBox);
		choiceBox.setAlignmentX(Component.CENTER_ALIGNMENT);
		choiceBox.setMaximumSize(new Dimension(300,50));
		
		//Result Panel
		add(choicePanel,BorderLayout.NORTH);
		setBackground(Color.WHITE);
		
		resultPanel = new JPanel();
		resultPanel.setLayout(new GridLayout(9,4));
		
		normal = new JLabel(new ImageIcon("src/Icons/normal.png"));
		fire = new JLabel(new ImageIcon("src/Icons/fire.png"));
		water = new JLabel(new ImageIcon("src/Icons/water.png"));
		grass = new JLabel(new ImageIcon("src/Icons/grass.png"));
		electric = new JLabel(new ImageIcon("src/Icons/electric.png"));
		ice = new JLabel(new ImageIcon("src/Icons/ice.png"));
		fighting = new JLabel(new ImageIcon("src/Icons/fighting.png"));
		poison = new JLabel(new ImageIcon("src/Icons/poison.png"));
		ground = new JLabel(new ImageIcon("src/Icons/ground.png"));
		flying = new JLabel(new ImageIcon("src/Icons/flying.png"));
		psychic = new JLabel(new ImageIcon("src/Icons/psychic.png"));
		bug = new JLabel(new ImageIcon("src/Icons/bug.png"));
		rock = new JLabel(new ImageIcon("src/Icons/rock.png"));
		ghost = new JLabel(new ImageIcon("src/Icons/ghost.png"));
		dragon = new JLabel(new ImageIcon("src/Icons/dragon.png"));
		dark = new JLabel(new ImageIcon("src/Icons/dark.png"));
		steel = new JLabel(new ImageIcon("src/Icons/steel.png"));
		fairy = new JLabel(new ImageIcon("src/Icons/fairy.png"));
		
		
		normalEff = new JLabel("<html><font color = black>1x</font></html>");normalEff.setFont(new Font("Futura",Font.PLAIN,20));		
		fireEff = new JLabel("<html><font color = black>1x</font></html>");fireEff.setFont(new Font("Futura",Font.PLAIN,20));
		waterEff = new JLabel("<html><font color = black>1x</font></html>");waterEff.setFont(new Font("Futura",Font.PLAIN,20));
		grassEff = new JLabel("<html><font color = black>1x</font></html>");grassEff.setFont(new Font("Futura",Font.PLAIN,20));
		electricEff = new JLabel("<html><font color = black>1x</font></html>");electricEff.setFont(new Font("Futura",Font.PLAIN,20));
		iceEff = new JLabel("<html><font color = black>1x</font></html>");iceEff.setFont(new Font("Futura",Font.PLAIN,20));
		fightingEff = new JLabel("<html><font color = black>1x</font></html>");fightingEff.setFont(new Font("Futura",Font.PLAIN,20));
		poisonEff = new JLabel("<html><font color = black>1x</font></html>");poisonEff.setFont(new Font("Futura",Font.PLAIN,20));
		groundEff = new JLabel("<html><font color = black>1x</font></html>");groundEff.setFont(new Font("Futura",Font.PLAIN,20));
		flyingEff = new JLabel("<html><font color = black>1x</font></html>");flyingEff.setFont(new Font("Futura",Font.PLAIN,20));
		psychicEff = new JLabel("<html><font color = black>1x</font></html>");psychicEff.setFont(new Font("Futura",Font.PLAIN,20));
		bugEff = new JLabel("<html><font color = black>1x</font></html>");bugEff.setFont(new Font("Futura",Font.PLAIN,20));
		rockEff = new JLabel("<html><font color = black>1x</font></html>");rockEff.setFont(new Font("Futura",Font.PLAIN,20));
		ghostEff = new JLabel("<html><font color = black>1x</font></html>");ghostEff.setFont(new Font("Futura",Font.PLAIN,20));
		dragonEff = new JLabel("<html><font color = black>1x</font></html>");dragonEff.setFont(new Font("Futura",Font.PLAIN,20));
		darkEff = new JLabel("<html><font color = black>1x</font></html>");darkEff.setFont(new Font("Futura",Font.PLAIN,20));
		steelEff = new JLabel("<html><font color = black>1x</font></html>");steelEff.setFont(new Font("Futura",Font.PLAIN,20));
		fairyEff = new JLabel("<html><font color = black>1x</font></html>");fairyEff.setFont(new Font("Futura",Font.PLAIN,20));
		
		resultPanel.add(normal);
		resultPanel.add(normalEff);
		resultPanel.add(fire);
		resultPanel.add(fireEff);
		resultPanel.add(water);
		resultPanel.add(waterEff);
		resultPanel.add(grass);
		resultPanel.add(grassEff);
		resultPanel.add(electric);
		resultPanel.add(electricEff);
		resultPanel.add(ice);
		resultPanel.add(iceEff);
		resultPanel.add(fighting);
		resultPanel.add(fightingEff);
		resultPanel.add(poison);
		resultPanel.add(poisonEff);
		resultPanel.add(ground);
		resultPanel.add(groundEff);
		resultPanel.add(flying);
		resultPanel.add(flyingEff);
		resultPanel.add(psychic);
		resultPanel.add(psychicEff);
		resultPanel.add(bug);
		resultPanel.add(bugEff);
		resultPanel.add(rock);
		resultPanel.add(rockEff);
		resultPanel.add(ghost);
		resultPanel.add(ghostEff);
		resultPanel.add(dragon);
		resultPanel.add(dragonEff);
		resultPanel.add(dark);
		resultPanel.add(darkEff);
		resultPanel.add(steel);
		resultPanel.add(steelEff);
		resultPanel.add(fairy);
		resultPanel.add(fairyEff);
		
		
		add(resultPanel);
		}
		private class HandlerClass implements ItemListener{
		private String attDefChoice2;
		public HandlerClass(String s){
			attDefChoice2 = s;
		}
		//Sets the string to the passed in String
		public void itemStateChanged(ItemEvent event){
			attDefChoice=attDefChoice2;
			updateMatches();
			
		}
		
	}
		protected void updateMatches(){
			switch(attDefChoice){
			case "ATTACKING":
				normalEff.setText(table.getMatchup(choiceNum, 0));
				fireEff.setText(table.getMatchup(choiceNum, 1));
				waterEff.setText(table.getMatchup(choiceNum, 2));
				grassEff.setText(table.getMatchup(choiceNum, 3));
				electricEff.setText(table.getMatchup(choiceNum, 4));
				iceEff.setText(table.getMatchup(choiceNum, 5));
				fightingEff.setText(table.getMatchup(choiceNum, 6));
				poisonEff.setText(table.getMatchup(choiceNum, 7));
				groundEff.setText(table.getMatchup(choiceNum, 8));
				flyingEff.setText(table.getMatchup(choiceNum, 9));
				psychicEff.setText(table.getMatchup(choiceNum, 10));
				bugEff.setText(table.getMatchup(choiceNum, 11));
				rockEff.setText(table.getMatchup(choiceNum, 12));
				ghostEff.setText(table.getMatchup(choiceNum, 13));
				dragonEff.setText(table.getMatchup(choiceNum, 14));
				darkEff.setText(table.getMatchup(choiceNum, 15));
				steelEff.setText(table.getMatchup(choiceNum, 16));
				fairyEff.setText(table.getMatchup(choiceNum, 17));
				
				break;
			case "DEFENDING":
				normalEff.setText(table.getMatchup(0, choiceNum));
				fireEff.setText(table.getMatchup(1, choiceNum));
				waterEff.setText(table.getMatchup(2, choiceNum));
				grassEff.setText(table.getMatchup(3, choiceNum));
				electricEff.setText(table.getMatchup(4, choiceNum));
				iceEff.setText(table.getMatchup(5, choiceNum));
				fightingEff.setText(table.getMatchup(6, choiceNum));
				poisonEff.setText(table.getMatchup(7, choiceNum));
				groundEff.setText(table.getMatchup(8, choiceNum));
				flyingEff.setText(table.getMatchup(9, choiceNum));
				psychicEff.setText(table.getMatchup(10, choiceNum));
				bugEff.setText(table.getMatchup(11, choiceNum));
				rockEff.setText(table.getMatchup(12, choiceNum));
				ghostEff.setText(table.getMatchup(13, choiceNum));
				dragonEff.setText(table.getMatchup(14, choiceNum));
				darkEff.setText(table.getMatchup(15, choiceNum));
				steelEff.setText(table.getMatchup(16, choiceNum));
				fairyEff.setText(table.getMatchup(17, choiceNum));
				break;
			}
		}
	
	//toString()
}
