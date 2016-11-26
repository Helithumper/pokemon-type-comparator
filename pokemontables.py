#The Table
#Key:
#0 - Normal
#1 - Fire
#2 - Water
#3 - Electric
#4 - Grass
#5 - Ice
#6 - Fighting
#7 - Poison
#8 - Ground
#9 - Flying
#10 - Psychic
#11 - Bug
#12 - Rock
#13 - Ghost
#14 - Dragon
#15 - Dark
#16 - Steel
#17 - Fairy
typeTable = [None]*18;
typeTable[0] = "normal";
typeTable[1] = "fire";
typeTable[2] = "water";
typeTable[3] = "electric";
typeTable[4] = "grass";
typeTable[5] = "ice";
typeTable[6] = "fighting";
typeTable[7] = "poison";
typeTable[8] = "ground";
typeTable[9] = "flying";
typeTable[10] = "psychic";
typeTable[11] = "bug";
typeTable[12] = "rock";
typeTable[13] = "ghost";
typeTable[14] = "dragon";
typeTable[15] = "dark";
typeTable[16] = "steel";
typeTable[17] = "fairy";


#0 is 0x Potency
#1 is 1x Potency
#2 is 2x Potency
#3 is 1/2x Potency
w, h = 18, 18;
matchupTable = [[1 for x in range(w)] for y in range(h)] 
matchupTable[6][0]=2;
matchupTable[13][0]=0;
matchupTable[1][1]=3;
matchupTable[2][1]=2;
matchupTable[4][1]=3;
matchupTable[5][1]=3;
matchupTable[8][1]=2;
matchupTable[11][1]=3;
matchupTable[12][1]=2;
matchupTable[16][1]=3;
matchupTable[17][1]=3;

matchupTable[1][2]=3;
matchupTable[2][2]=3;
matchupTable[3][2]=2;
matchupTable[4][2]=2;
matchupTable[5][2]=3;
matchupTable[16][2]=3;

# matchupTable[1][3]=2;
# matchupTable[2][3]=3;
# matchupTable[3][3]=3;
# matchupTable[4][3]=3;
# matchupTable[5][3]=2;
# matchupTable[7][3]=2;
# matchupTable[8][3]=2;
# matchupTable[9][3]=3;
# matchupTable[11][3]=2;
matchupTable[3][3]=3;
matchupTable[8][3]=2;
matchupTable[9][3]=3;
matchupTable[16][3]=3;

matchupTable[1][4]=2;
matchupTable[2][4]=3;
matchupTable[3][4]=3;
matchupTable[4][4]=3;
matchupTable[5][4]=2;
matchupTable[7][4]=2;
matchupTable[8][4]=3;
matchupTable[9][4]=2;
matchupTable[11][4]=2;

matchupTable[1][5]=2;
matchupTable[5][5]=3;
matchupTable[6][5]=2;
matchupTable[12][5]=2;
matchupTable[16][5]=2;

matchupTable[9][6]=2;
matchupTable[10][6]=2;
matchupTable[11][6]=3;
matchupTable[12][6]=3;
matchupTable[15][6]=3;
matchupTable[17][6]=2;

matchupTable[3][7]=3;
matchupTable[6][7]=3;
matchupTable[7][7]=3;
matchupTable[8][7]=2;
matchupTable[10][7]=2;
matchupTable[11][7]=3;
matchupTable[17][7]=3;

matchupTable[2][8]=2;
matchupTable[3][8]=2;
matchupTable[4][8]=0;
matchupTable[5][8]=2;
matchupTable[7][8]=3;
matchupTable[12][8]=3;

matchupTable[3][9]=3;
matchupTable[4][9]=2;
matchupTable[5][9]=2;
matchupTable[6][9]=3;
matchupTable[8][9]=0;
matchupTable[11][9]=3;
matchupTable[12][9]=2;

matchupTable[6][10]=3;
matchupTable[10][10]=3;
matchupTable[11][10]=2;
matchupTable[13][10]=2;
matchupTable[15][10]=2;

matchupTable[1][11]=2;
matchupTable[3][11]=3;
matchupTable[6][11]=3;
matchupTable[8][11]=3;
matchupTable[9][11]=2;
matchupTable[12][11]=2;

matchupTable[0][12]=3;
matchupTable[1][12]=3;
matchupTable[2][12]=2;
matchupTable[3][12]=2;
matchupTable[6][12]=2;
matchupTable[7][12]=3;
matchupTable[8][12]=2;
matchupTable[9][12]=3;
matchupTable[16][12]=2;

matchupTable[0][13]=0;
matchupTable[6][13]=0;
matchupTable[7][13]=3;
matchupTable[11][13]=3;
matchupTable[13][13]=2;
matchupTable[15][13]=2;

matchupTable[1][14]=3;
matchupTable[2][14]=3;
matchupTable[3][14]=3;
matchupTable[4][14]=3;
matchupTable[5][14]=2;
matchupTable[14][14]=2;
matchupTable[17][14]=2;

matchupTable[6][15]=2;
matchupTable[10][15]=0;
matchupTable[11][15]=2;
matchupTable[13][15]=3;
matchupTable[15][15]=3;
matchupTable[17][15]=2;

matchupTable[0][16]=3;
matchupTable[1][16]=2;
matchupTable[4][16]=3;
matchupTable[5][16]=3;
matchupTable[6][16]=2;
matchupTable[7][16]=0;
matchupTable[8][16]=2;
matchupTable[9][16]=3;
matchupTable[10][16]=3;
matchupTable[11][16]=3;
matchupTable[12][16]=3;
matchupTable[14][16]=3;
matchupTable[16][16]=3;
matchupTable[17][16]=3;

matchupTable[6][17]=3;
matchupTable[7][17]=2;
matchupTable[11][17]=3;
matchupTable[14][17]=0;
matchupTable[15][17]=3;
matchupTable[16][17]=2;
