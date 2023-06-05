package model;

public class assignments1 {
    public void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("giá trị của a là : " + a + " giá trị của b là :" + b);
    }

    public static String Rank(int math, int physics, int chemistry) {
        int result = (math + physics + chemistry) / 3;
        if (result >= 8) {
            return ("Bạn Rank A : " + result);
        } else if (result >= 6.5) {
            return ("Bạn Rank B : " + result);
        } else if (result < 5) {
            return ("Bạn Rank D : " + result);
        } else {
            return ("Bạn Rank C : " + result);
        }
    }

    public static double Find(double a, double b) {
        if (a == 0) {
            System.out.println("Phuong trinh vô nghiệm");
            return 0;
        } else if (a != 0 && b == 0) {
            return 0;
        } else {
            double x;
            x = -b / a;
            return x;
        }
    }
    public static void phuongtrinhbac2(int a, int b, int c){
       if(a>b & a > c){
           System.out.println("a là số lớn nhất");
       } else if (b>a & b > c) {
           System.out.println("b la s lớn nhất");
       } else if (c>a & c>b) {
           System.out.println("c la s lớn nhất");
       }else if (a == b &  b == c) {
            System.out.println("3 số bằng nhau");
        }
    }
}
