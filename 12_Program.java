abstract class base{
    abstract public void get();

    final public static void fun(){
        System.out.println("Fun is called");
    }
    base(){
        System.out.println("Constructor called");
    }
}

class box extends base{
    protected int l,w,h;

    public void set(int x,int y,int z){
        l=x;
        w=y;
        h=z;
    }
    public void get(){
        System.out.println(l);
        System.out.println(w);
        System.out.println(h);
    }
}

class demo{
    public static void main(String ar[]){
        box obj_box=new box();
        obj_box.set(1,2,3);
        obj_box.get();

        base.fun();
    }
}