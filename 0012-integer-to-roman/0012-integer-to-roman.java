import java.util.Map.Entry;
class Solution 
{
    public String intToRoman(int num) 
    {
        //Optimized
        String ans = "";
        String[] ten_thousands = {"","M","MM","MMM"};
        String[] thousands = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] hundreds = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] tens = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        
        ans += ten_thousands[num/1000];
        ans += thousands[(num%1000)/100];
        ans += hundreds[(num%100)/10];
        ans += tens[num%10];
        
        return ans;
    }
}