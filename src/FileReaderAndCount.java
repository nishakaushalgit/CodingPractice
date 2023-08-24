import java.io.*;
import java.io.FileReader;

public class FileReaderAndCount {
    public static void main(String args[]) throws Exception{
        int count =0;
        FileReader fr= new FileReader("/Users/kshitijchaudhary/Documents/testfolder/sample.txt");
        BufferedReader br= new BufferedReader(fr);

        String str;
        while((str=br.readLine())!=null){
            String arr[]=str.split(" ");
            count=count +arr.length;
        }
        System.out.println(count);
        br.close();
    }
}
