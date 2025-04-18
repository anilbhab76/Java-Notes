import java.io.*;
class Demo{

    public static void main(String[] args){
        //File
        File file = new File("empty.txt");
        
            if(!file.exists()){
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    System.out.println("File exception: " + e);
                }
            }

        //FileWriter
        try {
            FileWriter writer = new FileWriter(file,true);
            writer.write("Data from Demo class");
            writer.close();
        } catch (IOException e) {
            System.out.println("FileWriter exception: " + e);
        }

        //FileReader
        try {
            FileReader reader = new FileReader(file);
//            int ch = reader.read();                     //Reads first character, return type is int
//            System.out.println(ch);
//            System.out.println((char)ch);

            int c;

            while((c=reader.read())!= -1){
                System.out.print((char)c);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("FileReader exception: " + e);
        }

        try {
            BufferedWriter bWriter = new BufferedWriter(new FileWriter("empty.txt"));
               bWriter.write("Hello \n");
               bWriter.write("from bWrite \n");
                bWriter.close();

            BufferedReader bReader = new BufferedReader(new FileReader("empty.txt"));
          //  System.out.println(bReader.read());             //Reads single character
         //   System.out.println(bReader.readLine());         //Reads single line

            String line;
            while ((line = bReader.readLine())!=null) {
                System.out.println(line);
            }
            bReader.close();
        } catch (IOException e) {
            System.out.println("Exception in Buffered");
        }
        try {
            System.out.println(1/0); //it throws  - Exception in 'main' means program runnungon main thread
        } catch (Exception e) {
            e.printStackTrace(); 
            }

    Test thread1 = new Test();
    thread1.setDaemon(true); // by default setDaemon will be false (thread is user thread.)
    //if we set thread to daemon thread, it stops working , when main thread exists
    thread1.start();
    System.out.println("main exists");
    }

    

}