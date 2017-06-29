package myPack;

import Main.Form;
import java.util.List;

/**
 *
 * @author SKORPION
 */
public class Sort extends Form{
    private int numArr[];
    private List ArrList;
    private int first, last, lev = 0;

    public Sort(int Arr[], List a){
        numArr = Arr;
        ArrList = a;
        first = 0;
        last = Arr.length - 1;
    }

    public void do_sort(){
        quickSort(first, last);
    }

    public int[] call_back(){
        return numArr;
    }

    private void  quickSort(int left, int right) {
        if (left >= right)
            return;
        int i = left, j = right;
        int cur = (i + j) / 2;
        while (i < j) {
            while ((i < cur) && (numArr[i] <= numArr[cur])) {
                i++;
            }
            while ((j > cur) && (numArr[cur] <= numArr[j])) {
                j--;
            }
            if (i < j) {
                int temp = numArr[i];
                numArr[i] = numArr[j];
                numArr[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        if (left<cur)
        {
            numArr[cur] = 100000;
            ArrList.add(numArr.clone());
            quickSort(left, cur-1);
        }
        if (right > cur){
            numArr[cur] = 100000;
            ArrList.add(numArr.clone());
            quickSort(cur+1, right);
        }

    }
}