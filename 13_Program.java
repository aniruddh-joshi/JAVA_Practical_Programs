interface myinterface{
    public void set(int x,int y,int z);
    public void get();
}

class box implements myinterface{
    private int l,w,h;
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

class demo{
    public static void main(String ar[]){
        box obj=new box();
        obj.set(1,2,3);
        obj.get();
    }
}