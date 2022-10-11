HashMap Edge Case : {1,2,1,3}
​
int m = nums.length;
Map<Integer,Integer> unique = new HashMap<>();
for(int i=0; i<m; i++)
{
unique.put(nums[i], i);
}
List<List<Integer>> sorted = new ArrayList<>();
List<Integer> keys = new ArrayList<>();
for(int i : unique.keySet())
keys.add(i);
Collections.sort(keys);
for(int i : keys)
{
List<Integer> sort = new ArrayList<>();
sort.add(i);
sort.add(unique.get(i));
sorted.add(sort);
}
int n = sorted.size();
for(int i=0; i<n-2; i++)
{
for(int j=i+1; j<n-1; j++)
{
for(int k=j+1; k<n; k++)
{
if(sorted.get(k).get(1) > sorted.get(j).get(1) && sorted.get(j).get(1) > sorted.get(i).get(1))
{
return true;
}
}
}
}
return false;
}