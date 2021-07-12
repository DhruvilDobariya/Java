public class IfElse{
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if(a>b){
            System.out.println(a+" is greter then "+b);
        }else if(a==b){
            System.out.println(a+" and "+b+" is equal value.");
        }else{
            System.out.println(b+" is greter then "+a);
        }
    }
}