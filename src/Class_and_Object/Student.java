package Class_and_Object;

public class Student {

    public String name;
    private final int rollno;
    private static int numStudents;

    public static int getNumStudents()
    {
        return numStudents;
    }
    public Student(String name, int rollno )
    {
//		System.out.println(this);
        numStudents++;
        this.name= name;
        this.rollno= rollno;
    }

//	public Student( String n )
//	{
//		name= n;
//	}

    public Student( int rn )
    {
        rollno= rn;
    }

//	public void setRollNo( int rn )
//	{
//		if( rn <= 0 )
//		{
//			return;
//		}
//
//		rollno= rn;
//
//	}

    public int getRollNo()
    {
        return rollno;
    }

    public void print()
    {
        System.out.println(name);
        System.out.println(rollno);
    }

}

