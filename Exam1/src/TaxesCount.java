/**
 * Created by dx on 2018/8/4.
 */
public class TaxesCount {

    public static Double Taxes(Double income) {
        if (income <= 1500) {
            return income * 0.03;
        } else if (income < 4500) {
            return (income - 1500) * 0.1+45;
        } else if (income < 9000) {
            return (income - 4500) * 0.2+345;
        } else if (income < 35000) {
            return (income - 9000) * 0.25+1245;
        } else if (income < 55000) {
            return (income - 35000) * 0.3+7745;
        } else if (income < 80000) {
            return (income - 55000) * 0.35+13745;
        } else {
            return (income - 80000) * 0.45+22495;
        }
    }

}
