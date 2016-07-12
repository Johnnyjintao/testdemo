package two;

/*
 * 等待唤醒机制
 */


class Res {
	public String name;
	public String sex;
	boolean flag = false;
}

class Input implements Runnable{
	private Res r;
	
	public Input(Res r) {
		this.r = r;
	}
	public void run() {
		int x = 0;
		while (true) {
			synchronized (r) {
				if (r.flag) {
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				if (x == 0) {
					r.name = "mike";
					r.sex = "man";
				}else {
					r.name = "丽丽";
					r.sex = "女";
				}
				x = (x+1)%2;
				r.flag= true;
				r.notify();
			}
			
		}
		
	}
	
}


class Output implements Runnable{
	private Res r;
	
	public Output(Res r) {
		this.r = r;
	}
	public void run() {
		while (true) {
			synchronized (r) {
				if (!r.flag) {
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(r.name+".........."+r.sex);
				r.flag = false;
				r.notify();
			}
			
		}
		
	}
	
	
}


class ThreadDemo2{
	public static void main(String[] args) {
		Res r = new Res();
		
		Input in = new Input(r);
		Output out = new Output(r);
	
		Thread t = new Thread(in);
		Thread t1 = new Thread(out);
		
		t.start();
		t1.start();
	
	}
}