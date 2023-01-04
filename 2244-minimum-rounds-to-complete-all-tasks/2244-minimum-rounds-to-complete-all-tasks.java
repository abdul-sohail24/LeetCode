class Solution 
{
    public int minimumRounds(int[] tasks) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0, k=0;

        for(int i=0; i<tasks.length; i++)
            map.put(tasks[i], map.getOrDefault(tasks[i],0)+1);

        int[] arr = new int[map.size()];
        for(int i:map.values())
            arr[k++] = i;

        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++)
        {
            while(arr[i] > 0)
            {
                if(arr[i] == 1)
                    return -1;
                if(arr[i]%3 == 0 && arr[i]%2 == 0) 
                {
                    arr[i] = arr[i] - 3;
                    count++;
                    continue;
                }
                if(arr[i]%2 == 0)
                {    
                    arr[i] = arr[i] - 2;
                    count++;
                    continue;
                }
                if(arr[i]%2 != 0)
                {
                    arr[i] = arr[i] - 3;
                    count++;
                }
            }
        }

        return count;
    }
}