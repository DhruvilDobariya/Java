import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class Second {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>(){
            {
                add("Dhruvil");
                add("Jenil");
                add("Monik");
            }
        };

        stack.push("Dhaval");
        //stack.pop();
        /* boolean flag = stack.contains("Dhaval");
        if(flag){
            System.out.println("Contain");
        }else{
            System.out.println("Not Contain");
        } */
        //Collections.sort(stack);
        //Collections.sort(stack, Collections.reverseOrder());
        //System.out.println(stack.indexOf("Dhruvil"));
        //stack.set(0, "Dhaval");
        //System.out.println(stack.get(0));
        stack.insertElementAt("ABCD", 0);
        //Collections.reverse(stack);

        for(String li : stack){
            System.out.println(li);
        }
    }
}
