# LogoFx_NF11_Project
## What is LogoFX

LogoFx is an Antlr grammar, made for NF11 course, that recongnize basics words in order to make a drawing pointer move. 
A window allow the user to write orders and to see the drawing.

The language created and understood by the grammar is Logo, a somewhat similar language to the turtle graphics Framework in python. (LogoFx have much less capabilities, it's a student project).

The compiler detects and warns the user about some syntax errors listed in `ErrorTypes.java`

## Make it Work

### Compile

__Warning__ : This was designed to run under a Windows environnement, adaption for linux is on my TODO list

You will need JavaFx 11 or more to run and compile this project

Run `anltr-parse.bat` and `antlr-generate.bat`

**If you use an IDE like IntelliJ or Eclipse**

You simply have to precise the librairies to use, which are contained in the `lib` folder.
Then hit `Build` button

**If you use javac**

Within the project folder, run in the terminal :

`javac -cp /lib/*.jar src/*` 

It should do the trick

### Run
**If you use an IDE like IntelliJ or Eclipse**

Make sure that the project selected main method is the one in `logogui.LogoApplication`
Hit the Run button

**If you use java**

Within the project folder, run in the terminal :
`java -cp lib/*.jar:bin/* logogui.Application`

A window should appear, you made it !

### Give orders

![The obtained window](https://i.imgur.com/5ezNiJ7.png "The obtained window")

On the left, it is the panel where you write instructions in Logo, the only recognized language.

On the right, you can choose between the tree vision, that make you see the tree generated to explore your instruction, and you can choose to see the generated drawing

On the bottom is a prompt, to warn you about errors, completion of the task and others minors things.

On the bottom-left, there is the control panel, where you can push buttons to run your instructions, clean the Tree Tab or stop a execution.

![Exemple of a antlr tree generated from the instructions](https://i.imgur.com/SzP6X42.png "Exemple of a antlr tree generated from the instructions")
Here is an exemple of how the tree is generated after a try.

Even if the execution is a failure, the tree will be generated

### Exemples of what is possible with LogoFx

![Exemple of a drawing of fractals within a triangle made with LogoFx](https://i.imgur.com/73U9KsK.png "Exemple of a drawing of fractals within a triangle made with LogoFx")

## How it works

The `.g4` file is in the `grammar` folder. This file describe the syntax awaited by the program to draw.
This is read by the antlr library and JAVA files are generated with the `anltr-parse.bat` and `antlr-generate.bat`.

The source files created will call specifics functions within the `LogoTreeVisitor.java` whenever an expression is recognized by the grammar.
The called functions will then executed specifics actions such as move the cursor, start a loop, divide a number or store a varible.
