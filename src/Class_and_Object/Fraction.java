package Class_and_Object;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction( int numerator, int denominator)
    {
        this.numerator= numerator;

        if( denominator == 0 )
        {
            // To Do error out
        }

        this.denominator= denominator;

        simplify();
    }

    private void simplify()
    {
        int gcd= 1;
        int div= Math.min(numerator, denominator );

        while( div > 1 )
        {
            if( numerator % div == 0 && denominator % div == 0 )
            {
                gcd= div;
                numerator= numerator/ gcd;
                denominator= denominator/gcd;
                return;
            }

            div--;

        }

    }

    public void setNumerator( int numerator )
    {
        this.numerator= numerator;
        simplify();
    }

    public void setDenominator( int denominator ) throws ZeroDenominatorException
    {
        if( denominator == 0 )
        {
            // To Do error out
            ZeroDenominatorException e= new ZeroDenominatorException();
            throw e;

        }

        this.denominator= denominator;
        simplify();

    }

    public int getNumerator()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public void print()
    {
        if( denominator == 1 )
        {
            System.out.println(numerator);
            return;
        }

        System.out.println(numerator + "/" + denominator);

    }

    public void add( Fraction f2 )
    {
        this.numerator= ( this.numerator * f2.denominator ) + ( f2.numerator * this.denominator );
        this.denominator= this.denominator * f2.denominator;

        simplify();

    }

    public void multiply( Fraction f2 )
    {
        this.numerator= this.numerator * f2.numerator;
        this.denominator= this.denominator * f2.denominator;

        simplify();

    }

    public static Fraction add( Fraction f1, Fraction f2 )
    {
        int newNum= ( f1.numerator * f2.denominator ) + ( f2.numerator * f1.denominator );
        int newDen= f1.denominator * f2.denominator;

        Fraction newFrac= new Fraction(newNum, newDen);

//		simplify();     simplify is present inside the constructor

        return newFrac;
    }


}

