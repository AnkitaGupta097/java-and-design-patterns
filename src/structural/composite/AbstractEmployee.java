package structural.composite;

public abstract class AbstractEmployee {

    protected String name;
    protected String designation;

    public AbstractEmployee( String name, String designation )
    {
        this.name = name;
        this.designation = designation;
    }


    abstract void print();
}
