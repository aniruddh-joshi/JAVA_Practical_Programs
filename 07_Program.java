class box{
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
    public void vol(){
        System.out.println(l*w*h);
    }
}
class d1 extends box{
    protected int wt;
    public void set(int x,int y,int z,int u){
        l=x;
        w=y;
        h=z;
        wt=u;
    }
    public void get(){
        System.out.println(l);
        System.out.println(w);
        System.out.println(h);
        System.out.println(wt);
    }
    public void density(){
        System.out.println(wt/(l*w*h));
    }
}
class d2 extends d1{
    protected String col;
    public void set(int x,int y,int z,int u,String s){
        l=x;
        w=y;
        h=z;
        wt=u;
        col=s;
    }
    public void get(){
        System.out.println(l);
        System.out.println(w);
        System.out.println(h);
        System.out.println(wt);
        System.out.println(col);
    }
    public void blackbox(){
        col="black";
    }
}

class demo{
    public static void main(String ar[]){
        box obj_box= new box();
        d1 obj_d1=new d1();
        d2 obj_d2=new d2();

        obj_box.set(1,2,3);
        obj_box.get();
        obj_box.vol();

        obj_d1.set(1,2,3,4);
        obj_d1.get();
        obj_d1.density();

        obj_d2.set(1,2,3,4,"red");
        obj_d2.get();
        obj_d2.blackbox();
    }
}