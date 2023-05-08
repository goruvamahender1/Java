// Input: image = [[1,1,0],[1,0,1],[0,0,0]]
// Output: [[1,0,0],[0,1,0],[1,1,1]]
// Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
// Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

//First you run a loop from image.length
//then run a loop upto length arr[i].length
//then reverse the array by using while loop
//[0]
//start=0, end=arr[i].length-1
//Now you have a horizontal array
//Then again run two for loops, and make it 1 if it is zero and viceversa

class ArrayEasy12 {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int start=0;
            int end=image[i].length-1;
            while(start<end){
                int temp=image[i][start];
                image[i][start]=image[i][end];
                image[i][end]=temp;
                start++;
                end--;
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                if(image[i][j]==1){
                    image[i][j]=0;
                }
                else{
                    image[i][j]=1;
                }
            }
        }
        return image;
        
        
    }
}
