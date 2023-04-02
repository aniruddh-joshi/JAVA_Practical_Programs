import java.util.*;

class demooverloading{

public static void main(String ar[]){
    int a,b,c;
    Scanner scobj=new Scanner(System.in);
    System.out.print("Enter the value of a: ");
    a=scobj.nextInt();
    System.out.print("Enter the value of b: ");
    b=scobj.nextInt();
    System.out.print("Enter the value of c: ");
    c=scobj.nextInt();
    add(a,b);
    add(a,b,c);
}
static void add(int x,int y){
    System.out.println("Sum of a and b is "+(x+y));
}
static void add(int x,int y,int z){
    System.out.println("Sum of a and b and c is "+ (x+y+z));
}

}