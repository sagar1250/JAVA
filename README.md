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

        while(num > 0){  
        
        // here we are using while loop where we dont know that how many times the loop should run so we are using the While loop.
            
            int LastDigit = num % 10;    
            
            //we are creating a another variable "LastDigit" and storing the last digit of the particular number by using modulo operator.
            
            System.out.print(LastDigit + " ");  
            
            // now we are printing the last digit from the above operation.
            
            num = num/10;  
            
            // now here we are removing the last digit and updating the num value. this operation is performed contineously until the condition is false
        }
    }
}




from the above program we are trying to print the every digit obe by one.


Reverse a given number:

public class ReverseNum {
    
        public static void main(String[] args){
            // Reverse a given number 
            //6028 -> First get the last digit, remove the last digit 
    
            int num = 6028;
            int rev = 0;
    
            while(num > 0){
                int LastDigit = num % 10;
                rev = (rev*10) + LastDigit;
                //System.out.print(LastDigit + " ");
                num = num/10;
            }
            System.out.println(rev);
        }
    
}

from above we are trying to store the Last digit in the reverse variable and trying to print the reverse number at a time.

-----

### Do While Loop

in do while we try to execute the loop once and check the condition.
We can understsnd better with an example or the syntax.

Syntax:

do{

// Do something

}while(condition);


example:

hello world example:

code:
public class DoWhileSample {
    public static void main(String[] args){
        int count = 1;

        do{
            System.out.println("Hello World");
            count++;
        }while(count <= 10);
    }
}

##### From the above code, the loop will run for at least one time and check the condition.(do while loop will execute the code for one time irrespective of the condition)

with respect to loops we have 2 keywords keywords which are mostly used

--Break
--Continue

Break or break statement - exit the loop.
we use break statement in such a way that we need end the execution state of particular on going process.

we use Break statements frequently in Switch statements. like when we are executing switch statement, inside that we are having switch cases so in order to execute specicic set of case we use break after every case statement. in order not to execute other block of code which are not need to print as a output.

Break statement is used to end up specific loop based on the condition. Break statement will only exit only one loop at at a time. we use mostly in the nested for loops.



Question:

Keep entering the numbers until the use enters correct multiple of 10.

Solution:

import java.util.*;
public class multipleOf10 {
    public static void main(String[] args){
        // keep entering numbers till user enters multiple of 10
        int num;

        Scanner sc = new Scanner(System.in);
        
        while(true){

        System.out.println("Entrer a number which is multiple of 10");

        num = sc.nextInt();
            
        if(num%2 == 0 && num%5 == 0){
            System.out.println(num + " - entered number is multiple of 10"); 
            break;  
        }
    }

    }
}


The above one which i tried.

---------------
we can also try it in other way by using " Do While loop "


import java.util.*;

public class DoWhileMultiOf10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter a number which is multiple of 10 : ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                System.out.println(n + "- is multipe of 10");
                break;
            }
        }while(true);
    }
}



above is the code using Do While loop to print multiple of 10 until the user gives the correct input.

----------------
### Continue statement: 

It will skip an Iteration.

Example:

public class ContinueStatement {
    public static void main(String[] args){
        // program to print 5 numbers by skipping 3 , the loop should run contineously.

        for(int i = 1;i<=5;i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}

//Output

1
2
4
5
(it will skip 3 based ont he if condition we mensioned.


The above is the code for the Continue statement, where it skips the flow of the iteration.

---------------

Question:

Display all numbers entered by user except multiples of 10:

Solution:

import java.util.*;
public class exceptMultOf10PrintAll {
    public static void main(String[] args){
        //Display all numbers entered by user except multiples of 10.
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number :");
            int num = sc.nextInt();
            if(num%10 == 0){
                continue;
            }
            System.out.println("Entered number is:" + num);
        }
    }
}


this above code is using while loop.


we can write is using Do While loop also.



import java.util.*;

public class exceptMultOf10PrintAllNums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter a Number : ");
            int num = sc.nextInt();
            if(num % 10 == 0){
                continue;
            }
            System.out.println("entered number is : " + num);
        }while(true);
    }
}

the above is using Do while loop.

------------------------------------------

Question:

Check if a number is prime or not?

Solution:

import java.util.*;

