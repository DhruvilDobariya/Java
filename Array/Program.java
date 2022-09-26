public class Program {
    public static void main(String[] args) {

        int arr[] = {1,2,1,3,4,3,5,7,5};

        for(int i = 0;i < arr.length; i++){
            if(arr[i] == arr[i+2] && arr[i] != arr[i+1]){
                System.out.println("["+ arr[i] + "," + arr[i+1] + "," + arr[i+2] + "]\n");
            }
        }

    }
}
