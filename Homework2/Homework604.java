import java.util.Scanner;
public class Homework604 {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要反转的整数:");
        int number = input.nextInt();
        reverse(number);
        System.out.println(number +"反转后为："+ reverse(number));
        input.close();

    }


    public static int reverse(int number){
        int digit;//记录最后一个数
        int ret =0;//记录反转之后的数字
        while(number>0){
            digit = number%10;//从个位开始依次得到每位上的数字
            ret = ret*10+digit;//依次进位
            number/=10;//原数字依次退位，丢掉一位最右边的数
        }
        return ret;
    }


}
