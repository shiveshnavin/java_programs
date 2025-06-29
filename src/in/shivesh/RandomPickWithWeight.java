package in.shivesh;

import java.util.Arrays;

class RandomPickWithWeight {
    int [] w;
    Double [][] p;
    public RandomPickWithWeight(int[] w) {
        this.w = w;
        this.p = new Double[w.length][2];
        int total = 0;
        for(int i = 0 ; i<w.length;i++){
            total += w[i];
        }
        Double last = 0d;
        for(int i = 0 ; i<w.length;i++){
            p[i][0] = last;
            last = last + w[i]/(double)total;
            p[i][1] = last;
        }
    }

    public int pickIndex() {
        double r = Math.random();
        System.out.println(Arrays.deepToString(this.p));
        for(int i = 0 ; i<p.length;i++){
            if(r>=p[i][0] && r<=p[i][1]){
                return i;
            }
        }
        return -1;
    }

    // [2,5,3]
    // [0.2,0.5,0.3]
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */