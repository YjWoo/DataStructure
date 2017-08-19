package _algorithm;

import linear_list.Seq_List;

public class Seq_List_Algo {
    /**
     * 顺序表查找，返回下标
     * 
     * @param l顺序表
     * @param e查找元素
     * @return 返回下标，未找到返回-1
     */
    public static int locateItem(Seq_List l, int e) {
	for (int i = 0; i < l.getLength(); i++) {
	    if (e == l.getData()[i]) {
		return i;
	    }
	}
	return -1;
    }

    /**
     * 顺序表插入，返回布尔值
     * 
     * @param l顺序表
     * @param p插入位置下标
     * @param e插入元素
     * @return true成功，false失败
     */
    public static boolean insert(Seq_List l, int p, int e) {
	if (p < 0 || p > l.getLength() - 1 || l.getLength() >= Seq_List.maxSize)
	    return false;

	for (int i = l.getLength() - 1; i >= p; i--) {
	    l.setData(i + 1, l.getData()[i]);
	}
	l.setData(p, e);
	l.setLength(l.getLength() + 1);
	return true;
    }

    /**
     * 顺序表删除，返回布尔值
     * 
     * @param l顺序表
     * @param p删除位置下标
     * @return true成功，false失败
     */
    public static boolean remove(Seq_List l, int p) {
	if (p < 0 || p > l.getLength() - 1)
	    return false;
	for (int i = p; i < l.getLength(); i++) {
	    l.setData(i, l.getData()[i + 1]);
	}
	l.setLength(l.getLength() - 1);
	return true;
    }
}