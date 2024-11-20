# JAVA

## Date: 19-11-2024

To print sum of two numbers, here we are considering variables a & b.

consider,

int a = 10;

int b = 05;

form above a, b are variables and they are of type integer.

Next in order to store the sum value we will create a 'sum' variable.

int sum = a + b;

Note: I have taken sum as a variable you can take any thing which should be suitable for your problem statement. By looking at that variable, we should understand  what it performs in the program.

the sum variable will calculate the sum of two numbers. i.e a, b

## code

public class sumofAandB
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 05;

        int sum = a + b;
        System.out.println(sum);
    }
}


             
## comments in java

In java we have 2 types of comments

1.single line comments.

### //<This is sing le line comment>

2.multi line comments.

### /*<This is multi line comment. You can write as many comment line as you can> */


## Input in Java

 how we can to take input from users in java.

 To take input we will create an Object which is the Scanner class.




 ## skipped Variables & Types, operators, Conditional Statements( Up comming if iam learning i will post it here)



## Date: 20-11-2024

 ## Loops

 A best example i would tell is, when we are listening any sing if we like that song we put  in a loop so that we can hear that song repeatedly so that we no need to do any work to switch every time to particular song which we are interested in.

 if we are listening any name loop then we should get a thought in mind like Repeat, To perform a task again and again.


 Example:

 public class BasicLoops {
    public static void main(String[] args){
        // If i want to print print hello world for three-time i can print in this way

        System.out.println("Hello world");
        System.out.println("Hello World");
        System.out.println("Hello World");

        // the above way is good for us for single digit number and little bit difficult for Double digit number

        //If we want to print for 100000 time what we will do

        // So, here comes the picture of Loops. This will reduce our work

        
    }
}


Loops are of three types:

1. While loop
2. for loop
3. Do while loop

We will discuss each one in detail below.

## While loop

Syntax:

    while(Condition){

    //Do something

    }

this loop will run till the condition is true.

In while loop, first it check for the condition. If the condition is true the it will go inside the loop and print the mentioned statements.

condition - true - goes inside loop
condition - false - it wont go inside the loop - exit the loop.


Initializing means we are initially providing a value to a variable to start from that number.


Example:
public class loop100times {
    public static void main(String[] args) {
        int number = 1;
        while(number <= 100){
    
            System.out.println("Hello World!");
            
            number++;
        }
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
For below code

Initially i have done one mistake, and i was thinking some thing should be there or some thing  iam missing.

the mistake is i dint add the "number++ in the loop" i was thing how it will  perform that operation for only 100 time. 

Beginer mistakes 😂

Before adding number++, That loop was running infinity time I didn't see that.


Example code:

public class loop100times {
    public static void main(String[] args) {
        //Initilizing a value to a variable number

        int number = 1;

        //we are creating a while loop, that print Hello World 100 times 

        while(number <= 100){

            //In the condition section we have "number <= 100", this is the conditon. Until the condition is true the loop continue to run it stops fi the condition is false.
    
            System.out.println("Hello World!");
            
            //The below "number++", this will increment the initilized value which is 1. once the loop is executed it will increment the  initilized value by +1 and start repeating the loop 
            //If the condition is true it enters the while loop block and print the Hellow World. Once if the conditon is false it exit he loop and comes out of the main method. whichis the end of the program.


            number++;
        }
    }
}


Question:

##### Print numbers from 1 to 10 using while loop.

solution:

public class print1to10 {
    public static void main(String[] args) {
        // Using While loop
        // print 1 to 10 numbers in java 
        int num = 1;
        while(num <= 10){
            System.out.println(num);
            num++;
        }
    }
}







