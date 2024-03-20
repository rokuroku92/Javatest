import java.util.Scanner;
import java.util.Stack;

public class UVa727D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        if (cases > 0) {
            scanner.nextLine(); // consume newline
            scanner.nextLine();
            for (int i = 0; i < cases; i++) {
                Stack<Character> stack = new Stack<>();
                int basePriority = 0;
                StringBuilder output = new StringBuilder();

                String line;
                while (scanner.hasNextLine() && !(line = scanner.nextLine()).isEmpty()) {
                    char ch = line.charAt(0);
                    if (ch >= '0' && ch <= '9')
                        output.append(ch);
                    else if (ch == '(' || ch == ')')
                        basePriority += 2 * (ch == '(' ? 1 : -1);
                    else {
                        int thisPriority = basePriority + (ch == '+' || ch == '-' ? 0 : 1);
                        while (!stack.isEmpty() && precedence(stack.peek()) >= thisPriority)
                            output.append(stack.pop());
                        stack.push(ch);
                    }
                }

                while (!stack.isEmpty())
                    output.append(stack.pop());

                System.out.println(output.toString());
                if (i < cases - 1)
                    System.out.println();
            }
        }
    }

    private static int precedence(char op) {
        switch(op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }
}
