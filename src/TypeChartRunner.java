

public class TypeChartRunner {

	public static void main(String[] args) {
		
		MainFrame mainFrame = new MainFrame();
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
		
		
		/*Scanner reader = new Scanner(System.in);
		int index;
		String attDef;
		// TODO Instantiate an array of pokemon types
		String[] pokemonTypes = {"Normal","Fire","Water","Grass","Electric","Ice","Fighting","Poison","Ground","Flying","Psychic","Bug","Rock","Ghost","Dragon","Dark","Steel","Fairy"};
		// TODO Instantiate Table
		PokeTable table = new PokeTable("MainTable");
		
		//Tests the Table to make it Visible
		//System.out.println(table);
		
		// TODO Print Intro Message
		System.out.println("Welcome to the Pokemon Type Table Program");
		// TODO Ask Type
		outLoop: while(true){
		System.out.println("What is the type of pokemon that you would like to Inspect?");
		String ans1 = reader.nextLine();
		index = 0;
		for(String s:pokemonTypes){
			if(ans1.equalsIgnoreCase(s)){break outLoop;}
			//else if(index==pokemonTypes.length){System.out.println("That is not a valid pokemon type\n");break;}
			else{index++;}
		}//end of For-Loop
		System.out.println("\nThat is not a valid pokemon type\n");
		}//end of outLoop
		//System.out.println(index);
		// TODO Ask def or att?
		outLoop: while(true){
		System.out.println("Is the pokemon [Attacking] or [Defending]?");
		attDef = reader.nextLine();
		attDef = attDef.toUpperCase();
		switch(attDef){
		case "ATTACKING":
			break outLoop;
		case "DEFENDING":
			break outLoop;
		default:
			System.out.println("That is not a valid choice");
		}//end of switch
		}//end of outLoop
		//System.out.println(attDef);
		
		// TODO Grab Locations from table
		// TODO Print out
		// ATTACKING OR DEFENDING and ROW OR COLUMN NUMBER
		switch(attDef){
		case "ATTACKING":
			for(int i = 0; i<table.getLength();i++){
			System.out.println("Against " + pokemonTypes[i]+ ": " + table.getMatchup(index, i) + "x");
			};
		case "DEFENDING":
			for(int i = 0; i<table.getLength();i++){
				System.out.println("Against " + pokemonTypes[i]+ ": " + table.getMatchup(i, index) + "x");
				};
		}*/
		

	}

}
