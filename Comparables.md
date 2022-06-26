# Comparables
## Comparable Interface
Comparable is an interface which can can be implemented along with the class of which the objects are to be compared and sorted. 
<br>
Comparable is an interface defining a strategy of comparing an object with other objects of the same type. This is called the class's “natural ordering.”
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