package Stacks;

public class LeetCode {
    public static void main(String[] args) {

    }
}

//leetcode 20

// ([]){} valid do bracket ka andar bhi valid hone chahiye
//
// ([)]  invalid => do bracket ka andar valid bracet nahi ha

//  '('   ||  '{' || '['  en ma se koi bhi hoga to stack me insert kar dege

// lekin ham hmesha enko dalna se phele check karege ki hmare stack ke top pe uska closing bracket ha ki nahi
// insert = '('
// check at top of stack if (ch==)) return valid
// yaha par mera stack khali hua to invalid
// mereko bas validity check karni ha ki jo ma closing  bracket laga raha hu uska openning bracket stack ka top par ha ki nahi agar ha to pop kar duga or aaga check kar duga






























