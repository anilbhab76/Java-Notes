public class Test extends Thread {

    @Override
    public void run() {
        
        System.out.println("Thread starts");
        for(int i =0;i<50;i++){
            System.out.println("From thread");
        }

            System.out.println("Thread stops");
    }

    
}
    

