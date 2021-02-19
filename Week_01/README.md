```
学习笔记
· JVM 基础知识
   - 高级语言特性回顾->
     特性1.面向过程、面向对象、面向函数
     特性2.静态类型、动态类型
     特性3.编译执行、解释执行
     特性4.有虚拟机、无虚拟机
     特性5.有 GC 、无 GC 
     - Java 语言特性：面向对象、静态类型、编译执行、有 VM/GC 和运行时、跨平台。
       - 跨平台编码运行流程
       	C++: 编写出 .cpp 文件后，在 Window 环境中编译成 .exe 程序，然后运行。
       	Java：编写出 .java 文件后，编译成 .class 字节码文件，然后分发到 Window 、Linux 环境中运行。
       	C++ 是源代码跨平台， Java 是二进制跨平台。
       	![img.png](img.png)
       - 字节码、类加载器、虚拟机
        生成字节码文件后，类加载器会将其中的类加载到虚拟机中，然后初始化之后就有了类的对象实例。
        ![img_1.png](img_1.png)
        字节码文件由源代码编译成。
        ？JVM 虚拟机中占用的内存也就是对象是怎么被管理的。
    
· JVM 字节码技术
     - 字节码相关知识
        ![img_2.png](img_2.png)
        例子1，编译一个类
            ![img_3.png](img_3.png)
            ![img_4.png](img_4.png)
                load 压栈
                store 从栈写到本地变量
        例子2，编译一个更复杂的类
            ![img_5.png](img_5.png)
        - 字节码运行时
            ![img_6.png](img_6.png)
        - ？助记符在8个字节中是怎样表示的
            ![img_7.png](img_7.png)
        例子3，编译一个四则运算的类
            ![img_8.png](img_8.png)
            编译后
            ![img_9.png](img_9.png)
            ![img_10.png](img_10.png)
            ![img_11.png](img_11.png)
            操作数对照表
            ![img_12.png](img_12.png)
            左边是各类型的操作符，右边是类型转换
            *JVM 中最小的操作符类型是 int，当遇到比 int 小的类型时如 byte char bool 直接当int使用
        例子4，编译一个for循环的类
            ![img_13.png](img_13.png)
            编译后
            ![img_14.png](img_14.png)
            ![img_15.png](img_15.png)
            ![img_16.png](img_16.png)
     - 方法调用指令
        ![img_17.png](img_17.png)
     - 一个动态调用的例子
        ![img_18.png](img_18.png)
· JVM 类加载器
    
· JVM 内存模型
· JVM 启动参数
· 第一小节回顾

javac Hello.java -encoding utf-8 
```

