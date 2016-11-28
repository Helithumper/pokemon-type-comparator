import pokemontables

def main():
	while True:
		type = raw_input(bcolors.HEADER + "Enter a Pokemon Type: " + bcolors.ENDC);
		typelower = type.lower();
		doubleEffective = [];
		zeroEffective = [];
		halfEffective = [];

		if len(typelower.split())==1:
			typeindex = pokemontables.typeTable.index(typelower);
			#print(typeindex);

			for j in range(0,17):
				if pokemontables.matchupTable[j][typeindex] == 2:
					doubleEffective.append(pokemontables.typeTable[j].upper());
				if pokemontables.matchupTable[j][typeindex] == 3:
					halfEffective.append(pokemontables.typeTable[j].upper());
				if pokemontables.matchupTable[j][typeindex] == 0:
					zeroEffective.append(pokemontables.typeTable[j].upper());


		elif len(typelower.split())==2:
			typeindex1 = pokemontables.typeTable.index(typelower.split()[0]);
			typeindex2 = pokemontables.typeTable.index(typelower.split()[1]);
			
			halves = [];
			zeroes = [];
			powerfuls = [];

			for j in range(0,17):
				if pokemontables.matchupTable[j][typeindex1] == 2:
					if(j not in powerfuls):
						powerfuls.append(j);
				if pokemontables.matchupTable[j][typeindex1] == 0:  
					if(j not in zeroes):
						zeroes.append(j);
				if pokemontables.matchupTable[j][typeindex1] == 3:
					if(j not in halves):
						halves.append(j);
				if pokemontables.matchupTable[j][typeindex2] == 2:
					if(j not in powerfuls):
						powerfuls.append(j);
				if pokemontables.matchupTable[j][typeindex2] == 0:  
					if(j not in zeroes):
						zeroes.append(j);
				if pokemontables.matchupTable[j][typeindex2] == 3:
					if(j not in halves):
						halves.append(j);
			
			strengths = [x for x in powerfuls if x not in halves or zeroes];
			halves = [x for x in halves if x not in powerfuls];

			for strength in strengths:
				doubleEffective.append(pokemontables.typeTable[strength].upper());

			for half in halves:
				halfEffective.append(pokemontables.typeTable[half].upper());

			for zero in zeroes:
				zeroEffective.append(pokemontables.typeTable[zero].upper());

		print(bcolors.BOLD + "\n\t2x Effective: " + bcolors.ENDC);
		print(bcolors.OKGREEN + "\t\t{0}".format(doubleEffective) + bcolors.ENDC);
		print(bcolors.BOLD + "\t1/2x Effective: " + bcolors.ENDC);
		print(bcolors.OKGREEN + "\t\t{0}".format(halfEffective) + bcolors.ENDC);
		print(bcolors.BOLD + "\t0x Effective: " + bcolors.ENDC);
		print(bcolors.OKGREEN + "\t\t{0}\n".format(zeroEffective) + bcolors.ENDC);
		print(bcolors.WARNING + "=================" + bcolors.ENDC);

class bcolors:
    HEADER = '\033[95m'
    OKBLUE = '\033[94m'
    OKGREEN = '\033[92m'
    WARNING = '\033[93m'
    FAIL = '\033[91m'
    ENDC = '\033[0m'
    BOLD = '\033[1m'
    UNDERLINE = '\033[4m'

main();

