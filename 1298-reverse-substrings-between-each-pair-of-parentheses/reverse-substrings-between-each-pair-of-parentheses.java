class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        
        // Iterate through each character in the string
        for (char ch : s.toCharArray()) {
            // If the character is a closing parenthesis
            if (ch == ')') {
                StringBuilder sb = new StringBuilder();
                
                // Pop characters from the stack until an opening parenthesis is found
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                
                // Pop the opening parenthesis from the stack
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
                
                // Push the reversed substring back onto the stack
                for (char reversedChar : sb.toString().toCharArray()) {
                    stack.push(reversedChar);
                }
            } else {
                // Push the current character onto the stack
                stack.push(ch);
            }
        }
        
        // Collect the characters from the stack to form the result string
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        
        // Reverse the result string to get the correct order
        return result.reverse().toString();
    }
}
