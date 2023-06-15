import java.io.*;
class demo {

public static void main(String args[])throws FileNotFoundException, IOException{
    String s="this is line\nthis is line2";

    FileOutputStream fout=new FileOutputStream("test.txt");

        for(int i=0;i<s.length();i++){
            fout.write(s.charAt(i));
        }
        fout.close();

    FileInputStream fin=new FileInputStream("test.txt");
    int c;
    while( (c=fin.read())!=-1 ){
        System.out.print((char)c);
        }
    }
}
