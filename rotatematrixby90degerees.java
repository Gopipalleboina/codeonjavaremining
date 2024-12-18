import java.util.*;
public class rotatematrixby90degerees{
    public static void main(String[] args){
        int r=3;
        int c=3;
        int[][] mat=new int[r][c];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=i+1;j<c;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c/2;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][c-j-1];
                mat[i][c-j-1]=temp;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}