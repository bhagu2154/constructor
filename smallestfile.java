package constructor;

import java.io.File;
import java.io.IOException;

public class smallestfile {
    public static void main(String[] args) throws IOException {
         File file =new File("src/array");
         File [] files=file.listFiles();
         File smallfile= files[0];
         for ( File fs :files){
             if(smallfile.length()>fs.length()){
                 smallfile= fs;
             }
             System.out.println(fs.getName()+"\t"+fs.length());
         }
        System.out.println("smallest file name " +smallfile.getName()+"\t"+smallfile.length());
    }
}
