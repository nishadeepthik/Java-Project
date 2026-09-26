package Daywise_class_notes;

public class StudentResult_MiniProject
{
    public static void main(String[] args)
    {
        int marks = 78;
        boolean attendanceOK = true;
        String result = (marks >= 40 && attendanceOK)
                ? "PASS" : "FAIL";
        System.out.println("Marks: " + marks);
        System.out.println("Result: " + result);
    }
}
