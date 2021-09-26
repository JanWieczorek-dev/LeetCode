
class Solution(object):
    def lengthOfLongestSubstring(self, s):
        index1 = 0
        index2 = 1
        longest_substring_length = 0

        while (index2 < len(s)) and (index2 <= len(s)/2 or longest_substring_length <= len(s)/2) :
            if s[index2] not in s[index1: index2]:
                index2 +=1
                if index2 - index1 > longest_substring_length:
                    longest_substring_length = index2 - index1

            else:
               # IMPORTANT: here I use the 2nd parameter of .find() to start searching from index1
                # of the original string -
                # if tried to find index2 in s[index1:index2] then the indices would be reassigned
                # and index1 would not be updated correctly
                index1 = s[:index2].find(s[index2], index1) +1
                index2 += 1

        return longest_substring_length

s = "abcabcbb"
s = "pwwkew"
s = ""
s ="yyfghj"
solution = Solution()
print(solution.lengthOfLongestSubstring(s))


