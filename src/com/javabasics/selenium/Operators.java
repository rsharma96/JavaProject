package com.javabasics.selenium;

/**
 * Created by rajeshwar sharma on 2017-08-30.
 */
public class Operators {

    int x = 20;
    int y = 40;
    int z = 21;
    int a = 21;

    // Operators are nothing but a special signs thst helps to perform
    // specific operations on 1 , 2 or 3 operand
    // There are different types of operators in Java but some of them are widely used

    // Basically there are 6 different types of Operators in Java
    //1. Arithmetic Operators (+/-/*///%)

    public void arithmeticOperators() {

        // Arithmetic Operators are used in mathematical Expressions
        int addition = x + y + z;
        System.out.println("The value of addition is " + addition);   // sout

        int subtraction = x - y - z;
        System.out.println("The value of subtraction is " + subtraction);

        int multiplication = x * y * z;
        System.out.println("The value of multiplication is " + multiplication);

        int division = y / x;
        System.out.println("The value of division is " + division);

        int modulus = y % z;
        System.out.println("The value of modulus is " + modulus);


    }

    //2. Bitwise Operators (~ / & / |/ ^ / >> />>>/ <<)


    //4. Relational Operators (== / != / < /> / >= /<=)

    public void relationalOperators() {

        boolean equal = (x == y); // false
        System.out.println("The equal operator value is : " + equal);

        boolean notEqual = (x != y); // true
        System.out.println("The notEqual operator value is : " + notEqual);

        boolean greaterThan = (x > y); // false
        System.out.println("The greaterThan operator value is : " + greaterThan);

        boolean greaterThanEqual1 = (x >= y); // false
        System.out.println("The greaterThanEqual1 operator value is : " + greaterThanEqual1);

        boolean greaterThanEqual2 = (y >= x); // true
        System.out.println("The greaterThanEqual2 operator value is : " + greaterThanEqual2);

        boolean lessThanEqual1 = (x < y); // true
        System.out.println("The lessThanEqual1 operator value is : " + lessThanEqual1);

        boolean lessThanEqual2 = (z <= x); // true
        System.out.println("The lessThanEqual2 operator value is : " + lessThanEqual2);

        boolean lessThanEqual3 = (z <= a); // true
        System.out.println("The lessThanEqual3 operator value is : " + lessThanEqual3);

    }

    //3. Logical Operators (&& / || / !)

    public void logicalOperators() {

        // we will see this operators after discussing Control Statements
        boolean and = (x < y && x > y); // false
        System.out.println("The and operator is " + and);

        boolean or = (x < y || a == y); //(true)
        System.out.println("The or operator is " + and);

        boolean not = !(x < y); // false (not true)
        System.out.println("The not operator is " + and);


    }


    //5. Assignment Operators (= / += /-=/ *= /%=/ /=)

    public void assignmentOperators() {

        int assignment = 10;  // here we have assigned value 10 using assignment operator

        System.out.println("Before += : " + x);
        x += 3; //   x = x + 3 ;
        System.out.println("After += : " + x);

        System.out.println("Before -= : " + x);
        x -= 3; //   x = x - 3 ;
        System.out.println("After -= : " + x);

        System.out.println("Before *= : " + x);
        x *= 3; //   x = x * 3 ;
        System.out.println("After *= : " + x);

        System.out.println("Before /= : " + x);
        x /= 3; //   x = x / 3 ;
        System.out.println("After /= : " + x);

        System.out.println("Before %= : " + x);
        x %= 3; //   x = x % 3 ;
        System.out.println("After %= : " + x);


    }
    //6. Misc Operator (Ternary Operator / InstanceOf Operator)

    // There are miscellaneous operators in Java
    //1. Increment / Decrement Operator
    //2. Conditional Operator / Ternary Operator
    //3. InstanceOf Operator

    public void incrementDecrementOperator() {
        // The increment operator (++) and decrement operator (– –) are for incrementing and decrementing a variable by 1.

        System.out.println("The value of x before increment is " + x);
        x++;

        System.out.println("The value of x after increment is " + x);

        x = 0 ;

        System.out.println("The value of x before increment is " + x);
        ++x; // this statement simply mean it will first increment then if we print it will print incremented value

        System.out.println("The value of x after increment is " + x);

        y = 10;

        System.out.println("The value of y before decrement is " + y);
        --y; // this will first decrement and then print

        System.out.println("The value of y after decrement is " + y);


    }

    public void ternaryOperator() {

        //ternary operators are also known as Conditional Operators (?:)
        // variable x = (expression) ? value if true : value if false

        // here if expression is true it will assign true to x else false to x
        // Value of x will be decided based on the condition. if condition is true then it assigns first value to the variable
        //If Expression is false then it assigns second value to the variable.

        // here its simple if else statement in one line
        // Here in syntax if expression is true it will return value before colon and false after colon

        // Ternary operator used to evaluate boolean expression and it consists of three operands.

        String is = (x > y) ? "x is greater" : "y is greater";
        System.out.println("The value of is is :" + is);

        // Ternary Operator in Java for INTEGER

        // checking condition 2>3 and if true assign 3 else 3
        int x = (2 > 3) ? 3 : 2;

        System.out.println("The value of x is " + x); // 2

        // checking condition 5<4 if true assign 4 else 3
        int y = (5 < 4) ? 4 : 3;

        System.out.println("The value of y is " + y);

        // TERNARY operators with Boolean

        boolean b = true ? true : false;

        System.out.println("The value of b is " + b);

        boolean c = false ? true : false;

        System.out.println(y);

        boolean z = false ? false : true;

        System.out.println(z);

        // Ternary Operators for STRING

        String str = "java".equals("java") ? "Java Questions" : "Java Programs";

        System.out.println(str);

        String str1 = (1 == 3) ? "its true" : "its false";

        System.out.println(str1);

        // Ternary Operator in Java for NULL
        String st = null;

        String st1 = (str == null) ? "its true" : "its false";

        System.out.println(st1);

        String st2 = (str1 != null) ? "its true" : "its false";

        System.out.println(st1);


    }

    public static void main(String args[]){

        Operators op = new Operators();
        op.arithmeticOperators();
        op.assignmentOperators();
        op.incrementDecrementOperator();
        op.logicalOperators();
        op.relationalOperators();
        op.ternaryOperator();

    }


}
