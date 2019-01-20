import os
dirName = "zad"

for i in range(1,31):
	if i < 10:
		os.makedirs(dirName+ "0" + str(i) )
	else :
		os.makedirs(dirName + str(i) )