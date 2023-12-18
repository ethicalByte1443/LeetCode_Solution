// -----------Intuition-----------
// you can follow a different approach that avoids creating two separate frequency maps. Instead, you can use a single array to represent the frequency of characters.

// -----------Approach------------
// Instead of creating two separate frequency maps, this version uses a single integer array (charCount) to represent the frequency of characters. This reduces the space complexity.
// Complexity

//     Time complexity:    This approach has a time complexity of O(n)

//     Space complexity:   The space complexity of O(1)

class leet242 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;

        int arr[]=new int[26];
        for(char c : s.toCharArray())
        {
            arr[c-'a']++;
        }

        for(char c : t.toCharArray())
        {
            arr[c-'a']--;
        }

        for(int num : arr)
        {
            if(num!=0)
            {
                return false;
            }
        }
        return true;
    }
}