public class Homework707{
    public static void main(String[] args) {
        //声明 创建 赋值数组变量保存各个数字出现的次数
        int[] numbers = new int[10];

        for (int i = 0; i < 100; ++i) {
            ++numbers[ (int) (Math.random() * 10)];
        }

        for (int i = 0; i < 10; ++i) {
            System.out.println(i + ":" + numbers[i]);
        }
    }
}

