package data01;

/**
 * 算法中的有穷性
 */
/**
 * 1.计算 = 信息处理
 * 借助某种工具，遵照一定的规则，以明确而机械的形式进行
 * 2.计算机模型 = 计算机 = 信息处理工具
 * 3.所谓的算法，即特定计算模型下，旨在解决特定问题的指令系列
 * 输入  待处理的信息 （问题）
 * 输出  经处理的信息 （答案）
 * 正确性   的确可以解决指定的问题
 * 确定性   任何算法都可以描述为一个由基本操作组成的序列（有明确性的意思就是：语义明确的）
 * 可行性   每一步基本的操作都必须是实现的，且在常数时间内完成
 * 有穷性   有意义的算法必须是有穷性的，（意思：在有限的步骤终止）
 *
 *
 * 在写的算法中比较重要的是   可读性：（结构清晰 + 见名知意的命名规范 + 准确的注释 + 文档）
 * 重要的是   效率（效率更快 + 存储空间更少）
 * 大 O 记号 ：
 * 注意：这里更关心足够大的问题，注重考察成本的增长趋势
 * 常系数可以忽略
 * 低次项可以忽略
 * 大 O（big-Oh） 表示法是算法中最糟糕的情况
 * 大 Ω（big-Omega）表示法是算法中最理想的情况
 * 大 θ（big-theta）是表示准确的确界
 * 大部分使用的是（big-Oh）只有在极少的情况下使用（big-Omega）（big-theta）
 * 对数（O（log n））
 */


import java.util.ArrayList;

public class Finiteness {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(59);
        fin(list);
        System.out.println(list);
        System.out.println(list.size());
    }

    private static void fin(ArrayList<Integer> list) {
        int n = list.get(list.size() - 1);
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
                list.add(n);
            } else if (n % 2 != 0) {
                n = n * 3 + 1;
                list.add(n);
            }
        }

    }
}