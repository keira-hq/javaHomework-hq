import java.util.Date;
public class Homework903 {
    public static void main(String[] args)
    {
        long second = 10000;
        //使用循环，分别设置其流逝时间
        for(int i=0;i<8;i++)
        {
            //针对一个从格林威治时间流逝的以毫秒为单位计算的给定时间创建Date对像
            Date curr = new Date(second);
            //使用toString方法返回一个代表日期和时间的字符串表示
            System.out.println(curr.toString());
            //second每次扩大十倍
            second*=10;
        }
    }
}
