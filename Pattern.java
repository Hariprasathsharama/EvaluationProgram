import java.util.Scanner;

public class Pattern {
    public  void drawPattern(String pattern,int row){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row*2; j++) {
            }
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String");
        String pattern=input.next();
        System.out.println("Enter the row");
        int row=input.nextInt();
        new Pattern().drawPattern(pattern,row);

    }
}
