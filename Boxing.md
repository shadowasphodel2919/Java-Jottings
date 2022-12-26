# Autoboxing and Unboxing

## Wrapper Classes
These classes are used to depict primitive data types (int, char, short, byte, etc) as objects. 
These classes come under java.util package.
The collection framework and other generics such as ArrayLists store only objects.(while the Valhalla project is set to change it)
The object is needed to support synchronization in multithreading.
Wrapper classes allow objects to hold null values.

The memory required by a wrapper class is higher than it's primitive type. Moreover a practical difference is that the wrapper classes is slower.

When the Java language was "invented" people thought that having primitive types int, long, ... would avoid performance issues. 15+ years back, there were no efficient JIT compilers; so it made a huge difference if you had to create an array for 10000 ints ... or for 10 000 Integer objects.

On the other hand, Java wants to be a object-oriented language. Therefore those primitive types came with accompanying classes. You are correct in the sense: if there would be no primitive tpyes, just Integer, Long, ... and so on, the Java type system would be more consistent, much simpler ... but back in 1997 this simple type system would have been to "expensive" regarding performance. And unfortunately people didn't think about allowing primitive types in bytecode ... but not having them in the Java language itself (and the compiler converting Integer to int internally).

The main usage nowadays is the fact that the Java compiler does autoboxing (automated conversion between primitive and "object based" types); so you can write stuff like:

Map<Integer, String> someMap = ...
someMap.put(5, "string")


# [History](https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/Performance-cost-of-Java-autoboxing-and-unboxing-of-primitive-types)
Historically, if developers wanted to store a set of doubles in a collection class, they’d have to convert from the primitive type to the wrapper class:

int x = 10;
ArrayList<E> list = new ArrayList();
// list.add(10); Pre JDK 1.5 autoboxing would not work
Integer wrapper = Integer.valueOf(x);
list.add(wrapper);
However, JDK version 1.5 introduced a feature known as the autoboxing of Java primitive types. It means that on newer JDKs, a wrapper class will be created automatically when a primitive type is used anywhere a reference type is expected. As such, on post JDK 1.5 versions of the JVM, the use-case above won’t need to use a wrapper class. The Java boxing and autoboxing of primitive types will take care of it for you:

int x = 10;
ArrayList<E> list = new ArrayList();
list.add(10); // This is primitive type autoboxing in Java 
//Integer wrapper = Integer.valueOf(x);
//list.add(wrapper);

## Autoboxing

The conversion of a primitive data type value into its corresponding wrapper class object is termed as autoboxing.
The java compiler applies autoboxing when
-> A primitive value is passed as a parameter that expects an object of the corresponding wrapper class.
-> Assigned to a variable of the corresponding wrapper class.

## Unboxing

Whereas the conversion of the wrapper class object to a primitive datatype value is termed as unboxing.
The java compiler applies unboxing when
->Wrapper class is passed as a parameter which expects a primitive value.
-> Assigned to variable of the corresponding primitive type.