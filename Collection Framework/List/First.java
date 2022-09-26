import java.util.ArrayList;

public class First{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Dhruvil");
        list.add("Dhaval");

        list.add(1, "Dhruv");

        list.addAll(new ArrayList<String>(){ 
            {
                add("Jenil");
                add("Monik");
            }
         });

         
         list.addAll(4,new ArrayList<String>(){
             {
                 add("Jash");
                 add("Yash");
             }
            });

        System.out.println("Start \n");
        for(String li : list){
            System.out.println(li);
        }
        System.out.println("\nEnd");
    }
}