import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args){
            List <Student> students = Arrays.asList(
                    new Student("1","an", 3.2),
                    new Student("2","huy", 2.3),
                    new Student("3","nam", 2.4),
                    new Student("3","phanh", 3.5),
                    new Student("3","lan", 3.6)


            );
            System.out.println("sinh vien co gpa >= 3.2");
            students.stream()
                    .filter(s -> s.getGpa() >= 3.2 )
                    .sorted(Comparator.comparing(Student::getGpa).reversed())
                    .forEach(System.out::println);


        }
}
