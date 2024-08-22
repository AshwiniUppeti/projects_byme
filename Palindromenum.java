class Palindromenum  {
    public boolean isPalindrome(int x) {
        long rev=0;
        int ori=x;
        while(x>0)
        {
            int r;
            r=x%10;
            rev=rev*10+r;
            x=x/10;
        }
         
        if(ori==rev)
        return true;
        else
        return false;
    }
}
