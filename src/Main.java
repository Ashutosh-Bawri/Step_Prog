import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.print("Enter first number: ");
      double a = sc.nextDouble();

      System.out.print("Enter operator (+ - * / % ^) or q to quit: ");
      String input = sc.next();
      if (input.equalsIgnoreCase("q")) break;
      char op = input.charAt(0);

      System.out.print("Enter second number: ");
      double b = sc.nextDouble();

      double result;

      switch (op) {
        case '+': result = a + b; break;
        case '-': result = a - b; break;
        case '*': result = a * b; break;
        case '/':
          if (b == 0) {
            System.out.println("Cannot divide by zero");
            continue;
          }
          result = a / b;
          break;
        case '%': result = a % b; break;
        case '^': result = Math.pow(a, b); break;
        default:
          System.out.println("Invalid operator");
          continue;
      }

      System.out.println("Result: " + result);
      System.out.println();
    }
    sc.close();
  }
}
