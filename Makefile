dale:
	mvn install
	mvn exec:java@no-args

arg:
	mvn install
	mvn exec:java@with-args

tool:
	mvn install
	mvn exec:java@tool

