import java.text.MessageFormat;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeSet;

class LottoEntryComparator implements
			Comparator<Entry<Integer, Integer>>{

	@Override
	public int compare(Entry<Integer, Integer> o1, 
			Entry<Integer, Integer> o2) {
		int result = o1.getValue().compareTo(o2.getValue())* -1;
		if(result == 0 ) {
			result = o1.getKey().compareTo(o2.getValue())* -1;
		}
		// TODO Auto-generated method stub
		return result;
	}
	
}

public class MapLottoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer>lottoMap = new HashMap<>();
		Random random = new Random();
		for(int i=0; i<100000; i++) {
			int num = random.nextInt(45)+1;
			if(lottoMap.containsKey(num)) {
				lottoMap.put(num, lottoMap.get(num)+1);
			} else {
				lottoMap.put(num, 1);
				
			}
		}
		lottoMap.put(num, 1);
	}

}
 sortLottoByValue(lottoMap);
 }
 
 public static void sortLottoByValue(Map<Integer, Integer>map) {
	 TreeSet<Map.Entry<Integer, Integer>>sortedEntries=
			 	new TreeSet<>(new LottoEntryComparator());
	 sortedEntries.addAll(map.entrySet());
	 String pattern = "{0}번호:{1}\t(총 누적: {2})";
	 for(int i=0; i<7; i++) {
		 Entry<Integer, Integer>first=sortedEntries.pollFirst();
		 String msg = null;
		 if(i==6) {
			 msg = MessageFormat.format(pattern,"보너스", first.getKey(),first.getValue());
			 
		 }else {
			 msg= MessageFormat.format(pattern, "당첨",first.getKey(),first.getValue());
		 }
		 System.out.println(msg);
	 }
 }
 
 
 
 
 
 
 
 
 
 
 
 
