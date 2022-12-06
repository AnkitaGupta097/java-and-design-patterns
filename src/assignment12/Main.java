package assignment12;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List studentArrayList = new ArrayList<Student>();

        studentArrayList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentArrayList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentArrayList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentArrayList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentArrayList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentArrayList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentArrayList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentArrayList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentArrayList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentArrayList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentArrayList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentArrayList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentArrayList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentArrayList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentArrayList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentArrayList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentArrayList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        StudentsHelper management = new StudentsHelper(studentArrayList);

        management.printAllEngineeringDepartments();

        System.out.println(management.joinedAfterEnrollmentYear(2018));

        System.out.println(management.filterByGenderAndDepartment("Male", "Computer Science"));

        System.out.println(management.countBasedOnGender());

        System.out.println(management.averageAgeByGender());

        System.out.println(management.getDetailsOfHighestPercentage());

        System.out.println(management.countBasedOnDepartments());

        System.out.println(management.averageBasedOnDepartment());

        System.out.println(management.findYoungestBasedOnGenderAndDepartment("Male", "Electronic"));

        System.out.println(management.countByGenderBasedOnDepartments("Computer Science"));
    }
}
