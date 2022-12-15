package structural.composite;

public class SoftwareEngineer extends AbstractEmployee{

    public SoftwareEngineer(String name, String designation) {
        super(name, designation);
    }

    @Override
    void print() {
      System.out.println("Name : "+ name+ " Designation: "+ designation);
    }
}
