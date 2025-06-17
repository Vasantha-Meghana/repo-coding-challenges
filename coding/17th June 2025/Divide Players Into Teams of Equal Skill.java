//Divide Players Into Teams of Equal Skill
class Solution 
{
    public long dividePlayers(int[] skill) 
    {
        Arrays.sort(skill);
        int n = skill.length;
        int total = skill[0] + skill[n - 1];
        long result = 0;
        for(int i = 0; i < n / 2; i++)
        {
            if(skill[i] + skill[n - i - 1] != total)
                return -1;
            result += (long) skill[i] * skill[n - i - 1];
        }
        return result;
    }
}
