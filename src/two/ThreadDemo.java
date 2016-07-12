package two;


 class Ticket implements Runnable{
	 private static int ticket = 1;
	 Object obj= new Object();
	 public void run() {
			 while (true) {
				 synchronized (obj) {
					 if (ticket >0) {
						 try {Thread.sleep(10);} catch (Exception e) {
						}
						 System.out.println(Thread.currentThread().getName()+"ºÅ´°¿Ú»¹Ê£Æ±Êý"+ ticket--);;
					}
				}
				 
			}
		}
	 }


public class ThreadDemo {

	public static void main(String[] args) {
		Ticket t = new Ticket();
		
		Thread  t1 = new Thread(t);
		Thread  t2 = new Thread(t);
		Thread  t3 = new Thread(t);
		Thread  t4 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
