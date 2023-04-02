class box{
    private static int l,w,h;

    public static void set(int x,int y,int z){
        l=x;
        w=y;
        h=z;
    } 

    public static void get(){
        System.out.println(l);
        System.out.println(w);
        System.out.println(h);
    }
}
class demo{
    public static void main(String ar[]){
        box.set(10,20,30);
        box.get();
    }
}