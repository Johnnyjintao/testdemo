package five;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo2 {

	/**
	 * @param Map练习
	 */
	public static void main(String[] args) {
		HashMap<String, HashMap<String, String>> school = new HashMap<String, HashMap<String,String>>();
		
		HashMap<String, String> yure = new HashMap<String, String>();
		
		HashMap<String, String> jiuye = new HashMap<String, String>();
		
		school.put("就业班", jiuye);
		school.put("预热班", yure);
		
		yure.put("001", "johny");
		yure.put("002", "hans");
		
		jiuye.put("001", "james");
		jiuye.put("002", "afusen");
		
		Set<String> keySet = school.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String id = (String) it.next();
			HashMap<String, String> map = school.get(id);
		
			System.out.println(id);
			getstudentInfo(map);
		}
	}
	
//	public static void getstudentInfo (HashMap<String, HashMap<String, String>> map){
//		Set<String> keySet = map.keySet();
//		
//		Iterator<String> it = keySet.iterator();
//		while (it.hasNext()) {
//			String id = it.next();
//			HashMap<String, String> name = map.get(id);//根据键取值
//			
//			System.out.println(id+"..."+name);
//		}
//	}
//	
	
	public static void getstudentInfo (HashMap<String, String> map){
		Set<String> keySet = map.keySet();
		
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String id = it.next();
			String name = map.get(id);//根据键取值
			
			System.out.println(id+"..."+name);
		}
	}
	
	

}
