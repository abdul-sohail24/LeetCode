Bruteforce (47/48 TCs)
​
class Solution
{
public int[] dailyTemperatures(int[] temperatures)
{
int n = temperatures.length;
int[] ans = new int[n];
int k = 0;
int count;
for(int i=0; i<n; i++)
{
count = 1;
for(int j=i+1; j<n; j++)
{
if(j == n-1 && temperatures[j] <= temperatures[i])
{
ans[k] = 0;
k++;
}
if(temperatures[j] > temperatures[i])
{
ans[k] = count;
count = 1;
k++;
break;
}
if(temperatures[i] >= temperatures[j])
count++;
}
}
return ans;
}
}