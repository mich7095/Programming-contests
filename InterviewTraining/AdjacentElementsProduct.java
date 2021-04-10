class AdjacentElementsProduct{

    public static void main (String[] args) {
        int arr[]= {3,6,-2,-5,7,3};
        System.out.println(gerPairProduct(arr));
    }

    public static int gerPairProduct(int[]arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]*arr[i+1]>max){
            max = arr[i]*arr[i+1];
            }
        }
        return max;
    }
}