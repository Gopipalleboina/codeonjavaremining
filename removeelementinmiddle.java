public class removeelementinmiddle{
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        
       
        int middleIndex = originalArray.length / 2;
        
        
        int[] newArray = new int[originalArray.length - 1];

       
        for (int i = 0, j = 0; i < originalArray.length; i++) {
            if (i != middleIndex) {
                newArray[j++] = originalArray[i];
            }
        }

        
        System.out.print("New array: ");
        for (int j = 0; j < newArray.length; j++) {
            System.out.print(newArray[j] + " ");
        }
    }
}
