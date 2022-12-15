package structural.composite;

import java.util.ArrayList;

public class Employee extends AbstractEmployee {

    private ArrayList<AbstractEmployee> subordinateList = new ArrayList<>();

    public Employee(String name, String designation) {
        super(name, designation);
    }

    public void addSubordinate( AbstractEmployee employee )
    {
        subordinateList.add(employee);
    }

    @Override
    void print() {
        System.out.println("Name : "+ name+ " Designation: "+ designation);
        System.out.println("------Subordinates----- "+ name);
        subordinateList.forEach((em) ->em.print());
        System.out.println("------Subordinates----- End "+ name);
    }
}
