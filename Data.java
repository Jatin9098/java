import Stream.StreamExample;

class Hello {

    public static void main(String[] args) {

        // Thread Example
        // Runnable a = new A();
        // Runnable b = new B();

        // Thread t1 = new Thread(a);
        // Thread t2 = new Thread(b);

        // t1.start();

        // try {
        //     Thread.sleep(500);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        // System.out.println("End of thread t1" + t1.isAlive());
        // t2.start();

        // Stream Example
         StreamExample.run();

        Data a = new A();
        a.address(4);


        Data a1 = new Data(){

            public void address(int x){
                System.out.println("New Address "+x);
            }

        };
        a1.address(5);


        Data a12 = (i) -> System.out.println("New Address from anonymous "+i);
        a12.address(10);


    }

}


public interface  Data {

    void address(int x);

    
}


class A implements Runnable,Data {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi " + 1);

        }
    }

    public void address(int x){
        System.out.println("this is address "+x);
    }

}

class B implements Runnable {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Helooo ");
            try {
                Thread.sleep(110);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}