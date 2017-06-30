/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPack;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ринат
 */
public class Sort {
    //Список состояний массива
    private List<int[]> mainList = new ArrayList<int[]>();
    //Обводка
    private List<int[]> linesList = new ArrayList<int[]>();
    
    public Sort(List<int[]> a, List<int[]> b){
        mainList = a;
        linesList = b;
    }
    
    public void quickSort(int[] numArr, int left, int right) {
        int i = left, j = right;
        int tmp, tmp_line[] = new int[3];
        int pivot = numArr[(left + right) / 2];

      /* partition */
        while (i <= j) {
            while (numArr[i] < pivot)
                i++;
            while (numArr[j] > pivot)
                j--;
            if (i <= j) { 
                tmp = numArr[i];
                numArr[i] = numArr[j];
                numArr[j] = tmp;
                
                if(i != j){
                    tmp_line[0] = i;
                    tmp_line[1] = j;
                    tmp_line[2] = (left + right) / 2;

                    linesList.add(tmp_line.clone());
                    mainList.add(numArr.clone()); //ADD
                }

                i++;
                j--;
            }
        }

      /* recursion */
        if (left < j){
            quickSort(numArr, left, j);
        }
        if (i < right){
            quickSort(numArr, i, right);
        }
    }
}
