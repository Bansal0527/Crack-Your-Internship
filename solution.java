import java.util.*;
class solution{
                

public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int t = sc.nextInt();
    // while(t-->0) {
    //     int n = sc.nextInt();
    //     int cows = n/4;
    //     int hens = n%4;

    //     System.out.println(cows + hens);
    // }
    // System.out.println(7%8);
    int arr[] = {22, 16, 36, 18, 4, 21, 28 ,2 ,7, 35, 9 ,15, 5, 23 ,10 ,20};
    Arrays.sort(arr);
    for(int i=0; i<arr.length; i++) {
        System.out.print(arr[i] + " ");;
    }
}
             
}