# java4
# 物联网191杜雨卿

## 实验目的

1.掌握字符串String及其方法的使用

2.掌握文件的读取/写入方法

3.掌握异常处理结构

## 实验要求

1.设计学生类（可利用之前的）；

2.采用交互式方式实例化某学生；

3.设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。

## 实验过程

1.首先用import导入io包和scanner.

2.创建主类experiment类，使用Scanner类实现运行时交互式输入，输入要查询的字符。

3.对输出学生信息进行编写

4.创建Student类，使用setName，setAge等将参数值赋值给学生信息Name，Age等。

5.使用getName()，getAge()等返回Name,age等的值.

6.创建Homework类，编写循环程序。

7.创建Handle类，使用File类创建文本文件A和文本文件B，异常处理。

## 核心代码

```
class Homework{
    public static StringBuffer HW(StringBuffer str1){
        StringBuffer str2 = new StringBuffer(str1);
        int j=0;int z;
        for(int i = 7;i < str2.length()-45;i= i+7){
            z = i +j;
            if(i%2 == 0){
                str2.insert(z,"。\n");
                j = j+2;
            }
            else{
                str2.insert(z,"，");
                j= j+1;
            }
        }
        System.out.println(str2);
        return str2;
    }
```
```
public static int getCharMaps(String z,StringBuffer s) {
        boolean p;
        int w = 0;
        String a = s.toString();
        char[] b = a.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            String x = String.valueOf(b[i]);
            p = z.equals(x);
            if(p == true){
                w = w + 1;
            }

        }
        return w;
    }
```

## 运行结果

请输入要查询的字符：

三

学生信息

学生姓名:杜雨卿

学生年龄:19

学生编号:2019310861

学生性别:男

作业处理成功！

三出现的次数为：三次

## 实验感想

本次实验大量运用字符串String，使我对字符串String的使用方法更加熟练，包括获取字符串长度length()，获取字符串中的第i个字符charAt(i)，获取指定位置的字符方法getChars(4个参数)，并且基本掌握了文件的读取与写入，file类输入输出流，更掌握了使用scanner进行交互式实例化，以及异常处理。
