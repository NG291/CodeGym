import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class hashMapAndHashSet {
    public static void main(String[] args){
        Student one = new Student("Nam",20, "Hn");
        Student trueOne = new Student("Nguyen",22, "ND");
        Student three= new Student("Son",19, "Hn");
        Student four = new Student("Linh",23, "Hn");
        //wite your code here
        Map<Integer,Student > studentMap= new HashMap<Integer,Student>();
        studentMap.put(1,one);
        studentMap.put(2,three);
        studentMap.put(3,four);
        studentMap.put(4,trueOne);
        for(Map.Entry<Integer,Student> student:studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("............");
        Set<Student> students= new HashSet<Student>();
        students.add(one);
        students.add(trueOne);
        students.add(three);
        students.add(four);
        for(Student studenone:students){
            System.out.println(studenone.toString());
        }
    }
}
