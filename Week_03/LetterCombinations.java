package com.zzy.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 */
public class LetterCombinations {
    String[] letter_map = {" ","*","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits==null || digits.length()==0) {
            return new ArrayList<>();
        }
        iterStr(digits, "", 0);
        return res;
    }
    List<String> res = new ArrayList<>();

    void iterStr(String str, String letter, int index) {
        if(index == str.length()) {
            res.add(letter);
            return;
        }
        char c = str.charAt(index);
        int pos = c - '0';
        String map_string = letter_map[pos];
        for(int i=0;i<map_string.length();i++) {
            iterStr(str, letter+map_string.charAt(i), index+1);
        }
    }
}
