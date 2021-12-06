public class Person {
        int id;
        String name;
        int salary;
     Person(int id,String name){
            this.id=id;
            this.name=name;
        }
    }
    class Emp extends Person{

         Emp(int id,String name,int salary){
            super(id,name);//reusing parent constructor
            this.salary=salary;
        }
        void display(){
            System.out.println(id+"  "+name+"  "+salary);
        }
    }
    class Main{
        public static void main(String[] args){
            Emp e1=new Emp(1,"Yogesh",50000);
            e1.display();
        }
}

