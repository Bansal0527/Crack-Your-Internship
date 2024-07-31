import java.util.*;
class solution{
                

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0) {
        int n = sc.nextInt();
        int cows = n/4;
        int hens = n%4;

        System.out.println(cows + hens);
    }
}
             
}