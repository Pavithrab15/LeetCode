class Solution {
    int[] fib = new int[31];

    public void function(){
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2;i<31;i++)
            fib[i] = fib[i-1]+fib[i-2];
    }


    public int fib(int n) {
        function();
       return fib[n];
    }
}