package two;

/*
 * 生产者和消费者
 */


class Ress {
	public String name;
	public int count = 1;
	boolean flag = false;
	
	
	
	
	public synchronized void set(String name){
		if (flag) {
			try {this.wait();} catch (Exception e) {}
		}
				
				this.name = name+"-----"+count++;
				System.out.println(Thread.currentThread().getName()+"...生产了"+this.name);
				flag = true;
				this.notify();
	}
	
	public synchronized void out(){
		if (!flag) {
			try {this.wait();} catch (Exception e) {}
		}
				
				System.out.println(Thread.currentThread().getName()+"...消费了"+this.name);
				flag=false;
				this.notify();
		
	}
}

class producer implements Runnable{
	private Ress r;
	
	public producer(Ress r) {
		this.r = r;
	}
	public void run() {
		while (true) {
			r.set("商品");
		}
	}
}


class consumer implements Runnable{
	private Ress r;
	
	public consumer(Ress r) {
		this.r = r;
	}
	public void run() {
		while (true) {
			r.out();
		}
		
	}
	
}


class ThreadDemo3{
	public static void main(String[] args) {
		Ress r = new Ress();
		
		producer pro = new producer(r);
		consumer con = new consumer(r);
		
		Thread t = new Thread(pro);
		Thread t1 = new Thread(con);
		
		t.start();
		t1.start();
		
	}
}