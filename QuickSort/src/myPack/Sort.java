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
    
    private void  quickSort(int left, int right){
            if (left >= right)
                return;
            int i = left, j = right;
            int count=0;
            int cur = (i+j) / 2;
            while (i < j) {
                while ((i < cur) && (numArr[i] <= numArr[cur])) {
                    i++;
                }
                while ((j > cur) && (numArr[cur] <= numArr[j])) {
                    j--;
                }
                if (i < j) {
                    count++;
                    int temp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = temp;
                    if (i == cur)
                        cur = j;
                    else if (j == cur)
                        cur = i;
                }
            }

        if (left < cur-1 ){
            int[] arr = new int [cur-left+lev];
            int k=0;
            int otstup1=lev;
            lev++;
            for (int m = left; m < cur; m++)
            {
                while (otstup1>0)
                {
                    arr[k] = 100000;
                    k++;
                    otstup1--;
                }
                arr[k] = numArr[m];
                k++;
            }
            if (count >0)
                ArrList.add(arr.clone());
            
            quickSort(left, cur-1);
        }
        if (right > cur+1){
            int[] arr = new int [right-cur+lev];
            int k=0;
            int otstup2 = lev;
            for (int m = cur+1; m < right+1; m++)
            {
                while (otstup2>0)
                {
                    arr[k] = 100000;
                    k++;
                    otstup2--;
                }
                arr[k] = numArr[m];
                k++;
            }
            if (cur-1 == left)
                lev++;
            if (count>0)
                ArrList.add(arr.clone());
            
            quickSort(cur+1, right);
        }
    }
}
