package java4;
import java.io.*;
import java.util.Scanner;
public class Experiment {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int w;
        StringBuffer str2 = null;
        Handle dyqs = new Handle();
        StringBuffer str1 = dyqs.Read();
        Homework one = new Homework();
        str2 = one.HW(str1);
        Handle.Write(str2);

        System.out.println("������Ҫ��ѯ���ַ���");
        String z = input.next();
        w = dyqs.getCharMaps(z,str1);

        System.out.println("ѧ����Ϣ");
        Student dyq = new Student();
        dyq.setName("������");
        dyq.setAge(19);
        dyq.setNumber(2019310861);
        dyq.setSex("��");
        System.out.println("ѧ������:" + dyq.getName());
        System.out.println("ѧ������:" + dyq.getAge());
        System.out.println("ѧ�����:" + dyq.getNumber());
        System.out.println("ѧ���Ա�:" + dyq.getSex());

        System.out.println("��ҵ����ɹ���");
        System.out.println(z + "���ֵĴ���Ϊ��"+ z + "��");
    }
}


class Student{
    public Student(){

    }
    public Student(String name,int age,int number,String sex){
        this.name = name;
        this.age = age;
        this.number = number;
        this.sex = sex;
    }

    private String name;
    private int age;
    private int number;
    private String sex;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSex() {
        return sex;
    }
    public int getNumber() {
        return number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

}

class Homework{
    public static StringBuffer HW(StringBuffer str1){
        StringBuffer str2 = new StringBuffer(str1);
        int j=0;int z;
        for(int i = 7;i < str2.length()-45;i= i+7){
            z = i +j;
            if(i%2 == 0){
                str2.insert(z,"��\n");
                j = j+2;
            }
            else{
                str2.insert(z,"��");
                j= j+1;
            }
        }
        System.out.println(str2);
        return str2;
    }

}

class Handle{
    public static StringBuffer Read(){
        String str1 = "";
        StringBuffer str2 = new StringBuffer(str1);
        try {
            File file = new File("C:/Users/14739/Desktop/DYQ/B.txt");
            FileReader fr = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fr);
            while ((str1 =bReader.readLine()) != null) {
                str2.append(str1);
            }
            fr.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
        return  str2;
    }

    public static void Write(StringBuffer s){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/14739/Desktop/DYQ/A.txt"));
            bw.write(s.toString());
            bw.close();
        }catch (IOException e){
        }
    }

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
}

