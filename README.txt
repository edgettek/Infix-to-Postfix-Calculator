Contact Information:

Name: Kyle Edgette
Class: CSC 172 SPRING 2015
Lab Session: Monday/Wednesday 2pm
TA Name: TJ Stein
Assignment Number: Project 02


Description:

A JAVA program that reads infix expressions from a test file, converts the infix expression to a postfix expression, evaluates the postfix expression, and then writes the result of the evaluation to another file. The primary data structures for performing the conversion and evaluation are the MyQueue and MyStack. First, a buffered reader reads the line as a String. Then the formatString() helper method takes the line as a parameter and uses a StringBuilder to append spaces at certain spots in the line. Where spaces are appended (before and/or after an operand) depends of the operator (is “-” a minus sign or a negative sign?) and it’s location in the line (is it at the beginning of the line?). Then, the infixToPostfix() method splits the String at the spaces, and follows the shunting yard algorithm for converting it into a postfix expression. Then, the queue which contains the postfix expression is evaluated in the postfixEval() method. In the evaluation method, each operator has it’s own case in a switch statement which performs the appropriate operation and pushes the result onto the output Stack. Then when all the operations have been performed, the resulting number on the output Stack is the result of the postfix evaluation. Lastly, a buffered writer writes this result as a String to the appropriate output file.


Files Handed In:

1. MyNode.java contains the constructor for a singly-linked node, which is the building block for the stack.
2. MyDoubleNode.java contains the constructor for a doubly-linked node, which is the building block for the queue.
3. MyStack.java contains the constructor for a stack data structure, and all the appropriate methods (i.e. push(), pop(), peek(), isEmpty())
4. MyQueue.java contains the constructor for a queue data structure, and all the appropriate methods (i.e. enqueue(), dequeue(), peek(), isEmpty())
5. Test.java contains the main method that reads and writes to file, and the helper methods that format the current line from file, convert the infix expression to a postfix expression, evaluate the postfix expression, and return the precedence of an operator.
6. infix_expr_short.txt contains infix expressions which test basic arithmetic and boolean operations.
7. postfix_eval_short.txt contains the correct evaluations of the infix expressions from infix_expr_short.txt
8. Personal_Test.txt contains the infix expressions to test for the modulus operation, operations which involve dividing by zero, and operations which contain operands that are not numbers
9. OUTPUT_Personal_Test.txt contains the correct results for the evaluation of Personal_Test.txt
10. README.txt
11. OUTPUT.txt contains contact information and instructions on running the program.


Instructions on Running the Program:

Change directories in the command line until you are in the appropriate directory. Please note that the text file which contains the infix expression that you wish to be evaluated MUST be in the same directory as the source code. Next compile and run the program USING COMMAND LINE ARGUMENTS as shown below:

javac *.java
java Test infix_expr_short.txt my_eval.txt
java Test Personal_Test_Modulus.txt ModOutput.txt

