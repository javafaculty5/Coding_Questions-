import java.util.*;
class Best{
 int a = 12;
 void sum(int a, int b){
System.out.println(a+b);
}
}
class Nest {
 void display(){
     System.out.println("display called");
   
 }
}
class West extends Best,Nest{
   void show(){
       System.out.println(a);
   sum(10, 12);
   }
}
public class Test {

   static  public void main(String[] args){
     West n = new West();
     n.show();
    
   }
}

