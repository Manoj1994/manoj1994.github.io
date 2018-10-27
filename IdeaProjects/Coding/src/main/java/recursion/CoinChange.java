package recursion;

public class CoinChange {

    public int getChange(int n, int m, int[] change) {

        if(n==0) {
            return 1;
        }

        if(n < 0) {
            return 0;
        }

        if(m <= 0) {
            return 0;
        }

        return getChange(n-change[m-1], m, change) + getChange(n, m-1, change);
    }


    public int getChangeDp(int n, int[] change) {

        int coins[] = new int[n+1];
        coins[0]  = 1;

        for(int i=0;i<change.length;i++) {
            for(int j=change[i];j<=n;j++) {
                coins[j] = coins[ j -change[i]];
            }
        }
        return coins[n];
    }



    public static void main(String[] args) {

        int n = 25;
        int changeArr[] = {1, 5, 25, 100};
        CoinChange change = new CoinChange();
        System.out.println(change.getChange(n, changeArr.length, changeArr));
        System.out.println(change.getChangeDp(n, changeArr));

    }
}
