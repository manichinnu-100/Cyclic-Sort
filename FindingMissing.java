public class FindingMissing {
    public static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static int cyclicSort(int [] arr){
        int i = 0;
        while(i<arr.length){
            if(arr[i] == i ||arr[i] == arr.length) i++;
            else{
                swap(arr,i,arr[i]);
            }
        }
        for(int j = 0; j<arr.length; j++){
            if(arr[j]!=j) return j;
        }
        return 7;
    }
    public static void main(String [] args){
        int [] arr = {1,4,5,3,6,0};
        System.out.println(cyclicSort(arr));
    }
}
