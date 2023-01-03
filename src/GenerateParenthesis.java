/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Examples
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

Input: n = 1
Output: ["()"]
 */

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {

        List<String> outputArray = new ArrayList();
        backTrack(outputArray, "", 0, 0, n);
        return outputArray;
    }

    public void backTrack(List<String> outputArray, String currentString, int open, int close, int max) {
        if (currentString.length() == max * 2) {
            outputArray.add(currentString);
            return;
        }
        if (open < max) backTrack(outputArray, currentString + "(", open + 1, close, max);
        if (close < open) backTrack(outputArray, currentString + ")", open, close + 1, max);
    }
}