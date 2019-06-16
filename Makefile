compile:
	javac Main.java

test1:
	java Main testdata1.txt

test2:
	java Main testdata2.txt

test3:
	java Main testdata3.txt

all:
	java Main testdata1.txt
	java Main testdata2.txt
	java Main testdata3.txt
