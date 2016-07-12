package five;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	/**
	 * @param Map-keyset  拿到map中所有元素
	 * 		  Map-entryset
	 */
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		
		map.put("zhang01", "zhang001");
		map.put("zhang02", "zhang002");
		map.put("zhang03", "zhang003");
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		
		Iterator<Entry<String,String>> it = entrySet.iterator();
		
		while (it.hasNext()) {
			Entry<String, String> entry = it.next();
		    String key = entry.getKey();
		    String value = entry.getValue();
		    System.out.println(key+value);
		}
		
		
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> its = keySet.iterator();
		
		while (its.hasNext()) {
			String key = its.next();
			String value = map.get(key);
			System.out.println(key+"...."+value);
		}
	}

}
