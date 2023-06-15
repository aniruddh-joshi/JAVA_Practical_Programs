class task{
    public void run() { 
        for(int i=0;i<100;i++){
            System.out.println("thread1:"+i+" ");
        }
    }
    public void run2(){
        for(char c='a';c<'z';c++){
            System.out.println("thread2 : "+c);
        }
    }
}

class thread1 extends Thread{
Thread obj_thread;
task obj_task;
thread1(task obj_task){
    this.obj_task=obj_task;
    obj_thread=new Thread(this);
    obj_thread.start();
}
    public void run() {
        obj_task.run();
    }
}


class thread2 extends Thread{
Thread obj_thread;
task obj_task;
thread2(task obj_task){
    this.obj_task=obj_task;
    obj_thread=new Thread(this);
    obj_thread.start();
}
    public void run(){
        obj_task.run2();
    }
}

class demo{
    public static void main(String args[]){
        task obj=new task();
        thread1 obj1=new thread1(obj);
        thread2 obj2=new thread2(obj);
    }
}
