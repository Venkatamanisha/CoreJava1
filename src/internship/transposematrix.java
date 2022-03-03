package internship;

public class transposematrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {{1,3,4},{2,4,3},{3,4,5}};
int[][] transpose=new int [3][3];
System.out.println("transpose");
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		transpose [i][j]=a[j][i];
		System.out.print(transpose[i][j]+" " );
	}
	System.out.println();
}

	}

}
