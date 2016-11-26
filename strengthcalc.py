import pokemontables

def main():
	while True:
		type = raw_input("Enter a Pokemon Type: ");
		typelower = type.lower();
		if len(typelower.split())==1:
			typeindex = pokemontables.typeTable.index(typelower);
			#print(typeindex);

			for j in range(0,17):
				if pokemontables.matchupTable[j][typeindex] == 2:
					print(pokemontables.typeTable[j].upper());
		elif len(typelower.split())==2:
			typeindex1 = pokemontables.typeTable.index(typelower.split()[0]);
			typeindex2 = pokemontables.typeTable.index(typelower.split()[1]);
			
			weaks = [];
			powerfuls = [];

			for j in range(0,17):
				if pokemontables.matchupTable[j][typeindex1] == 2:
					if(j not in powerfuls):
						powerfuls.append(j);
				if pokemontables.matchupTable[j][typeindex1] == 0 or pokemontables.matchupTable[j][typeindex1] == 3:
					if(j not in weaks):
						weaks.append(j);
				if pokemontables.matchupTable[j][typeindex2] == 2:
					if(j not in powerfuls):
						powerfuls.append(j);
				if pokemontables.matchupTable[j][typeindex2] == 0 or pokemontables.matchupTable[j][typeindex2] == 3:
					if(j not in weaks):
						weaks.append(j);
			
			strengths = [x for x in powerfuls if x not in weaks];

			for index in strengths:
				print(pokemontables.typeTable[index].upper());



main();