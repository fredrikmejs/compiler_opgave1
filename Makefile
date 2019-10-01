
antlr4 = java -jar 'C:\Javalib\antlr-4.7.2-complete.jar'
grun   = java org.antlr.v4.gui.TestRig

SRCFILES = main.java
GENERATED = simpleCalcListener.java simpleCalcBaseListener.java simpleCalcParser.java simpleCalcBaseVisitor.java simpleCalcVisitor.java simpleCalcLexer.java

all:
	make main.class

main.class:	$(SRCFILES) $(GENERATED) simpleCalc.g4
	javac  $(SRCFILES) $(GENERATED)

simpleCalcListener.java:	simpleCalc.g4
	$(antlr4) -visitor simpleCalc.g4

test:	main.class
	java main simpleCalc_input.txt

tree:	$(GENERATED) simpleCalc.g4
	javac $(GENERATED)
	$(grun) simpleCalc start -tree -gui < simpleCalc_input.txt
