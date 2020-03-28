# JDK Source Code Project
JDK-source-code is an exercise project for Fsss to learn JDK source code.

### IDEA 设置
#### 导入源码
1. 复制JDK安装目录下的 src.zip 内的文件到 com.fsss.study.source 包下。
2. IDEA 设置 Build,Execution,Deployment->Compiler->Build process heap size(Mbytes): 字段，增大build内存。
3. 在 com.fsss.study.demo 下随便建一个 main 方法，然后编译；如果 source 下有找不到的类，删除就好了。

#### debug jdk 源码
1. 取消勾选 IDEA 的 Build,Execution,Deployment->Debugger->stepping->Do not step into the classes，运行debug时能进入到JDK的类源码中。
2. 默认源码指向的是src.zip，是不可写的，也就是说我们在读源码时不能写上自己的理解。移除 IDEA 中 Project Structure->SDKs->Sourcepath 中的 src.zip 的路径，然后加上我们项目中的 com.fsss.study.source 的目录，这样就可以编辑源码文件了。
3. 需要注意的是，这里只是改了源码的路径，真正使用的 class 文件并不是由这些代码重新编译的 class，所以对源码的编辑是无效的。

### 参考资料
CodeSheep：https://www.bilibili.com/video/BV1V7411U78L