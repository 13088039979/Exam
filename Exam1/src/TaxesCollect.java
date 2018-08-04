import java.util.Scanner;

/**
 * Created by dx on 2018/8/4.
 */
public class TaxesCollect {
    public static void main(String[] args) {
        Double income;
        System.out.println("请输入你的工资:");
        Scanner sc = new Scanner(System.in);
        income = sc.nextDouble();
        Double tax = TaxesCount.Taxes(income-3500);
        System.out.println("你需要缴纳的税款为:"+ tax);
    }
}
