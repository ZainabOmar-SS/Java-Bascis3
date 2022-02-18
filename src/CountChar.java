import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class CountChar {
    public static void main(String[] args) {
        try{
            FileInputStream file = new FileInputStream("/Users/zainabomar/Desktop/text.txt");
            BufferedInputStream bufferIS = new BufferedInputStream(file);

            int i;
            int counter = 0;

            while((i=bufferIS.read())!=-1){
                char letter = (char)i;

                if (letter == args[0].charAt(0)){
                    counter ++;
                }
            }
            System.out.println("Letter e  is repeated"+ counter );
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
