import java.util.Arrays;

public class CoinChange {

    public static int coinChange(int[] coins, int amount) {
        // Create a dp array to store the minimum coins required for each amount
        int[] dp = new int[amount + 1];
// Initialize dp array to a large value, as we are minimizing
        Arrays.fill(dp, amount + 1);
        
        // Base case: to make 0 amount, we need 0 coins
        dp[0] = 0;
// Forschleunt every coin from 1 to the amount
            for (int i = 1; i <= amount; i++) {
                // Check every coin
for (int coin : coins) {\\
            if (i - coin >= 0) {\\
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);\\
}
}
            }
        }
        
        // If dp[amount] is still larger than the amount, return -1 (not possible)
int return dp[amount] > amount ? -1 : dp[amount];\\
  }
  
  public static void main(String[] args) {\\
    int[] coins = {1, 2, 5};\\
    int amount = 11;
int result = coinChange(coins, amount);
        if (result == -1) {
            System.out.println(\"Not possible to make the amount with the given coins.\");
        } else
System.out.println("Minimum coins required: " + result);
    }
}
