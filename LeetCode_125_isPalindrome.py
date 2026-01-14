import re
class LeetCode_125_isPalindrome:
    def isPalindrome(self, s: str) -> bool:
        pattern = r'[^a-zA-Z0-9]'

        cleaned_string = re.sub(pattern, '', s).lower()
        left = 0
        right = len(cleaned_string) - 1
        while(left < right):
            if(cleaned_string[left] != cleaned_string[right]):
                return False
            left = left + 1
            right = right - 1
        return True