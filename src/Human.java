import java.util.ArrayList;
public class Human {
    String name;
    int age;
    int height;


    public Human(int age,String name){
        this.age=age;
        this.name=name;


    }
    public ArrayList<Object> getValues(){
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(this.name);
        list.add(this.age);
        return list;
    }


    public static void main(String[] args) {
        Human h1=new Human(10,"mahi");
        Human h2=new Human(11,"sahil");
        h1.name="raja";
        System.out.println(h1.age);
        System.out.println(h1.name);

        System.out.println(h1.getValues());






        System.out.println(h1.name);



    }
}