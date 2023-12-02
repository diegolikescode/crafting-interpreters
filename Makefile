# Makefile for building a Java application

# Define the main class and source directory
MAIN_CLASS = main.Main
SRC_DIR = ./src

# Define the build and output directories
BUILD_DIR = ./build
BIN_DIR = ./bin

# Define the Java compiler and compiler flags
JAVAC = javac
JAVAC_FLAGS = -d $(BIN_DIR) -sourcepath $(SRC_DIR)

# Define the Java runtime
JAVA = java

# Define the list of source files
SOURCES = $(wildcard $(SRC_DIR)/**/*.java)

# Define the list of class files
CLASSES = $(SOURCES:$(SRC_DIR)/%.java=$(BIN_DIR)/%.class)

# Default target
all: $(CLASSES)

# Rule to build class files
$(BIN_DIR)/%.class: $(SRC_DIR)/%.java
	@mkdir -p $(@D)
	$(JAVAC) $(JAVAC_FLAGS) $<

# Target to run the application
run: all
	$(JAVA) -cp $(BIN_DIR) $(MAIN_CLASS)

# Target to clean the build
clean:
	rm -rf $(BUILD_DIR) $(BIN_DIR)

.PHONY: all run clean

go: all run clean
