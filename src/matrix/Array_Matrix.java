package matrix;

/**
 * 定义多维数组-矩阵
 * @author YjWoo
 *
 */
public class Array_Matrix {
    public static int maxSize = 40;

    public int[][] data = new int[maxSize][];

    @Override
    public String toString() {
	return "Array_Matrix :"+"\r\n"+print();
    }
    
    private String print() {
	StringBuilder s=new StringBuilder();
	for (int i = 0; i <data.length; i++) {
	    for (int j = 0; j < data[i].length; j++) {
		s.append(data[i][j]);
		s.append("\t");
	    }
	    s.append("\r\n");
	}
	return s.toString();
    }
}
