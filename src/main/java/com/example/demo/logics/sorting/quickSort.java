package com.example.demo.logics.sorting;

import org.springframework.stereotype.Repository;

@Repository
public class quickSort{

    public int[] arr = {3,6,2,8,5,1,90,76,34,56,3};

    
    public int[] quick() {
        sort(arr,0,arr.length-1);
        return(arr);
        
    }

    public int partition(int[] arr, int low,int high){

        int pivot = arr[high];
        int i = low - 1;

        for(int j=low;j<high;j++){

            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = temp;

        return (i+1);
    }

    public void sort(int[] arr, int low,int high){
        if(low<high){
            int pivot = partition(arr, low, high);
            sort(arr, low, pivot -1);
            sort(arr, pivot+1,high);
        }
    }
}