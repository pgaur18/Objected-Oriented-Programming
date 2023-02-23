package Class_and_Object;

public class StudentUse {

    public static void main(String[] args) {

        Student s1= new Student("Ankush", 123);

        System.out.println(s1.name);

        s1.print();         // I nstead of sysout() again and again, We have added print functionality to student class

        System.out.println(Student.getNumStudents());

//		System.out.println(s1.name);
//		System.out.println(s1.getRollNo());
//
//		s1.name= "Ankush";
//		s1.setRollNo(-123);
//
//		System.out.println(s1.name);
//		System.out.println(s1.getRollNo());
//
//		s1.setRollNo(123);
//
//		System.out.println(s1.getRollNo());

    }

}

