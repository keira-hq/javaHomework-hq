import java.util.ArrayList;

public class Homework1303 {
    public static void main(String[] args) {
        //测试用例
        //创建sort对象
        Sort test = new Sort();
        test.list.add(23);
        test.list.add(9999);
        test.list.add(10.666);
        test.list.add(98);
        test.list.add(29);
        test.list.add(111);
        test.list.add(912.2);
        test.list.add(5);
        Sort.sort(test.list);
        //遍历排序后的数组，依次输出各元素
        for (Number m: test.list) {
            System.out.println(m);
        }
    }
}





class Sort {
    ArrayList<Number> list = new ArrayList<>();
    //对ArrayList里保存的数字进行排序
    public static void sort(ArrayList<Number> list) {
        if (list.size() == 0)
            return ;
        //冒泡排序
        for (int i = list.size()-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                //依次比较两个相邻的元素，如果顺序错误，则通过中间变量m实现换位
                //使用get()访问索引为j的元素   比较相邻元素的数值大小
                if (list.get(j).doubleValue() > list.get(j+1).doubleValue()) {
                    Number m = list.get(j);
                    //按照索引值修改元素
                    list.set(j, list.get(j+1));
                    list.set(j+1, m);
                }
            }
        }
    }
}
