import java.util.Scanner;

/**
 * Created by dx on 2018/8/4.
 */
public class NextDate {
    public static void main(String[] args) {
        System.out.println("请输入日期:");
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        String[] dates = date.split("-");
        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);
        if (year<0 ||month<=0||month>12){
            System.out.println("输入错误");
            return;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (1 <= day && day < 31) {
                    day++;
                } else if (day == 31) {
                    day = 1;
                    month++;
                } else {
                    System.out.println("输入错误");
                    return;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 30 && day >= 1) {
                    day++;
                    break;
                } else if (day == 30) {
                    day = 1;
                    month++;
                } else {
                    System.out.println("输入错误");
                    return;
                }
                break;
            case 2:
                if (year % 4 == 0) {
                    if (1 <= day && day < 29) {
                        day++;
                    } else if (day == 29) {
                        day = 1;
                        month++;
                    }else {
                        System.out.println("输入错误");
                        return;
                    }
                } else {
                    if (1 <= day && day < 28) {
                        day++;
                    } else if (day == 28) {
                        day = 1;
                        month++;
                    }else {
                        System.out.println("输入错误");
                        return;
                    }
                }
                break;
            default:
                System.out.println("输入错误");
                return;

        }
        if (month>=13){
            year++;
            month=month-12;
        }
        System.out.println(year+"-"+month+"-"+day);
    }
}
