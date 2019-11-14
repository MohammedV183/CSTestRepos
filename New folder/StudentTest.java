import java.util.ListIterator;
import java.util.Vector;

public class StudentTest {

    public static void main(String [] args) {
        Vector<Student> vector = new Vector<Student>(3, 3);
        Student stuOne = new Student();
        Student stuTwo = new Student();
        Student stuThree = new Student();

        stuOne.setName("Student One");
        stuTwo.setName("Student Two");
        stuThree.setName("Student Three");

        stuOne.setStudentId("1");
        stuTwo.setStudentId("2");
        stuThree.setStudentId("3");

        stuOne.setDepartment("One");
        stuTwo.setDepartment("Two");
        stuThree.setDepartment("Three");

        vector.add(stuOne);
        vector.add(stuTwo);
        vector.add(stuThree);

        System.out.println(vector.capacity());

        Student stuFour = new Student();
        stuFour.setName("Student Four");
        stuFour.setStudentId("4");
        stuFour.setDepartment("Four");

        vector.add(stuFour);

        System.out.println(vector.capacity());

        ListIterator<Student> listIterator = vector.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next().getName());
        }

        System.out.println();

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous().getName());
        }
    }
}
