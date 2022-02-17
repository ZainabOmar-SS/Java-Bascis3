import java.io.File;
public class ListFile {
    public static void main(String[] args) {
        File file = new File("/Users/zainabomar/Desktop/smoothStack-projects");
        String[] fileList = file.list();
        for(String name: fileList){
            System.out.println(name);
        }
    }
}
