import java.util.*;;
public class Comparables {
    public static void main(String[] args){
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Athos", 99, 1));
        students.add(new Student("Porthos", 89, 2));
        students.add(new Student("Aramis",91, 3));

        System.out.println("Original Array: ");
        for(int i = 0; i < 3; i++)System.out.println(students.get(i).name);
        Collections.sort(students);
        System.out.println("Sorted Array: "+ students);
        for(int i = 0; i < 3; i++)System.out.println(students.get(i).name);
    }    
}

class Student implements Comparable<Student>{
    String name;
    int marks;
    int rollNo;
    public Student(String name, int marks, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student b){
        return Integer.compare(this.marks, b.marks);
    }
}
