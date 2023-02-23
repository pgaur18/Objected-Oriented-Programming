package Class_and_Object;

public class Complex {

    private int real;
    private int imaginary;

    public Complex( int real, int imaginary )
    {
        this.real= real;
        this.imaginary= imaginary;
    }

    public void setReal( int real )
    {
        this.real= real;
    }

    public void setImaginary( int imaginary )
    {
        this.imaginary= imaginary;
    }

    public int getReal()
    {
        return real;
    }

    public int getImaginary()
    {
        return imaginary;
    }

    public void print()
    {
        System.out.println(this.real + " + " + this.imaginary + "i ");
    }

    public void add( Complex c2 )
    {
        this.real= this.real + c2.real;
        this.imaginary= this.imaginary + c2.imaginary;
    }

    public static Complex add( Complex c1, Complex c2 )
    {
        int newReal= c1.real + c2.real;
        int newComp= c1.imaginary + c2.imaginary;

        Complex newComplex= new Complex(newReal, newComp);

        return newComplex;

    }

    public void multiply( Complex c2 )
    {
        int tempReal= this.real; // Real gets updated in the next step
        this.real= ( this.real * c2.real ) + ( -1 * ( this.imaginary * c2.imaginary ));
        this.imaginary= ( tempReal * c2.imaginary ) + ( c2.real * this.imaginary );
    }

    public Complex conjugate()
    {
        this.imaginary= -1 * this.imaginary;

        return this;
    }


}
