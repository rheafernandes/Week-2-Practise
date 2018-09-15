import java.io.*;
public class fileRead {
    boolean readFile(String filePath)throws Exception {
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        int length=0;
        while ((st = br.readLine()) != null) {
            System.out.println(st.toUpperCase());
            length=length+st.length();
        }
        System.out.println("The length of the file: "+length);
        if (length==0)
            return false;
        else
            return true;
    }
}
