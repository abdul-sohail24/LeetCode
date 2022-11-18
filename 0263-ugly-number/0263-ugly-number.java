class Solution 
{
    public boolean isUgly(int n) 
    {
        if(n == 1)
            return true;
        if(n <= 0)
            return false;
        if(n == 2 || n == 3 || n == 5)
            return true;
        List<Integer> factors = new ArrayList<>();
        List<Integer> check = new ArrayList<>();
        check.add(2);
        check.add(3);
        check.add(5);
        if(isPrime(n) && !factors.contains(n))
            return false;
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i == 0)
            {
                factors.add(i);
                factors.add(n/i);
            }
        }
        int flip = 0;
        for(int i=0; i<factors.size(); i++)
        {
            int num = factors.get(i);
            if(!check.contains(num) && isPrime(num))
            {
                flip = 1;
                break;
            }
        }
        if(flip == 1)
            return false;
        else
            return true;
    }
    
    public boolean isPrime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}