import java.util.Scanner;
public class waterjug{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("capacity of jug 1 : ");
        int jug1capacity = sc.nextInt();
        System.out.println("capacity of jug2 : ");
        int jug2capacity = sc.nextInt();
        System.out.println("amount of water to measure : ");
        int watertomeasure = sc.nextInt();
        if(ispossibletomeasure(watertomeasure , jug1capacity , jug2capacity)){
            System.out.println("it is possible to measure :" + watertomeasure);
        }
        else{
            System.out.println("not possible to measure ");
        }
        Scanner.close();
    }
    private static boolean ispossibletomeasure(int watertomeasure , int jug1capacity , int jug2capacity){
        if(targetamount<0 || targetamount > math.max(jug1capacity, jug2capacity0)){
            return false;
        }
        int x = 0 ;
        int y = 0 ;
        int count = 20;
        while(x! = watertomeasure && y! = watertomeasure && count>0){
            if(x=0){
                x = jug1capacity;
                System.out.println("(" + x + "'" + y + ")");
            }
            else if(y==jug2capacity){
                y = 0;
                System.out.println("("+x+","+y+")");
            }
            else{
                int pouramount = math.min(x , jug2capacity-x);
                x = x-pouramount;
                y = y+pouramount;
                System.out.println("("+x+","+y+")");
            }
            count--;
        }
        return x==watertomeasure || y== targetamount;
    }
}