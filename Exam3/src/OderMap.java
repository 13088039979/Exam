import java.util.*;

/**
 * Created by dx on 2018/8/4.
 */
public class OderMap {
    public static void main(String[] args) {
        int index = 0;
        List randomList = new ArrayList();
        Integer[] numArry = new Integer[50];
        Map<Integer, Integer[]> maps = new HashMap<>();
        //生成随机数,并转入List,输出
        Random random = new Random();
        System.out.print("生成的随机数为");
        for (int i = 0; i < 50; i++) {
            Integer num = random.nextInt(100);
            System.out.print(num + " ");
            randomList.add(num);
        }
        //将List数据取出存放数组
        Iterator it = randomList.iterator();
        while (it.hasNext()) {

            Integer next = (Integer) it.next();
            numArry[index] = next;
            index++;
        }
        //将数组按十位打包成一个集合
        for (int j = 0; j < 10; j++) {
            int k = 0;
            for (int i = 0; i < 50; i++) {
                if (j == numArry[i] / 10) {
                    randomList.add(k, numArry[i]);
                    k++;
                }
            }
            //将集合转化为数组并装入map
            Integer[] mapArry = (Integer[]) randomList.toArray(new Integer[randomList.size()]);
            maps.put(j, mapArry);
        }
        PrintMap.Print(maps);
        //将数组按十位打包成一个集合并排序
        for (int j = 0; j < 10; j++) {
            int k = 0;
            for (int i = 0; i < 50; i++) {
                if (j == numArry[i] / 10) {
                    randomList.add(k, numArry[i]);
                    k++;
                }
            }
            //将集合转化为数组并装入map
            Integer[] mapArry = (Integer[]) randomList.toArray(new Integer[randomList.size()]);
            Arrays.sort(mapArry);
            maps.put(j, mapArry);
        }
        PrintMap.Print(maps);
    }
}