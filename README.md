# java experiment
 homework-processing
 

## 一.实验目的
 <br>掌握字符串String及其方法的使用<br>
 <br>掌握文件的读取/写入方法<br>
 <br>掌握异常处理结构<br>


### 基本要求
+ 每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
* 允许提供输入参数，统计古诗中某个字或词出现的次数
- 输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A
+ 考虑操作中可能出现的异常，在程序中设计异常处理程序


### 附加要求
<br>1. 设计学生类（可利用之前的）<br>
<br>2. 采用交互式方式实例化某学生<br>
<br>3. 设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。
<br>


## 二.实验过程
1.首先定义三个Java类文件student，text，text2，
2.在text2类文件中录入学生信息姓名性别学号等，导入文件读取文件写入文件，对可能出现的异常，在程序中设计异常处理程序
3.text文件中做分词处理，每14个字符做循环，前七个字末尾加，后七个字末尾加。
4.student文件中对学生信息做处理，student类定义 number，sex，name。




## 三.核心代码
<br>分词处理<br>
               int i=1;
		char[] char_chg=chg.toCharArray();
		for(char hz:char_chg){
		System.out.print(hz);
		if (i%7==0&&i%14!=0)
		System.out.println(",");
	        if (i%14==0)
		System.out.println(".");
  
 <br>录入文件<br>

            FileReader fileReader = new FileReader("E:\\test.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Writer writer = new FileWriter(new File("E:\\作业分词.txt"));
            String str = bufferedReader.readLine();
            writer.write(String.valueOf(xuesheng));
            writer.write("\n");
            bufferedReader.close();
            fileReader.close();
            writer.close();

<br>异常处理<br>

catch (IOException e) {
e.printStackTrace();
}
catch (Exception e) {
System.out.println("出现错误!");


## 四.实验结果
## 五.实验感想
- 1.异常机制可以使程序中的异常处理代码和正常业务代码分离，提高程序的健壮性。Java 的异常机制主要依赖try、catch、finally、throw 和 throws 五个关键字，其中 try 关键字后紧跟一个花括号
+ 2.Java IO中用于读写文件的四个抽象类：Reader，Writer，InputStream，OutputStream
    根据流所处理的数据类型分为两类：
<br>（1）字节流：用于处理字节数据。<br>
<br>（2）字符流：用于处理字符数据，Unicode字符数据。<br>
 * 3.InputStreamReader 是字节流通向字符流的桥梁，OutputStreamWriter是字符流通向字节流的桥梁。
+ 4.通过四次实验的学习对Java有了更深的理解和体会，同时写Java的能力有所提高，在学习课本上知识点的同时还要通过高级搜索引擎对知识点进行更透彻的学习。


