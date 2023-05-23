import java.util.HashSet;
import java.util.Set;
//learning hashset
class java_practises {
    public static void main(String[] args) {
        Set<String> names =new HashSet<>();
        names.add("rama");
        names.add("siya");
        names.add("radha");
        names.add("satayam");
        names.add("preeetam");
        names.add("shudhanshu");
        names.add("krishna");
        System.out.println(names);


        //size
        System.out.println(names.size());


        //contains
        System.out.println( names.contains("siya"));
        

        //iterating with the use of inhanced for loop
        for (String name : names){
            System.out.println(name);
        }
       
       //for each approch to solve (iterate through )
        names.forEach(System.out::println);
    }
}