public class FriendsPairing{
    public static int friendsPairing(int n){

        if(n == 1 || n == 2){
            return n;
        }
        // choice 
        // single

        int fnm1 = friendsPairing(n-1);

        // pair

        int fnm2 = friendsPairing(n-2);
        int pairsWays = (n-1) * fnm2;

        // totalWays

        int totalWays = fnm1 + pairsWays;
        return totalWays; 

        // optimized code of line no 9 to 20 is line no 24.

        // return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
    }
    public static void main(String arg[]){
        System.out.println(friendsPairing(3));
    }
}