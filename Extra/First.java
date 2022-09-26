class First{
    public static void main(String args[]){
        System.out.println("Hello World");
        Boy b = new Boy();
        System.out.println(b.lag);
        b.lag = 4;
        System.out.println(b.lag);
        b.display();
        /* int a = b.display2();
        System.out.println(a);
        int y = b.display3(6);
        System.out.println(y); */

        int a2 = b.display3(b.display2()-2);
        System.out.println(a2);
    }

}

class Boy{
    int lag = 2;
    public void display(){
        System.out.println("display method");
    }
    public int display2(){
        System.out.println("display2 method");
        return 5;
    }
    public int display3(int x){
        //System.out.println(x*x);
        return x*x;
    }
}