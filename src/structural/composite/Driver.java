package structural.composite;

public class Driver {

    public static void main(String[] args) {
        Employee ceo = new Employee("Dave", "CEO");

        Employee projectManager1 = new Employee("peter", "Project Manager");
        Employee projectManager2 = new Employee("John", "Project Manager");

        Employee project1DevLead = new Employee("Rohan",  "Dev TeamLead");
        Employee project1QALead = new Employee("Vijay",  "QA TeamLead");

        Employee project2DevLead = new Employee("Venu",  "Dev TeamLead");
        Employee project2QALead = new Employee("Pardha",  "QA TeamLead");

        SoftwareEngineer project1SE1 = new SoftwareEngineer("Raj",  "Dev Software Engineer");
        SoftwareEngineer project1SE2 = new SoftwareEngineer("Mohan",  "Dev Software Engineer");

        SoftwareEngineer project2SE1 = new SoftwareEngineer("Hema",  "Dev Software Engineer");
        SoftwareEngineer project2SE2 = new SoftwareEngineer("Anuj",  "Dev Software Engineer");

        SoftwareEngineer project1QA1 = new SoftwareEngineer("Saran",  "QA Software Engineer");
        SoftwareEngineer project2QA1 = new SoftwareEngineer("Riya",  "QA Software Engineer");

        ceo.addSubordinate(projectManager1);
        ceo.addSubordinate(projectManager2);

        projectManager1.addSubordinate(project1DevLead);
        projectManager1.addSubordinate(project1QALead);

        projectManager2.addSubordinate(project2DevLead);
        projectManager2.addSubordinate(project2QALead);

        project1DevLead.addSubordinate(project1SE1);
        project1DevLead.addSubordinate(project1SE2);
        project1QALead.addSubordinate(project1QA1);

        project2DevLead.addSubordinate(project2SE1);
        project2DevLead.addSubordinate(project2SE2);
        project2QALead.addSubordinate(project2QA1);

        ceo.print();

    }
}
