import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by dx on 2018/8/4.
 */
public class PrintMap {
    public static void Print(Map<Integer, Integer[]> maps){
        //遍历取出map的值
        Set entries = maps.entrySet();
        System.out.println();
        Iterator<Map.Entry<Integer, Integer[]>> its = entries.iterator();
        while (its.hasNext()) {
            Map.Entry<Integer, Integer[]> entry = its.next();
            Integer[] mapsArry = entry.getValue();
            System.out.print("key=" + entry.getKey() + " and Value = ");
            for (int i = 0; i < mapsArry.length; i++) {
                if (mapsArry[i] / 10 == entry.getKey()) {
                    System.out.print(mapsArry[i] + " ");
                }
            }
            System.out.println();
        }

    }
}
