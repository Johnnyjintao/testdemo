package five;


class utils<QQ>{
private QQ q;
public void setObject(QQ q){
	this.q = q;
}
public QQ getObject(){
	return q;
}
}

class Worker{}

class Person{}



public class GenericDemo {

	/**
	 * ∑∫–Õ¿‡
	 */

	public static void main(String[] args) {
		utils<Worker> u= new utils<Worker>();
		u.setObject(new Worker());
		Worker w = u.getObject();
		
		
	}

}
