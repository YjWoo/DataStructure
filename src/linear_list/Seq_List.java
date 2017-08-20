package linear_list;

import java.util.Arrays;

/**
 * 顺序表定义
 * 
 * @author YjWoo
 *
 */
public class Seq_List {
    public static int maxSize = 40;

    private int data[] = new int[maxSize];
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
	if (data.length <= maxSize) {
	    for (int i = 0; i < data.length; i++) {
		this.data[i]=data[i];
	    }
	}
    }

    public void setData(int p, int e) {
	this.data[p] = e;
    }

    public Seq_List() {
    }

    public Seq_List(int data[]) {
	if (data.length <= maxSize) {
	    this.length = data.length;
	    setData(data);
	}
    }

    @Override
    public String toString() {
	return "Seq_list [data=" + Arrays.toString(data) + "]";
    }

}
