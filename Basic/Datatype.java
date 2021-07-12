public class Datatype {
    public static void main(String[] args){
        byte a = -128;
        byte b = -1;
        byte c = (byte)(a+b);                              //It is a cycle -128 to 127.
        System.out.println(c);                            // -128 is lowest value of byte so if we want -128-1, Then answer is 127.
    }
}
