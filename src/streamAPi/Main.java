package streamAPi;

import assignment12.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    static class StreamTester {

        void testFileStream() throws IOException {
           Stream<String> fileLines = Files.lines(Paths.get("inputFile"));
           fileLines.forEach(System.out::println);
        }

        void testPrimitiveStream() {
            int[] integers = new int[]{1, 2, 3, 4, 5, 6};
          IntStream intStream = IntStream.of(integers);
          intStream.forEach(System.out::println);
        }

        void groupByYearOfEnrollment(List<Student> studentList) {
            Map<Integer, List<Student>> map =  studentList.stream().collect(Collectors.groupingBy(s->s.getYearOfEnrollment()));
            System.out.println(" -----------group by year of enrollment------");
            System.out.println(map);

        }

        void partitioningByPassingPercentage(List<Student> studentList){
            Map<Boolean, List<Student>> map =  studentList.stream().collect(Collectors.partitioningBy(s->s.getPercentageTillDate() > 60.0));
            System.out.println(" -----partition by passing per---------");
            System.out.println(map);
        }

        void groupingAndPartitioning(List<Student> studentList) {
            Map<String, Map< Boolean, List<Student>>> map =  studentList.stream().collect(Collectors.groupingBy(s->s.getEngineeringDepartment(), Collectors.partitioningBy(s-> s.getPercentageTillDate() > 60.0)));
            System.out.println(" -----grouping by eng department and then partitioning by passing per---------");

            System.out.println(map);
        }
        void testFlatMap() {
            String[] fruits = new String[]{"Apple", "Banana"};
            String[] vegetables = new String[]{"potato", "beans"};

            Stream<List<String>> st= Stream.of(Arrays.asList(fruits), Arrays.asList(vegetables));

             Stream<String>  flatStream =   st.flatMap(s->s.stream());
             System.out.println("----------flat stream -----------");
             flatStream.forEach(System.out::println);;
        }

        void testRange() {
           int max = IntStream.range(10,20).max().getAsInt();
            int min  = IntStream.range(10,20).min().getAsInt();
            long count  = IntStream.rangeClosed(10,20).count();
            double average  = IntStream.range(10,20).average().getAsDouble();
            System.out.println("---------range operation -------'");
            System.out.println(max+" "+min+ " "+count+" "+average);

        }
    }

    public static void main(String[] args) throws IOException {
       StreamTester st = new StreamTester();

       // stream from file
       st.testFileStream();

       //primitive stream
       st.testPrimitiveStream();

       //Grouping and Partitioning

        List studentArrayList = new ArrayList<Student>();

        studentArrayList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentArrayList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentArrayList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentArrayList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentArrayList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentArrayList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));


        st.groupByYearOfEnrollment(studentArrayList);
        st.partitioningByPassingPercentage(studentArrayList);
        st.groupingAndPartitioning(studentArrayList);


        //Flat Map
        st.testFlatMap();

        //range
        st.testRange();
    }
}
