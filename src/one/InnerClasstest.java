package one;

/**
 * 匿名内部类
 * @author john
 *
 */
	
	interface Inter{
		void method();
	}
	
	
	class Test{
		
//		static class Neibu implements Inter{
//
//			public void method() {
//				System.out.println("haha");
//			}
//			
//			
//		}
//		
//		public static Inter function(){
//			
//			return new Neibu();
//		}
//		
		
		
		
		static Inter function(){
			return new Inter(){
				public void method(){
					System.out.println("hehe");
				}
			};
		}

	}
	
	public class InnerClasstest {
		public static void main(String[] args) {
		Test.function().method();
	 }

}
