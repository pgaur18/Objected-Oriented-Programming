package Class_and_Object;

public class DynamicArray {

    private int data[];
    private int nextIndex;

    public DynamicArray()
    {
        data= new int[5];
        nextIndex= 0;
    }

    public void add( int element )
    {
        if( nextIndex == data.length )
        {
            restructure();
        }

        data[nextIndex]= element;
        nextIndex++;

    }

    private void restructure()
    {
        int temp[]= data;

        data= new int[2*data.length];

        for( int i= 0; i<temp.length; i++ )
        {
            data[i]= temp[i];
        }

    }

    public int get( int index )
    {
        if( index >= nextIndex )
        {
            // To Do error out
            return -1;
        }

        return data[index];
    }

    public void set( int index, int element )
    {
        if( index > nextIndex )
        {
            return;
        }

        if( index < nextIndex )
        {
            data[index]= element;
        }
        else
        {
            add(element);
        }

    }

    public int size()
    {
        return nextIndex;
    }

    public boolean isEmpty()
    {
        if( size() == 0 )
        {
            return true;
        }

        return false;

    }

    public int removeLast()
    {
        if ( size() == 0 )
        {
            // To Do error out
            return -1;
        }

        int value= data[nextIndex-1];
        nextIndex--;

        return value;

    }

}

