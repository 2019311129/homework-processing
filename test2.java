package experiment5;

import java.util.Scanner;
import java.io.*;

public class test2 {
    public static void main(String args[]) {
        student xuesheng = new student();
        System.out.println("输入姓名小高，性别男，年龄19，学号2019311129");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        String sex = s.nextLine();
        int age = s.nextInt();
        int number = s.nextInt();
        xuesheng.setGraduate(name, sex, age, number);

        try {
            FileReader fileReader = new FileReader("E:\\test.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Writer writer = new FileWriter(new File("E:\\作业分词.txt"));
            String str = bufferedReader.readLine();
            String regex = "(.{7})";
            str = str.replaceAll(regex, "$1，");
            StringBuffer x = new StringBuffer(str);
            for (int  i = 15; i <289; i = i + 17) {
                x.replace(i, i + 1, "。\n");
            }
            System.out.println(x);
            writer.write(String.valueOf(xuesheng));
            writer.write("\n");
            writer.write(String.valueOf(x));
            bufferedReader.close();
            fileReader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("出现错误!");
        }
    }
}
