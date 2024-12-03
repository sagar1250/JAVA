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


### Date: 21-11-2024

Scanner Sc - the object we will take in the program below. where we are taking input from the user.

Question:

Print Numbers from 1 to N

Solution:

here we are using scanner class and creating an object, and we are creating two variables one is to initialize the count value we denoted it as I, one more variable is number num, rthe number which we are taking it from the user.

if we are using scanner class the we need to import some libraries like
import java,util,*;

    (or)
    
import java.util.Scanner;
---------------------------------------
import java.util.*;

public class print1ton {

    public static void main(String[] args){

  
    //Print numbers from 1 to n
    Scanner sc = new Scanner(System.in);
    int i = 0;

    System.out.println("Enter a number");
    int num = sc.nextInt();

    while(i <= num){
        System.out.println(i);
        i++;
    }
    sc.close();

   }
   
}


--------------
Question:

Print sum of first N natural Numbers.

Solition:

import java.util.*;

public class printNnaturalNums {
    public static void main(String[] arge){  
    
    
    // here i have done one mistake during my execution - i have diped upper case M in main so my previous code vas executing i am not able to understand where i did mistake thin i got some idea that we can also run using some othe commands rigth other than using VS code run button.

    javac <file name>.java // after running this in terminal of VS code its executing fine then trived with below step
    
    java <file name>.java  // when i was enter this command it shwn one error (error: can't find main(String[]) method in class: printNnaturalNums) - then i checked main method clearly and identified this error. this is called learning from mistakes.


    
        //Print sum of n natural numbers

        Scanner sc = new Scanner(System.in);

        int sum  = 0;
        int i = 1;
        System.out.println("Enter a number which is greater then 0");
        int num = sc.nextInt();

        while(i <= num){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
-------------------------

## For Loop

Where we are using While loop, we can use for loop also - this basically depends on the problem statement. In further chapters we will come to know where to use a particular looping statement.


Sysntax:

for(initilisation; condition; updation){

// Do something

}

we will first write for keyword, followed by initilisation statement we will right, followed by the condition statement, and at the last wee write the updation statement.

we use semicolumn(;) at the end of every statement - [for(initilisation; condition; updating)]
we try to compress all the three statements in a single line, which are Installation, condition, and updation statements.

we will open the for loop curly braces and we start providing our print statements or any extra conditions - we need to remember one thing which ever the thing you write in the for loop it is dedicate to that particular section only we cant use them in out side of the for loop,



for example: consider if you are declaring any variable it is used and dedicated to that block of for loop only.


intilisation - we are incrementing the counter or the i value we try to iterate the loop.
condition - every time when we are iterating the loop we try to check the condition whether the incremented value is gretar or lesser based on the condition.
updation:we check for all the possible ways till the condition is true, we update one by one.



print square patterns.

* * * *
* * * *
* * * *
* * * *

for(int i = 1; I <= 4; i++){

System.out.println("* * * *");
}


above is the logic and belo is the code:

public class squarepattern {
    public static void main(String[] args){
        for(int i = 1; i <= 4; i++){
            System.out.println("* * * *");
        }
    }
}



Print Reverse of a number:

Example: 10899  -> 99801

if we want to get the reverse of a given number then we should approach one flow

consider a number - 139

we divide the number by 10 so that we get remainder last digit.

139 % 10 => 10) 139 (13
                130
                ----
                9
we are using modulelo operator and also we are dividing it by 10

we are getting the last value as we are expecting.

this is the approach we will follow in order to get the last value.

we can write it as 

last digit = N % 10;

##### if you want to remove the last digit from a number, then we need to "divide it by 10"  ==> Remove the last digit - Num/10.

##### if you want to get the last digit from a given number we get the remainder. we use the modulo operator in the code.   ==> Get the last digit - Num%10.


Code for Reversing a number:


public class ReverseNumber {
    public static void main(String[] args){
        // Reverse a given number 
        //6028 ->first get the last digit, remove the last digit 

        int num = 6028;

        while(num > 0){  // here we are using while loop where we dont know that how many times the loop should run so we are using the While loop.
            int LastDigit = num % 10;    //we are creating a another variable "LastDigit" and storing the last digit of the particular number by using modulo operator.
            System.out.print(LastDigit + " ");   // now we are printing the last digit from the above operation.
            num = num/10;  // now here we are removing the last digit and updating the num value. this operation is performed contineously until the condition is false
        }
    }
}







