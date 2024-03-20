//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] score = {10, 20, 30, 50, 60, 70, 90};
//        for (int i:score)
//            System.out.println(i);
//        System.out.println("----------------------------");
//        Arrays.stream(score).forEach(System.out::println);
//
//    }
//}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//public class Main {
//    public static void main(String[] args)
//            throws Exception {
//        URL url = new URL("http://192.168.1.143:20100/cars");
//        BufferedReader reader = new BufferedReader
//                (new InputStreamReader(url.openStream()));
//        String line;
//        line = reader.readLine().replace("<br>","");
//        String[] arr = line.split(",");
//        System.out.println(line);
//        for(String c:arr){
//            System.out.println(c);
//        }
//        reader.close();
//    }
//}

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "strings");
//        strings.stream().sorted(String::compareTo).forEach(System.out::println);
//        strings.stream().map(String::length).forEach(System.out::println);
        strings.stream().map(name -> name.split(" ")).map(Person::new).map(Person::getName).forEach(System.out::println);
//        Person person = new Person("aaa");
//        System.out.println(person.getName());
//        Comparator.naturalOrder();

    }

}
class Person{
    private String name;
    Person(String name){
        this.name = name;
    }
    Person(String... names){
        this.name = Arrays.stream(names).collect(Collectors.joining(", "));
    }
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
}