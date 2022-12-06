package lambdas.Functions.consumer;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main{

    static class Student{
        public int age;
        public String name;

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Consumer<Student> consumer1 = s1 -> s1.age += 1;
        Consumer<Student> consumer2 = System.out::println;
        List<Student> studentList = Arrays.asList(new Student(18, "andy"), new Student(19, "jack"), new Student(20, "Dan"));
        System.out.println("Before chaining:");
        studentList.forEach(consumer2);
        System.out.println("----");
        System.out.println("After chaining:");
        studentList.forEach(consumer1.andThen(consumer2));


        //BiConsumer
        System.out.println("----BiConsumer----");
        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "Java");
        map.put(2, "C++");
        map.put(4, "JavaScript");
        map.put(5, "Go");

        BiConsumer<Integer, String> print = (k, v) -> System.out.println(k + ":" + v);
        map.forEach(print);

        //BiConsumer andThen
        Map<Integer, Student> map2 = new LinkedHashMap<>();
        map2.put(1, new Student(18, "andy"));
        map2.put(2, new Student(19, "jack"));
        map2.put(3, new Student(20, "Dan"));
        BiConsumer<Integer, Student> print2 = (k, v) -> System.out.println(k + ":" + v);

        BiConsumer<Integer, Student> modify = (k, v) -> v.name+="modified";
        map2.forEach(modify.andThen(print2));

    }
}
