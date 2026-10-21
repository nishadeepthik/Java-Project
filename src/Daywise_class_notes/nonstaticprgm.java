package Daywise_class_notes;

public class nonstaticprgm
{
    static String country = "India";
    String state = "Karnataka";

    static void main(String[] args)
    {
        System.out.println("Country:"+ country);
        nonstaticprgm obj = new nonstaticprgm();
        System.out.println("State:"+obj.state);
        marksscored score = new marksscored();
        System.out.println("Computer Science:" + score.computerscience);
        System.out.println("Mathematics:"+ score.math);
        System.out.println("Resuts:"+ score.s);
    }
}

class marksscored
{
    int computerscience= 89;
    int math= 91;
    String s = "Pass";

}



