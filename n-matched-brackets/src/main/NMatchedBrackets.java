package main;

import java.util.ArrayList;
import java.util.List;

public class NMatchedBrackets {

    public List<String> nMatchedBrackets(int n){
        List<String> brackets = new ArrayList<>();
        getBrackets(brackets,"", n, n);

        return brackets;
    }

    public void getBrackets(List<String> bracketsList, String brackets, int left, int right){
        if(left == 0 && right == 0){
           bracketsList.add(brackets);
            return;
        }

        if(left < 0 || left > right)return;

        getBrackets(bracketsList,brackets + "(", left-1, right);
        getBrackets(bracketsList,brackets + ")", left, right-1);
    }


}
