import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an expression with *, /, +, -, %, or ^:");
        String expression1 = scan.nextLine();
        if (expression1.contains("*")){
            String sign = "*";}
        if (expression1.contains("/")){
            String sign = "/";}
        if (expression1.contains("+")){
            String sign = "+";}
        if (expression1.contains("-")){
            String sign = "-";}
        if (expression1.contains("%")){
            String sign = "%";}
        if (expression1.contains("^")){
            String sign = "^";}
        double num1 = Double.parseDouble(expression1.substring(0,expression1.indexOf(" ")));
        double num2 = Double.parseDouble(expression1.substring(expression1.indexOf(" ") + 3));



    }
}
