# CS 4310 Project

This is a project for operating systems (CS 4310) that executes 4 algorithms:
* First Come First Serve (FCFS)
* Shortest Job First (SJF)
* Round-Robin (TQ = 2)
* Round-Robin (TQ = 5)

The schedule table and average turn around time is displayed for each algorithm.
All 4 algorithms are executed per program execution. The 4 algorithms are
executed in the order above.

To compile the program, run:
`javac Main.java` or `make compile`

The program expects a file with jobs and burst times as a command line argument
for running.  In other words, the format for running the program is:
`java Main [name_of_file.txt]`

There are three files within the project folder for testing purposes:
* testdata1.txt
* testdata2.txt
* testdata3.txt

To compile each one using `make`, run each one per file respectively:
* `make test1`
* `make test2`
* `make test3`

For any other file, the format for running the program with that file is shown
above this text
