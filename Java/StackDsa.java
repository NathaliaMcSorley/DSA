import java.util.Stack;

public class StackDsa {
	
	public static void main(String[] args) {
		
		//Stack followed by the data type that we are adding to the stack and stack name
		//The right side is the Stack constructor
		Stack<String> stack = new Stack<String>();
		
		//Check if stack is empty
		System.out.print("Is stack empty? ");
		System.out.println(stack.empty());
		System.out.print("Print Stack: ");
		System.out.println(stack);
		
		//Add items to the stack
		stack.push("Java");
		stack.push("Python");
		stack.push("C#");
		stack.push("SQL");
		stack.push("HTML");
		
		System.out.print("\nIs stack empty? ");
		System.out.println(stack.empty());
	
		System.out.print("Print Stack: ");
		System.out.println(stack);

		//Remove last item from the stack
		stack.pop();
		System.out.print("\nPrint Stack after pop: ");
		System.out.println(stack);
		
		//Store last item in a variable. Item will be removed from the stack
		String last = stack.pop();
		System.out.print("\nLast item of the stack: ");
		System.out.println(last);

		//Peak does not remove the last item, just let's us see it
		System.out.print("\nPeek the last item: ");
		System.out.println(stack.peek());	
		
		System.out.print("\nPrint Stack: ");
		System.out.println(stack);
		System.out.print("Location of Java from the top of the stack: ");
		System.out.println(stack.search("Java"));	
		//If search does not find the object, then it will return -1
	}
}