public class _1672 {
    public static void main(String[] args) {
        int accounts[][] = {{2,8,7}, {7,1,3},{1,9,5}};
        int output = maximumWealth(accounts);
        System.out.println(output);
    }

    public static int maximumWealth(int[][] accounts) {
        int res = 0;

        for (int i = 0; i < accounts.length; i++) {
            int count = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                count += accounts[i][j];
            }
            res = Math.max(res, count);

        }
        return res;

    }
}
