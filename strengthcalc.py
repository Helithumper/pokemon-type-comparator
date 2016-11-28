import pokemontables

def main():
	while True:
		#Ask user a pokemon type, put it in lowercase
		type = raw_input(bcolors.HEADER + "Enter a Pokemon Type: " + bcolors.ENDC);
		typelower = type.lower();

		#Create lists to hold effectiveness
		doubleEffective = [];
		zeroEffective = [];
		halfEffective = [];

		#If only one type:
		if len(typelower.split())==1:

			#convert input text into an index value to search our 2d array of matchups with
			typeindex = pokemontables.typeTable.index(typelower);

			#Check every matchup for the given type
			for j in range(0,17):

				#If 2x Effecive, place in doubleEffective list
				if pokemontables.matchupTable[j][typeindex] == 2:
					doubleEffective.append(pokemontables.typeTable[j].upper());

				#If 1/2 Effective, place in halfEffective list
				if pokemontables.matchupTable[j][typeindex] == 3:
					halfEffective.append(pokemontables.typeTable[j].upper());

				#If 0x Effective, place in zeroEffective list
				if pokemontables.matchupTable[j][typeindex] == 0:
					zeroEffective.append(pokemontables.typeTable[j].upper());

		#If two types:
		elif len(typelower.split())==2:

			#convert input text into an index value to search our 2d array of matchups with twice
			typeindex1 = pokemontables.typeTable.index(typelower.split()[0]);
			typeindex2 = pokemontables.typeTable.index(typelower.split()[1]);
			

			#create temporary lists to hold the values
			halves = [];
			zeroes = [];
			powerfuls = [];

			#for every pokemon type:
			for j in range(0,17):

				#if 2x effective for type 1, place in powerfuls if not already in powerfuls
				if pokemontables.matchupTable[j][typeindex1] == 2:
					if(j not in powerfuls):
						powerfuls.append(j);

				#if 0x effective for type 1, place in zeroes if not already in zeroes
				if pokemontables.matchupTable[j][typeindex1] == 0:  
					if(j not in zeroes):
						zeroes.append(j);

				#if 1/2x effective for type 1, place in halves if not already in halves
				if pokemontables.matchupTable[j][typeindex1] == 3:
					if(j not in halves):
						halves.append(j);

				#if 2x effective for type 2, place in powerfuls if not already in powerfuls
				if pokemontables.matchupTable[j][typeindex2] == 2:
					if(j not in powerfuls):
						powerfuls.append(j);

				#if 0x effective for type 2, place in zeroes if not already in zeroes
				if pokemontables.matchupTable[j][typeindex2] == 0:  
					if(j not in zeroes):
						zeroes.append(j);

				#if 1/2x effective for type 2, place in halves if not already in halves
				if pokemontables.matchupTable[j][typeindex2] == 3:
					if(j not in halves):
						halves.append(j);
			
			#filter strengths for values in halves or in zeroes.
			strengths = [x for x in powerfuls if x not in halves or zeroes];

			#filter halves for values in powerful
			halves = [x for x in halves if x not in powerfuls or zeroes];

			#transfer and convert indecies from strengths into strings in doubleEffective
			for strength in strengths:
				doubleEffective.append(pokemontables.typeTable[strength].upper());

			#transfer and convert indecies from halves into strings in halfEffective
			for half in halves:
				halfEffective.append(pokemontables.typeTable[half].upper());

			#transfer and convert indecies from zeroes into strings in zeroEffective
			for zero in zeroes:
				zeroEffective.append(pokemontables.typeTable[zero].upper());



		#Prints out the results, with pretty colors
		print(bcolors.BOLD + "\n\t2x Effective: " + bcolors.ENDC);
		print(bcolors.OKGREEN + "\t\t{0}".format(doubleEffective) + bcolors.ENDC);

		print(bcolors.BOLD + "\t1/2x Effective: " + bcolors.ENDC);
		print(bcolors.OKGREEN + "\t\t{0}".format(halfEffective) + bcolors.ENDC);

		print(bcolors.BOLD + "\t0x Effective: " + bcolors.ENDC);
		print(bcolors.OKGREEN + "\t\t{0}\n".format(zeroEffective) + bcolors.ENDC);
		
		print(bcolors.WARNING + "=================" + bcolors.ENDC);

#Class that deals with coloring output text
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

