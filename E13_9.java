package E13_9;

public class E13_9
{
    //Use recursion to implement a method
    //public static int indexOf(String text, String str)
    //that returns the starting position of the first substring of the text that matches str. Return –1 if str is not a substring of the text.
    //For example, s.indexOf("Mississippi", "sip") returns 6.
    //Hint: You must keep track of how far the match is from the beginning of the text. Make that value a parameter variable of a helper method.

    private static int index;

    public static int indexOf(String text, String str)
    {
        int subLength = str.length();
        int textLength = text.length();
        //increments index with each call of indexOf
        index = helper(index);

        // if str is not a substring of text
        if(index >= textLength-1)
            return -1;
        //if the first letters match
        if(text.substring(0,subLength).equalsIgnoreCase(str))
            return 0;
        //if str and text match
        else if(text.substring(index, subLength+index).equalsIgnoreCase(str))
        {
            return index;
        }
        // if not match, call indexOf
        else
        {
            return indexOf(text, str);
        }

    }

    // check if beginning index to length of substring matches
    // if yes, return index
    // if no, increment index and call currentIndex again

    // increment index
    public static int helper(int currentIndex)
    {
        currentIndex += 1;
        return currentIndex;
    }

    public static void main(String[] args) {
        int index = indexOf("Mississippi", "sip");
        System.out.println(index);
    }
}
