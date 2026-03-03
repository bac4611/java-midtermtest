package Ex1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        studentManager<Student> sm = new studentManager<>();

        sm.add(new Student("1","huy",3.6));
        sm.add(new Student("2","an",3.7));
        sm.add(new Student("3","nam",3.8));

        System.out.println("danh sach sinh vien ");
        for(Student s : sm.getAll()){
            System.out.println(s);
        }
    }
 }

