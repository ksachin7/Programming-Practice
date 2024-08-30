package itssachin.assignments3;
//import java.io.*;
//import java.util.Scanner;
//
//public class Demo {
//    public static void main(String[] args) throws Exception {
//
//        BufferedWriter bw = new BufferedWriter(new FileWriter("Test.txt"));
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the text: ");
//        String str = sc.nextLine();
//
//        while (!str.equals("EOF")) { // EOF(End of File) used as esacpae sequence.
//            bw.write(str);
//            str = sc.nextLine();
//        }
//        bw.close();
//        System.out.println("File Written Successfully.");
//    }
//}
//
//// For reading the text file.
//class FRDemo {
//    public static void main(String[] args) throws Exception {
//
//        BufferedReader br = new BufferedReader(new FileReader("Test.txt"));
//        int i;
//        while ((i = br.read()) != -1) {
//            System.out.print((char) i);         // type casting to character
//        }
//        br.close();
//    }
//}

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.FileOutputStream;
import java.net.URL;
import java.awt.Image;
public class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.imageProcessing();
    }

    public void imageProcessing(){
        System.out.println("HO");
        try {
            System.out.println("Start");
            Image image= null;
            try{
                // url of the image is wrapped in URL Object
                URL url = new URL("https://itssachin.epizy.com/img/pics/img%20(14).jpg");

                // BufferedImage ref variable holds the image read at specified URL
                // by the ImageIO class through its static method read()
                image = ImageIO.read(url);
            } catch (IOException e) {
                System.out.println("Error "+e.getLocalizedMessage());

            }
            System.out.println("Processing...");



            BufferedImage imageuri = (BufferedImage) image;


            FileOutputStream fout = null;

            try {

                fout = new FileOutputStream("src/myfile.jpg");
                ImageIO.write(imageuri, "jpg",fout);
                System.out.println("Done");
            } finally {

                if (fout != null) {
                    fout.close();
                }
            }
//
            System.out.println("Done End");
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Error "+e.getLocalizedMessage());
            // System.err.println(e);
        }
    }
}