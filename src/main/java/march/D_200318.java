package march;

/**
 * git Xshell
 */
public class D_200318 {
    public static void main(String[] args) {
        //git 常见命令 add commit push pull reset log merge stash stash pop
        // checkout(切换分支/本地仓同步到工作区 --xxx)  fetch(远程仓同步到本地仓)
        //工作区 add  暂存区  commit 本地仓库 push 远程仓库
        //1.已经add想取消继续修改 reset HEAD xxx
        //2.已经commit想要取消继续修改 reset preCommitId 或者不想要了直接同步远程仓fetch --all  reset --hard origin/分支
        //3.git常见冲突 好习惯先pull 有冲突 1.stash把工作区修改放到暂存区 2.pull拉去远程仓 3.stash pop将暂存区拿出解决冲突然后正常步骤
        //    良好的分支管理 dev dev_1 dev_2 一般情况1.切到dev pull 2.merge dev_x 解决提交
        //       严格情况(不允许直接到公用分支提交)1.切到dev pull 2.切到 dev_x merge dev 解决提交 3.切到dev merge dev_x
        System.out.printf("git.png");
        //Xshell 查看日志常用 cd ~(主目录) cd xxx(进入该目录) cd ../..(上2级) cd ..(上级) ls(当前文件夹下子文件)
        // tail -fn 100(解压并查看最后100行) rm之类(删除文件)
        System.out.printf("xshell4log");

    }
}
