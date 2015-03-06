import java.util.Arrays;



public class PokeTable {
	//Fields
	private String[][] typeTable = new String[18][18];
	private String name;
	private int version;
	
	//Constructor
	public PokeTable(String n){
		name = n;
		//120 lines
		typeTable[6][0]="2x";
		typeTable[13][0]="0x";
		typeTable[1][1]="3x";
		typeTable[2][1]="2x";
		typeTable[3][1]="3x";
		typeTable[5][1]="3x";
		typeTable[8][1]="2x";
		typeTable[11][1]="3x";
		typeTable[12][1]="2x";
		typeTable[16][1]="3x";
		typeTable[17][1]="3x";
		typeTable[1][2]="3x";
		typeTable[2][2]="3x";
		typeTable[3][2]="2x";
		typeTable[4][2]="2x";
		typeTable[5][2]="3x";
		typeTable[16][2]="3x";
		typeTable[1][3]="2x";
		typeTable[2][3]="3x";
		typeTable[3][3]="3x";
		typeTable[4][3]="3x";
		typeTable[5][3]="2x";
		typeTable[7][3]="2x";
		typeTable[8][3]="3x";
		typeTable[9][3]="2x";
		typeTable[11][3]="2x";
		typeTable[4][4]="3x";
		typeTable[8][4]="2x";
		typeTable[9][4]="3x";
		typeTable[16][4]="3x";
		typeTable[1][5]="2x";
		typeTable[5][5]="3x";
		typeTable[6][5]="2x";
		typeTable[12][5]="2x";
		typeTable[16][5]="2x";
		typeTable[9][6]="2x";
		typeTable[10][6]="2x";
		typeTable[11][6]="3x";
		typeTable[12][6]="3x";
		typeTable[15][6]="3x";
		typeTable[17][6]="2x";
		typeTable[3][7]="3x";
		typeTable[6][7]="3x";
		typeTable[7][7]="3x";
		typeTable[8][7]="2x";
		typeTable[10][7]="2x";
		typeTable[11][7]="3x";
		typeTable[17][7]="3x";
		typeTable[2][8]="2x";
		typeTable[3][8]="2x";
		typeTable[4][8]="0x";
		typeTable[5][8]="2x";
		typeTable[7][8]="3x";
		typeTable[12][8]="3x";
		typeTable[3][9]="3x";
		typeTable[4][9]="2x";
		typeTable[5][9]="2x";
		typeTable[6][9]="3x";
		typeTable[8][9]="0x";
		typeTable[11][9]="3x";
		typeTable[12][9]="2x";
		typeTable[6][10]="3x";
		typeTable[10][10]="3x";
		typeTable[11][10]="2x";
		typeTable[13][10]="2x";
		typeTable[15][10]="2x";
		typeTable[1][11]="2x";
		typeTable[3][11]="3x";
		typeTable[6][11]="3x";
		typeTable[8][11]="3x";
		typeTable[9][11]="2x";
		typeTable[12][11]="2x";
		typeTable[0][12]="3x";
		typeTable[1][12]="3x";
		typeTable[2][12]="2x";
		typeTable[3][12]="2x";
		typeTable[6][12]="2x";
		typeTable[7][12]="3x";
		typeTable[8][12]="2x";
		typeTable[9][12]="3x";
		typeTable[16][12]="2x";
		typeTable[0][13]="0x";
		typeTable[6][13]="0x";
		typeTable[7][13]="3x";
		typeTable[11][13]="3x";
		typeTable[13][13]="2x";
		typeTable[15][13]="2x";
		typeTable[1][14]="3x";
		typeTable[2][14]="3x";
		typeTable[3][14]="3x";
		typeTable[4][14]="3x";
		typeTable[5][14]="2x";
		typeTable[14][14]="2x";
		typeTable[17][14]="2x";
		typeTable[6][15]="2x";
		typeTable[10][15]="0x";
		typeTable[11][15]="2x";
		typeTable[13][15]="3x";
		typeTable[15][15]="3x";
		typeTable[17][15]="2x";
		typeTable[0][16]="3x";
		typeTable[1][16]="2x";
		typeTable[4][16]="3x";
		typeTable[5][16]="3x";
		typeTable[6][16]="2x";
		typeTable[7][16]="0x";
		typeTable[8][16]="2x";
		typeTable[9][16]="3x";
		typeTable[10][16]="3x";
		typeTable[11][16]="3x";
		typeTable[12][16]="3x";
		typeTable[14][16]="3x";
		typeTable[16][16]="3x";
		typeTable[17][16]="3x";
		typeTable[6][17]="3x";
		typeTable[7][17]="2x";
		typeTable[11][17]="3x";
		typeTable[14][17]="0x";
		typeTable[15][17]="3x";
		typeTable[16][17]="2x";
		//setOnes();
		for(int row = 0; row<typeTable.length; row++){
			for(int col = 0; col<typeTable[0].length; col++){
				if(typeTable[row][col]==null){typeTable[row][col]="<html><font color = black>1x</font></html>";}
				if(typeTable[row][col]=="3x"){typeTable[row][col]="<html><font color = red>1/2x</font></html>";}
				if(typeTable[row][col]=="2x"){typeTable[row][col]="<html><font color = green>2x</font></html>";}
				if(typeTable[row][col]=="0x"){typeTable[row][col]="<html><font color = purple>0x</font></html>";}
			}
		}
		
	}
	
	//AM
	public String[][] getTypeTable() {return typeTable;}
	public void setTypeTable(String[][] typeTable) {this.typeTable = typeTable;}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public int getVersion() {return version;}
	public void setVersion(int version) {this.version = version;}
	
	public String getMatchup(int row, int column){return typeTable[row][column];}
	
	public int getLength(){return typeTable[0].length;}
	
	//Methods
	/*private void setOnes(){
		for(int row = 0; row<typeTable.length; row++){
			for(int col = 0; col<typeTable[0].length; col++){
				if(typeTable[row][col]==null){typeTable[row][col]="<html><font color = black>1x</font></html>";}
				if(typeTable[row][col]=="3x"){typeTable[row][col]="<html><font color = red>1/2x</font></html>";}
				if(typeTable[row][col]=="2x"){typeTable[row][col]="<html><font color = green>2x</font></html>";}
				if(typeTable[row][col]=="0x"){typeTable[row][col]="<html><font color = purple>0x</font></html>";}
			}
		}
	}*/
	
	//toString()
	@Override
	public String toString(){
		String result = "";
		for(int row = 0; row<typeTable.length; row++){
			for(int col = 0; col<typeTable[0].length; col++){
				result+=typeTable[row][col]+" | ";
			}
			result += "\n";
		}
		return result;
	}
	
}
