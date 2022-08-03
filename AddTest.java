@FunctionalInterface
interface Interfadd {
 public void add(int a,int b);
 }

class AddTest {
  public static void main(String[] args) {
    Interfadd i=(a,b)->System.out.println("sum of "+(a+b));
     
    i.add(10,30);
    i.add(40,50);
  }
}