import java.util.*;
class demo{
    public static void main(String ar[]){
        int a;
        char c;
        String s;
        Scanner scobj=new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        a=scobj.nextInt();
        System.out.println("Integer Entered: "+a);

        System.out.print("Enter a Character: ");
        c=scobj.next().charAt(0);
        System.out.println("Character Entered: "+c);

        System.out.print("Enter an String: ");
        s=scobj.nextLine();
        s=scobj.nextLine();
        System.out.println("String Entered: "+s);
    }
}