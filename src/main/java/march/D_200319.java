package march;

/**
 * john snow
 */
public class D_200319 {

    public static void main(String[] args) {
        //1.接口与抽象类 :
        //  同       都不能被实例化    都有抽象方法   继承抽象类或者实现接口都需要实现抽象方法
        //  异       抽象类可以有实现方法  1.8以后接口也可以有一个添加default关键字的实现方法   类是单继承类的可以实现多个接口
        //public private(本类) protected(当前包) byte 1 short 2 int 4 long 8 double 8 boolean 1 char 2 float 4

        System.out.printf("john snow");

        //异常体系  Throwable:1.error(编译时期的错误以及系统错误，程序本身无法处理 JVM) 2.exception(程序可以捕获处理)
        //error 内存不足 栈内存溢出 找不到类定义等  exception:1.IOException(FileNotFound等 编译器) 2.RuntimeException(空指针数组越界类找不到等 程序)

        //类加载过程

    }

}