public class primeNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Boolean isPrime = true;

        if(num == 2){
            System.out.println("Prime number");
        }else{
            for(int i = 2;i<num-1;i++){
                if(num%i == 0){
                    isPrime = false;
                }
        }
        if(isPrime == true){
            System.out.println(num +" is a prime number");
        }else{
            System.out.println(num +" is not a prime number");
        }

       
        }
    }
}

in the above code 

1 - we are create an object, getting input from the user.
2 - we have created a Boolean value which is isPrime, we will first assign it to true. We consider  user given number is a prime number.
3 - we have used if condition, we know that 2 is neither prime nor composite. by google defination 2 is a even prime number, So when we get n value as 2 we will tell to the user it is prime.
4 - Next, in the else block statement we are having for loop which tells, if the number starts from which means (i = 2; i<=n-1; i++) this will tell you we are checking till n-1.
5 - next comes if condition where we check if num%i -> if it is divisible and leaves remainder Zero then it is a composite number, in else case it is a prime number.
6 - starting in the program we hawve considered the boolean value the user entered number as Prime number based on the if statement we can change our Assumption and cange is prime to False if it doesnt satisify the condition.

7 - At last we will check the if isPrime is true we can conclude that it is prime number else we conclude it as not a prime number..

this is my understanding based on the above code. which i have learnt.




#### Sample Question :

Q1.

How many times hello is printed.
code:

public class logicQuest {
    public static void main(String[] args){
        for(int i = 0;i<5;i++){
            System.out.println("Hello");
            i+=2;
        }
    }
}

solution:

Hello 
Hello


Q2.write a progam that reads a set of integers, and print the sum of the even and the odd integers.

code which i tried:

package loopsQuest;
import java.util.*;

public class intSumEvenOdd {
    public static void main(String[] args){
    //write a program that reads a set of integers, and then prints the sum of even and odd integers.

    Scanner sc = new Scanner(System.in);
    int nums[] = {1,2,3,4,5};
    int even = 0;
    int odd = 0;

    for(int i=0;i<nums.length;i++){
        if(nums[i]%2 == 0){
            even = even + nums[i];

        }else if(nums[i]%2 != 0){
            odd = odd + nums[i];
        }
    }
    System.out.println(even + " " + odd);
}

}



Executed the code from an external source:(Using Do While loop).

package loopsQuest;

import java.util.*;

public class evenOddSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.println("Enter a number which is even or odd not the negative number");
            num = sc.nextInt();
            if(num>0){
            
            if(num%2 == 0){
                evenSum+=num;
            }else{
                oddSum+=num;
            }
            
        }else{
            System.out.println("Enter valid Intiger number greater than Zero");
        }
        System.out.println("to continue the loop: press-1, else press-2 to exit");
            choice = sc.nextInt();
        }while(choice == 1);
        System.out.println("Sum of even Integers: "+ evenSum);
        System.out.println("sum of Odd Integers: "+- oddSum);
    }
}




Q3.write a program to find the factorial of any number entered by the user.

Hint:factorial of a number n = n*(n-1)*(n-2)*(n-3)......1  and exist for only positive numbers only
So, factorial of 0!=1, 1!=1, 2!=2, 3!=3*2*1, ........

please donot confuse factorial with notequals to operator, they are not the same.

code which i tried:

package loopsQuest;

import java.util.*;

public class factorialOfNum {
    public static void main(String[] args){
        //Write a program to find the factorial of any number entered by the user.
        // 3! = 3 * 2 * 1

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;

        for(int i=num;i>0;i--){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}



Code taken from external source:

code:

package loopsQuest;

import java.util.*;

public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num;
        int fact = 1;
        System.out.print("Enter a number greater than 0:-");
        num = sc.nextInt();

        for(int i = 1;i<=num;i++){
            fact*=i;

        }
        System.out.println("Factioral of a given number is : "+ fact);

    }
}

from the above code, only logic in the for loop changed.



Q4.Write a program to print the multiplication table of a number N, Entered by the user.

code which I tried:

package loopsQuest;

import java.util.*;

public class multiplication {
    public static void main(String[] args){
        //Write a program to print the multiplication table of a number N, entered by the user.
        //2*1 = 2
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 1; i<=10;i++){
            System.out.println(num + "*"+ i + "=" + num*i );
        }
        
    }
}


Q5.what is wrong in the following program?

package loopsQuest;

public class findWrongInProgram {
    public static void main(String[] args){
        for(int i=0;i<=5;i++){
            System.out.println("i="+i);
        }
       // System.out.println("i after the loop = " + i);
    }
}


