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
}

class d1 extends box{
    protected int wt;
    public void set(int x,int y,int z,int u){
        super.set(x,y,z);
        wt=u;
    }
    public void get(){
        System.out.println(l);
        System.out.println(w);
        System.out.println(h);
        System.out.println(wt);
    }
}

class d2 extends d1{
    protected String col;
    public void set(int x,int y,int z,int u,String s){
        super.set(x,y,z,u);
        col=s;
    }
    public void get(){
        System.out.println(l);
        System.out.println(w);
        System.out.println(h);
        System.out.println(wt);
        System.out.println(col);
    }
}

class demo{
    public static void main(String ar[]){
        d2 obj_d2=new d2();
        obj_d2.set(1,2,3,4,"red");
        obj_d2.get();
    }
}