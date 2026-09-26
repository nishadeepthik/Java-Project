package Daywise_class_notes;

public class Operators_Assignment
{
    public static void main(String[] args)
    {
        // TRICKY ASSIGNMENTS
        // Question 1
        int a = 10;
        int b = 3;
        int c;
        int v;
        c = (a / b); // 10/3 = 3.3333333
        v = (a % b); // 10%3 = 1.0
        System.out.println("Question 1 C:"+c);
        System.out.println("Question 1 V:"+v);

        //Question 2
        int x = 5;
        int y = x++; // 5+1=6
        int z = ++x; // 6+1
        System.out.println("Question 2 Y:"+y); // y=5
        System.out.println("Question 2 Z:"+z); // z=7

        //Question 3
        double m = 10;
        double n = 4;
        double d = (m / n); // 10/4=2.5
        System.out.println("Question 3 D:"+d);

        //Question 4
        float q = 99.99f;
        float t = q;
        System.out.println("Question 4 T:"+t);

        //Question 5
        int u = 10;
        int o = (u++ + ++u); //10+1=12
        System.out.println("Question 5 U:"+u);

        //Question 6
        int Score=87;
        String result=(Score >=35)? "Pass" : "Fail"; // 87>=35 ? "P" ; "F"
        System.out.println("Question 6 Result:"+result);

        //Question 7
        double basic=50000;
        double bonus=5000;
        double tax_to_pay=0.10;

        double gross=basic+bonus; // gross=50000+5000= 55000
        double tax= gross*tax_to_pay; // tax=55000*0.10= 5500
        double netsalary=gross-tax; // netsalary=55000-5500= 49500

        System.out.println("Question 7 Gross:" +gross);
        System.out.println("Question 7 Tax:" +tax);
        System.out.println("Question 7 NetSalary:" +netsalary);
    }
}

