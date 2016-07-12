package one;



/**
 * 单例设计模式
 * @author john
 *
 */

//饿汉式
class Single{
	public static final Single s = new Single();

	private Single(){};
	
	private static Single getInstans() {
		return s;
	}
}

//懒汉式
class Singler{
	public static Singler s = null;
	private Singler(){};
	
	private static Singler getInstans(){
		if (s == null) {
			s = new Singler();
		}
		return s;
	}
}




public class danliDemo {

	public static void main(String[] args) {

	}

}
