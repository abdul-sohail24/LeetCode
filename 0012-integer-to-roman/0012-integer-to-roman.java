import java.util.Map.Entry;
class Solution 
{
    public String intToRoman(int num) 
    {
        //Bruteforce
        int rem = num;
        String ans = "";
        Map<Character, Integer> symbol_value = new HashMap<>();
        
        symbol_value.put('I',1);
        symbol_value.put('V',5);
        symbol_value.put('X',10);
        symbol_value.put('L',50);
        symbol_value.put('C',100);
        symbol_value.put('D',500);
        symbol_value.put('M',1000);
        
        int[] denominations = new int[7];
        int j=0;
        for(int i : symbol_value.values())
        {
            denominations[j] = i;
            j++;
        }
        
        Arrays.sort(denominations);
        
        int input = 1;
        while(rem>0)
        {
            for(int i=0; i<7; i++)
            {
                if(rem >= denominations[i])
                    input = denominations[i];
            }
            if(rem >= 400 && rem < 500)
            {
                ans+="CD";
                rem-=400;
            }
            else if(rem >= 900 && rem < 1000)
            {
                ans+="CM";
                rem-=900;
            }
            else if(rem >= 40 && rem < 50)
            {
                ans+="XL";
                rem-=40;
            }
            else if(rem >= 90 && rem < 100)
            {
                ans+="XC";
                rem-=90;
            }
            else if(rem == 4)
            {
                ans+="IV";
                rem-=4;
            }
            else if(rem == 9)
            {
                ans+="IX";
                rem-=9;
            }
            else
            {
                rem -= input;
                for(Entry<Character, Integer> entry: symbol_value.entrySet()) 
                {
                    if(entry.getValue() == input) 
                    {
                        ans += entry.getKey();
                            break;
                    }   
                }
            }
        }

        return ans;
    }
}