for loops i have updated all the programs in the above. with patterns folder.


### functions / Methods

->functions are block of code, reusable
Syntax:

returnType name{

//Body

return statement;
}


->public static is a access modifier
->we need to create the function, main function will be exist for sure.

For better clarity i can ex[lain you through an example:


public class JavaBasics{

    public static void printHelloWorld(){

    System.out.println("Hello World");
    System.out.println("Hello World");
    System.out.println("Hello World");
    }

    Public static void main(String[] args){
    printHelloWorld();   //function call
    }
    }


    -> In a function if we are mensioning int insted of void then the return type should be integer type only.

    example:
    public class Numbers{

    public static int printNumbers(int numbers){

    for(number=1;number<=10;number++){
    System.out.println(numbers);

    return 3;
    }
    }
    public static void main(String[] args){
    printNumbers(1);
    }
    }

    -> when we write functions inside the classes we called methods.

    ->In C++ we can write functions outside the class also, but in java we write inside the class only.


    ##### Syntax with Parameters:

    returnType name(type param1, type param2){

      //BOdy

      return statement;

      }

      
->return statement will change based on the return type of the function. we will declare at the starting of the function.



-> We write parameters in the function definition.


public class CalculateSum{
    public static int printCalculateSum(int num1, int num 2){ // these are parameters or formal parameters

       int sum = num1+num2;
       ruturn sum;
       }

       public static void main(String[] args){

         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         int sum = printCalculateSum(a, b);  /a,b are Arguments or actual parameters.
         System.out.println("The Sum is : " + sum);

         }



         formal parameters:- parameters  =>function  Defination.
         Actual parameters:- Arguments   =>function call

         ->In java the memory is organized in Stack format.

          Call Stack:

          the memory for a function will be tracked, which funcion is calling when and how it is called and what is its oprations. one by one in the form of stack it will be stored. We call it as Call Stack.

          When we define individual block in the form of stack we call individal block as Stack frame.

          Call by value - Java always call by value
          call by reference - in C++ we use call by reference.

          -> In Java, most of the functions are called by value function only.
          
         
I will explain it with an example:

when we declare or initilize a value to a variable in the main function, that variable is called by value in the function that we create. this is call the the call by value function.

-> We will pass a copy of a variable to the function in java.


Methods are of two types:
1. user-defined methods.
    -> The user manually creates methods based on the problem statement.
   
2. In-build methods. 
   ->There are pre defined methods like -- math(), sqrt(), pow(), max()...................so on.



Function Overloading:

Multiple functions with the same name and but different parameters.

###### ->function overloading depends on the the parameters not on the return type.


Binary number system:

math -> 0 to 9 -> unique numbers. 10 digits

Decimal number system -> dec means 10, maths will run on 10 digits which are deciamal we call maths as a Decimal number system.

Binary number system:

BI means 2 digits (0,1) 

##### Variable length Arguments

This is basically if we are not sure about the length of the data type or the size of the data type we try to define in the below way.
public class VarArg{

public static void varArg(String ...v){
System.out.println(Arrays.toString(v));

// Body content;

}

public static void main(String[] args){

varArgs(1, 2, 3, 4, 5, 6);  // we can add n numberr of inputs
varArgs();   //we can limited to empty list as well.


##### function overloading

Two are more functions having same method name but different return type.

During compile time it will check with method which method should be executed because the method name will be the same based on the input the user is providing the relevant function will be executed during compile time.

we will check the number of arguments or the Type of arguments.


##### Arrays

int[] arr = new int[5];

Let's break down the above line for a better understanding.

int[] - This is a data type which is used to input or get the type integer, whether what you are specifing basically any primititive type it follows the role of that specific datatype.

arr - Till here it is called Variable declaration. how when we come to the arr it is a reference variable or we cantell like a variable we are declaring of type integer with respective to array.

new int[5]; - this entirely called as an object creation. we are creating an array object of type integer.

We are creating an object in Heap Memory.

->Towards left from the equals to sigh, we will call as a declaration. This will happen at compile time.
->The object creation, the right side part which will happen at Run time.

The object creation, is performed at Run time which is also called as Dynamic memeory allocation.

Work flow:

in the stack memory, all the function calls and reference variables go.


//(Dint do any thing on 26-12-24, to maintain streak i just done commit.)

