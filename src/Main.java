import model.assignments1;
import model.Person;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Student;

public class Main {
    public static void main(String[] args) {
         int a;
        //int b;
        //int c;
        //int math;
        // int physics;
        //int chemistry;
        //System.out.println("Hello world!");

        //   Scanner input = new Scanner(System.in);

        //  System.out.println("nhập giá trị a");
        //   a = input.nextInt();

        // System.out.println("nhập giá trị b");
        //  b = input.nextInt();

        //  System.out.println("nhập giá trị c");
        //  c = input.nextInt();
        // Câu 1
        // assignments1 ketqua = new assignments1();
        //ketqua.swap(a, b);

        // System.out.println("nhập điểm toán");
        // math = input.nextInt();

        // System.out.println("nhập điểm lý");
        // physics = input.nextInt();

        //System.out.println("nhập điểm hóa");
        // chemistry = input.nextInt();
        // Câu 2
        // System.out.println(assignments1.Rank(math, physics, chemistry));
        // Câu 3
        // System.out.println(" Với biểu thức Ax + B = 0 . Và 2 giá trị nhập ban đầu là: a = " + a + " và b là : " + b);
        // System.out.println("Giá trị của X là " + assignments1.Find(a, b));
        // Câu 4
        // assignments1.phuongtrinhbac2(a,b,c);
        //  Person pe = new Person();
        //  pe.setEmpID("1001");
        // pe.setName("Do Phu Quy");
        //   pe.setAddress("Quảng Nam");
        //  pe.setDateOfBirth("20/11/1990");
        //  System.out.println("name : " + pe.getName() + ",Address : " + pe.getAddress() + ",Date Of Birth Day :" + pe.getDateOfBirth());
        String id;
        String name;
        int age;
        String course;
        String address;
        String school;
        float toan;
        float ly;
        int check;
        int thutu = 0;
        System.out.println("Nhập tên sinh viên");
        Scanner sinhvien = new Scanner(System.in);
        name = sinhvien.nextLine();
        System.out.println("Nhập điểm toán sinh viên");
        toan = sinhvien.nextFloat();
        System.out.println("Nhập điểm lý sinh viên");
        ly = sinhvien.nextFloat();
        Student sv1 = new Student();
        sv1.setName(name);
        System.out.println("Tên của sinh viên 1 là : " + sv1.getName());
        sv1.tinhdiem(toan, ly);
        System.out.println("Bạn Có Muốn Lưu Sinh Viên Này Không. Nhấn 1 nếu muốn lưu - Nhấn 2 nếu không");
        check = sinhvien.nextInt();
        List<String> list = new ArrayList<String>();
        while (check==1){
            list.add(name + thutu);
            thutu++;
            for (String danhsachsinhvien : list)
                System.out.println(danhsachsinhvien);
            System.out.println("Bấm 1 nếu tiếp tục và 2 muốn dừng lại");
            check = sinhvien.nextInt();


        }
    }
}