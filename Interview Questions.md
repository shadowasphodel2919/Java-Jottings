# Interview Questions
### Can we overload the main method?
Yes, the main method can be overloaded but the execution starts with the main function with (String[] args) arguments.
```
    public class Sample{
        public static void main(){
                    System.out.println("This is the overloaded main method");
                }
                public static void main(String args[]){
                    Sample obj = new Sample();
                    obj.main();
                }
            }
```
### A Java Constructor returns a value but, what?
No, Java constructor does not return a value. And it is not a method, its sole purpose is to initialize the instance variables.
### Can we create a program without main method?
In version 1.7 and later it is necessary to include a ``main()`` function. But in earlier versions it was possible using static block.
```
public class Test{   
    // this is static block

    static{
        System.out.println("This is static block");  
        System.exit(0);
    }
}
```
### What are the six ways to use this keyword?
### Why is multiple inheritance not supported in Java?
### Why use aggregation?
### Can we override the static method?
### What is the covariant return type?
### What are the three usages of Java super keyword?
### Why use instance initializer block?
### What is the usage of a blank final variable?
### What is a marker or tagged interface?
### What is runtime polymorphism or dynamic method dispatch?
### What is the difference between static and dynamic binding?
### How downcasting is possible in Java?
### What is the purpose of a private constructor?
### What is object cloning?

