public class CyclicSort{
    public static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void cyclicSort(int [] arr){
        int i = 0;
        while(i<arr.length){
            if(arr[i] == i) i++;
            else{
                swap(arr,i,arr[i]);
            }
        }
    }
    public static void main(String[] args) {
      int [] arr = {1,4,2,3,5,0};
      cyclicSort(arr);
      for(int each:arr){
          System.out.print(each+" ");
      }
    }
}