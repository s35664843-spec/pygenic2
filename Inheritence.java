class animal{
    void eat(){
    System.out.println("eating...");

}
}
class dog extends animal  {
    void eat(){
        System.out.println("dog is eating");
    }
}
public class Inheritence{
public static void main(String args[]){
    animal a = new animal();
    animal b = new animal();
    a.eat();
    b.eat(); 
}}