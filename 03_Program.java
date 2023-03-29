import java.util.*;
class demoadd{
    public static void main(String ags[]){
        int a,b;
        Scanner scobj=new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        a=scobj.nextInt();
        System.out.print("Enter the 2nd number: ");
        b=scobj.nextInt();
        add(a,b);
    }
    public static void add(int x, int y){
        int sum=x+y;
        System.out.println("The Sum is "+sum);
    }
}