package in.hoptec;

public class MatrixChainMultiplication {

    static int MatrixChainOrder(int p[], int n)
    {
        /* For simplicity of the program, one extra row and one
        extra column are allocated in m[][].  0th row and 0th
        column of m[][] are not used */
        int m[][] = new int[n][n];
        brackets = new int[n][n];
        int i, j, k, L, q;
        /* m[i,j] = Minimum number of scalar multiplications needed
        to compute the matrix A[i]A[i+1]...A[j] = A[i..j] where
        dimension of A[i] is p[i-1] x p[i] */
        // cost is zero when multiplying one matrix.
        for (i = 1; i < n; i++)
            m[i][i] = 0;
        // L is chain length.
        for (L=2; L<n; L++)
        {
            for (i=1; i<n-L+1; i++)
            {
                j = i+L-1;
                if(j == n) continue;
                m[i][j] = Integer.MAX_VALUE;
                for (k=i; k<=j-1; k++)
                {
                    q = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];
                    if (q < m[i][j])
                    {
                        m[i][j] = q;
                        brackets[i][j]  = k;
                    }
                }
            }
        }
        for(i =1;i<m.length;i++)
        {
            for(j =1;j<m.length;j++)
                System.out.printf(m[i][j] == 0 ?"  "+m[i][j]:" "+m[i][j]);
            System.out.printf("\n");
        }

        return m[1][n-1];
    }


    static int brackets [][];

    static String printOptimalParens(int i, int j) {
        if (i == j)      return "A[" + i + "]";    else
            return "(" + printOptimalParens(i, brackets[i][j])
                    + printOptimalParens(brackets[i][j] + 1 , j)
                    + ")"; }


    public static void main(String[] args) {

        int p[] = {2,6,4,2,3};

        System.out.println("Cost : "+MatrixChainOrder(p,p.length));;
        System.out.println("Sequence : "+printOptimalParens(1,p.length-1));


    }



}
