package in.shivesh;

// https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

class KnapSack01 {

	//Bottom-Up + Tabulation
    public int knapsackBottomUp(int W, int val[], int wt[]) {

        int[][] dp = new int[wt.length+1][W+1];

        for(int pickedItemCount = 0; pickedItemCount<= wt.length;pickedItemCount++){
            // When the item count is 0, the maximum value we can get is 0
            // because essentially we can't pick any item
            dp[pickedItemCount][0] = 0;
        }

        for(int maxWeightWeCanCarry = 0; maxWeightWeCanCarry<= W;maxWeightWeCanCarry++){
            // When the max weight is 0, the maximum value we can get is 0
            // because essentially we can't pick any item
            dp[0][maxWeightWeCanCarry] = 0;
        }

        for(int curPickedItemCount=1; curPickedItemCount<= wt.length; curPickedItemCount++){

            // For each item, we will check if we can pick it or not
            // CurrentMaxWt is the maximum weight we can carry
            // We find for the given number of items (curPickedItemCount),
            // what is the maximum value we can get for the given weight (CurrentMaxWt)
            for(int currentMaxWt=1; currentMaxWt<= W; currentMaxWt++){

                // curPickedItemCount starts at 0 (no items picked),
                // The first item (val, wt index 0) is picked when curPickedItemCount is 1 i.e. we have picked 1 item
                // so we need to subtract 1 to get the index of the current item in the wt and val arrays
                // We check if the current item wt (wt[curPickedItemCount-1] ) is less than or equal to the currentMaxWt
                // If its more then we dont pick it
                if(wt[curPickedItemCount-1] <= currentMaxWt){

                    // we are calculating the max value we can get after picking curPickedItemCount items and max allowable weight of currentMaxWt
                    // i.e.  dp[curPickedItemCount][currentMaxWt]
                    // To do so, we have 2 options
                    // 1. Pick the current item (curPickedItemCount-1) and add its value to the max value we can get 
                    // from the remaining items (curPickedItemCount-1) and the remaining weight (currentMaxWt - wt[curPickedItemCount-1])
                    
                    // i.e. after say we picked the 7th item, we check the max value we got after we picked the 6th item yesterday
                    // Since after picking 7th item we only be left with the weight of (currentMaxWt - wt[curPickedItemCount-1]),
                    // we check the max value we got after picking 6th item with at max (currentMaxWt - wt[curPickedItemCount-1]) weight
                    // hence we look at row number = curPickedItemCount-1 (i.e. 6th item) and column number = currentMaxWt - wt[curPickedItemCount-1] (i.e. the remaining weight after picking 7th item)
                    // that gives us the max value we can get from the remaining 6 items when we can only pick upto the remaining weight 
                    
                    // 2. Don't pick the current item and take whatever value was there from the 
                    // previous item (curPickedItemCount-1) but the new weight (currentMaxWt)
                    // i.e. if 6 items got us ABC value with weight currentMaxWt,
                    // after 7 items also we can get at max ABC value with weight currentMaxWt as we didn't pick the 7th item
                    dp[curPickedItemCount][currentMaxWt] = Math.max(
                            val[curPickedItemCount-1] + dp[curPickedItemCount-1][currentMaxWt - wt[curPickedItemCount-1]],
                            dp[curPickedItemCount-1][currentMaxWt]
                    );
                }
                else{

                    // 2. Don't pick the current item and take whatever value was there from the 
                    // previous item (curPickedItemCount-1) but the new weight (currentMaxWt)
                    // i.e. if 6 items got us ABC value with weight currentMaxWt,
                    // after 7 items also we can get at max ABC value with weight currentMaxWt as we didn't pick the 7th item
                    dp[curPickedItemCount][currentMaxWt] = dp[curPickedItemCount-1][currentMaxWt];
                }

            }
        }

        return dp[wt.length][W];


    }









    int dp[][];
	// Top-Down + Memoization
	public int knapsackMemoization(int W, int val[], int wt[]) {
		int n = wt.length;
		dp = new int[n + 1][W + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= W; j++) {
				dp[i][j] = -1;
			}
		}
		
		return pick(0, val, wt, W);
	}
	
	int pick(int i, int val[], int wt[], int wLeft) {
		int n = wt.length;
		
		if (i >= n) {
			return 0;
		}
		if (wt[i] > wLeft) {
			return pick(i + 1, val, wt, wLeft);
		}
		if(dp[i][wLeft]!=-1){
		    return dp[i][wLeft];
		}
		
		int pick = val[i] + pick(i + 1, val, wt, wLeft - wt[i]);
		int pickNot = pick(i + 1, val, wt, wLeft);
		
		dp[i][wLeft] = Math.max(pick, pickNot);
		
		return dp[i][wLeft];
	}
	
}
