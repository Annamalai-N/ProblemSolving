import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandling {
    public static void main(String[] args) {
//        try(InputStreamReader isr=new InputStreamReader(System.in)){
//            System.out.println("write some letters");
//            int letters= isr.read();
//            while(isr.ready()){
//                System.out.println((char)letters);
//                letters= isr.read();
//
//            }
//            isr.close();
//            System.out.println();
//
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }


//        try(FileReader fr=new FileReader("src/notes.txt")){
//            System.out.println("write some letters");
//            int letters= fr.read();
//            while(fr.ready()){
//                System.out.println((char)letters);
//                letters= fr.read();
//            }
//            fr.close();
//            System.out.println(letters);
//
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }


        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("you typed:"+br.readLine());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        try(BufferedReader br=new BufferedReader(new FileReader("src/notes.txt"))){
           while(br.ready()){
                System.out.println("you typed :" + br.readLine());
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }
}
