package march;

/**
 * just little tips for maven
 */
public class D_200317 {
    public static void main(String[] args) {
        //清理    编译 测试 打包 安装 发布(需配置) mvn 每个命令都包含之前的默认生命周期
        //clean   compile test package install deploy
        //pom文件 组织 项目 版本
        //maven项目依赖原则 不同级最短路径原则 一级同级最后声明(读取覆盖) 其余同级的优先声明原则
        //解决冲突依赖 1.排除依赖 exclusions 2.dependencyManagement 统一版本管理/不同模块依赖不同的版本
        System.out.println("just little tips for maven");

        //demo4git  https://blog.csdn.net/m0_37725003/article/details/80904824?depth_1-utm_source=distribute.pc_relevant.none-task&utm_source=distribute.pc_relevant.none-task
    }
}
