import java.io.*;
import java.lang.Object;

public class ListFile {
    void getFileList(String folderPath){
        File file=new File(folderPath);
        String[] fileList=file.list();
        for(int i = 0; i < fileList.length; i++) {
            System.out.println(fileList[i]);
            if(fileList[i].endsWith(".txt")){
                File reFile=new File(folderPath+"/"+fileList[i]);
                FileInputStream newFile=null;
                try{
                    newFile = new FileInputStream(reFile);
                    byte fileContent[] = new byte[(int)reFile.length()];
                    newFile.read(fileContent);
                    String s = new String(fileContent);
                    System.out.println("File content: " + s);
                }
                catch (FileNotFoundException e) {
                    System.out.println("File not found" + e);
                }
                catch (IOException ioe) {
                    System.out.println("Exception while reading file " + ioe);
                }
                finally {
                    // close the streams using close method
                    try {
                        if (newFile != null) {
                            newFile.close();
                        }
                    }
                    catch (IOException ioe) {
                        System.out.println("Error while closing stream: " + ioe);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ListFile testObj=new ListFile();
        testObj.getFileList("/home/niit/Java/JAVA PRACTICE 2/src");
    }

}
