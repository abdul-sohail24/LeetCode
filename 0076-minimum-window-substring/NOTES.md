public String minWindow(String s, String t)
{
if(t.length() > s.length())
return "";
//Bruteforce
int n = s.length();
int best = Integer.MAX_VALUE;
String minWindow = "";
for(int left=0; left<n; left++)
{
for(int right=left; right<n; right++)
{
String subString = s.substring(left,right+1);
boolean check = stringContainsCharacters(subString, t);
if(check && subString.length() < best)
{
best = subString.length();
minWindow = subString;
}
}
}
return minWindow;
}
public boolean stringContainsCharacters(String subString, String t)
{
//HashMap
Map<Character,Integer> frequency = new HashMap<>();
for(int i=0; i<t.length(); i++)
{
int numOccurences = frequency.getOrDefault(t.charAt(i), 0);
frequency.put(t.charAt(i), numOccurences + 1);
}
for(int i=0; i<subString.length(); i++)
{
char curr = subString.charAt(i);
if(frequency.containsKey(curr))
{
int newOccurenceCount = frequency.get(curr) - 1;
if(newOccurenceCount == 0)
frequency.remove(curr);
else
frequency.put(curr, newOccurenceCount);
}
}
return frequency.isEmpty();
}