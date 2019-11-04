import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
class Person{
    String name;
    int age;
 Person(String name,int age){
     this.name=name;
     this.age=age;
 }
    
}
public class CreateArrayListExample {

    public static void main(String[] args) {
        // Creating an ArrayList of String
        List<String> animals = new ArrayList<>();

        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        animals.add(1,"leopard");
        System.out.println(animals);

        // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");
        List<String> birds=new ArrayList<>();
        birds.add("kiwi");
        birds.add("hen");
        birds.add("pernguin");
        animals.addAll(birds);
        animals.addAll(2,birds);
        System.out.println(animals);
        System.out.println(animals.contains("Dog"));
        System.out.println(animals.get(1));
        System.out.println(animals.indexOf("cat"));
        List<Person> personlist=new ArrayList<>();
        Person p1=new Person("owais",2);
        Person p2=new Person("owais",2);
        Person p3=new Person("owais",2);
        personlist.add(p1);
        personlist.add(p2);
        personlist.add(p3);
        Iterator itr=personlist.iterator();  
        while(itr.hasNext()){
           Person obj=(Person)itr.next();
        System.out.println(obj.name);
              
  }
             for(int i=0;i<personlist.size();i++)  
           {  
                    Person obj1=(Person)personlist.get(i);
            System.out.println(obj1.name);     
           }
  }
}