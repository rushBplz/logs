package march;

/**
 * classLoader
 */
public class D_200320 {

    public static void main(String[] args) {
        //类加载过程 JVM把class文件加载到内存，并对数据进行校验、准备、解析、初始化，最终形成JVM可以直接使用的Java类型的过程。
        //1.加载 将class字节码文件加载到内存中
        //2.链接 将Java类的二进制代码合并到JVM的运行状态之中 (验证+规范 准备+分配内存 解析+替换为地址引用)
        //3.初始化阶段

        //java类初始化顺序
        //        1、父类的静态变量
        //        2、父类的静态代码块
        //        3、子类的静态变量
        //        4、子类的静态代码块
        //        5、父类的非静态变量
        //        6、父类的非静态代码块
        //        7、父类的构造方法
        //        8、子类的非静态变量
        //        9、子类的非静态代码块
        //        10、子类的构造方法

        System.out.printf(" classLoader ");

        //demo4classLoad https://www.jianshu.com/p/dd39654231e0
    }


}
