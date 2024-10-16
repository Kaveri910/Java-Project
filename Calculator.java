 import java.util.Scanner;
class Calculator
{
  public static void main(String [] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num1 : ");
    double num1 = sc.nextDouble();
   System.out.print("Enter num2 : ");
    double num2 = sc.nextDouble();
   System.out.print("Enter an operator : ");
    char operator = sc.next().charAt(0);

  boolean flag = true;
  double output = 0;
if(operator=='+'){
   output = num1+num2;
}
else if(operator=='-'){
   output = num1-num2;
}
else if(operator=='*'){
   output = num1*num2;
}
else if(operator=='/'){
   output = num1/num2;
}
else if(operator=='%'){
   output = num1%num2;
}
else {
 flag = false;
 System.out.println("wrong Operator Entered");
}
if(flag)
{
 System.out.println("Output : "+num1+""+operator+""+num2+"="+output);
}
}
}





