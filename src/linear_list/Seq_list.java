package linear_list;

import java.util.Arrays;

/**
 * 顺序表定义
 * 
 * @author Miracle
 *
 */
public class Seq_list {
    public static int COUNT = 40;

    private int data[] = new int[COUNT];
    private int length;

    public int getLength() {
	return length;
    }

    public void setLength(int length) {
	this.length = length;
    }

    public int[] getData() {
	return data;
    }

    public void setData(int[] data) {
	if (data.length <= COUNT) {
	    for (int i = 0; i < data.length; i++) {
		this.data[i]=data[i];
	    }
	}
    }

    public void setData(int p, int e) {
	this.data[p] = e;
    }

    public Seq_list() {
    }

    public Seq_list(int data[]) {
	if (data.length <= COUNT) {
	    this.length = data.length;
	    setData(data);
	}
    }

    @Override
    public String toString() {
	return "Seq_list [data=" + Arrays.toString(data) + "]";
    }

}
