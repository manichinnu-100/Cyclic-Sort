public class FindingMissingNumbersInArrContainingDup {
    public static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void cyclicSort(int [] arr){
        int i = 0;
        while(i<arr.length){
            if(arr[i] == i+1) i++;
            else if(arr[i] == arr[arr[i]-1]) i++;
            else{
                swap(arr,i,(arr[i]-1));
            }
        }
        for(int j = 0; j<arr.length; j++){
            if(arr[j]!=j+1){
                System.out.println(j+1);
            }
        }
    }
    public static void main(String [] args){
        int [] arr = {4,3,2,7,8,2,3,1};
        cyclicSort(arr);
    }
}
