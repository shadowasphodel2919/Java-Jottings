# Comparables
## Comparable Interface
> Comparable is an interface which can can be implemented along with the class of which the objects are to be compared and sorted. 
>Comparable is an interface defining a strategy of comparing an object with other objects of the same type. This is called the class's “natural ordering.”
>This interface is a part of java.lang package.
```
class Student implements Comparable<Student>{
    String name;
    int marks;
    int rollNo;
    public Student(String name, int marks, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

}
```
## Comparator Interface
> In order to implement other types of ordering in more flexible manner we make use of Comparator interface. It defines a `compare(<>,<>)` method which works similar to `Comparable.compareTo()` method.
> This interface is a part of util package.

```
class StudentMarkComparator implements Comparator<Student>{
    @Override
    public int compare(Student a, Student b){
        return Integer.compare(a.marks, b.marks);
    }
}
```

>Using lambda expressions to define comparators
```
Comparator cmp = (Student a, Student b) -> Integer.compare(a.marks,b.marks);
```

>The `Comparator.comparing` method takes a method calculating the property that will be used for comparing items, and return a matching `Comparator` instance.
```
Comparator<Student> cmp = Comparator.comparing(Student::getMarks);
```

We use Integer.compare instead of subtraction trick so as to prevent Integer overflow.