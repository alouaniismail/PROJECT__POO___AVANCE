all: tester all2 clean

all2: SimpleCollecteEstUn SimpleCollecteAUn

clean:
	rm -rf build/
	rm -f *.java~ Makefile~ *.sh~
	rm -rf abstract/src/*.java~ && rm -rf abstract/tst/*.java~
	rm -rf interface/src/*.java~ && rm -rf interface/tst/*.java~

compiler: #creation.sh
	javac -d build/ -cp build/ src/collecte/*.java src/tec/*.java
	javac -d build/ -cp build/ tst/*.java
tester_1:compiler
	javac -d build/ -cp build/ tst/TestPosition.java
	javac -d build/ -cp build/ tst/TestJauge.java
tester_2:compiler
	javac -d build/ -cp build/ tst/TestPassagerStandard.java
	javac -d build/ -cp build/ tst/TestPassagerIndecis.java
	javac -d build/ -cp build/ tst/TestPassagerStresse.java
	javac -d build/ -cp build/ tst/TestAutobus.java

tester: tester_1 tester_2
	java -ea -cp build/ tec.TestPosition
	java -ea -cp build/ tec.TestJauge
	java -ea -cp build/ tec.TestAutobus
	java -ea -cp build/ tec.TestPassagerStandard
	java -ea -cp build/ tec.TestPassagerIndecis
	java -ea -cp build/ tec.TestPassagerStresse
	@echo "==============================Fin tests unitaires et de recettes"




SimpleCollecteEstUn: SimpleCollecteEstUn.java 
	javac -d build/ -cp build/ $^
	java -cp build/ $@

SimpleCollecteAUn: SimpleCollecteAUn.java
	javac -d build/ -cp build/ $^
	java -cp build/ $@
