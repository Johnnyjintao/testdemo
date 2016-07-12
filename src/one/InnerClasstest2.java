package one;

/**
 * 匿名内部类
 * @author john
 *
 */
	

interface Person {
    public void eat();
}
 
public class InnerClasstest2 {
    public static void main(String[] args) {
        Person p = new Person() {
            public void eat() {
                System.out.println("eat something");
            }
        };
        p.eat();
    }
}

