class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startColor=image[sr][sc];
        if(startColor==color){
            return image;
        }
        fill(image,sr,sc,startColor,color);
        return image;
    }
    private void fill(int[][] image,int r,int c,int startColor,int newColor){
        if(r<0 || r>=image.length || c<0 || c>=image[0].length){
            return;
        } 
        if(image[r][c]!=startColor){
            return;
        }
        image[r][c]=newColor;
        fill(image,r-1,c,startColor,newColor);
        fill(image,r+1,c,startColor,newColor);
        fill(image,r,c-1,startColor,newColor);
        fill(image,r,c+1,startColor,newColor);
    }
}