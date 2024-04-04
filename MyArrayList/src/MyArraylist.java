import com.sun.corba.se.impl.protocol.AddressingDispositionException;

import java.util.Arrays;

public class MyArraylist {

    public int[] elem;
    public int usedSize;//0
    //默认容量
    private static final int DEFAULT_SIZE = 10;

    public MyArraylist() {
        this.elem = new int[DEFAULT_SIZE];
    }

    /**
     * 打印顺序表:
     *   根据usedSize判断即可
     */
    public void display() {
        for (int i = 0; i < usedSize; i++) {
            System.out.println(this.elem[i]+" ");
        }
    }

    // 新增元素,默认在数组最后新增
    public void add(int data) {
        if (this.isFull()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[this.usedSize] = data;
        this.usedSize++;
    }

    /**
     * 判断当前的顺序表是不是满的！
     * @return true:满   false代表空
     */
    public boolean isFull() {
        if (usedSize == elem.length){
            return true;
        }else {
            return false;
        }
    }


    private boolean checkPosInAdd(int pos) {
        if (pos < 0 || pos > usedSize) {
            throw new AddIndexOutOfException("add位置的时候 pos不合法");
        }
        else
            return true;
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if (isFull() && checkPosInAdd(pos)){
            for (int i = usedSize-1; i >=pos ; i--) {
                elem[i+1] = elem[i];
            }
           this.elem[pos] = data;
        }
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < usedSize; i++) {
            if (elem[i] == toFind){
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int indexOf(int toFind) {
        for (int i = 0; i < usedSize; i++) {
            if (elem[i] == toFind){
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int get(int pos) {
       return elem[pos];
    }

    private boolean isEmpty() {
        return false;
    }
    // 给 pos 位置的元素设为【更新为】 value
    public void set(int pos, int value) {
        if (checkPosInAdd(pos)){
            this.elem[pos] = value;
        }
    }

    /**
     * 删除第一次出现的关键字key
     * @param key
     */
    public void remove(int key) {
        int index = this.indexOf(key);
        if (index == -1) {
            if (!isEmpty()) {
                for (int i = index; i < this.usedSize - 1; i++) {
                    elem[i] = elem[i + 1];
                }
                usedSize--;
            }
        }
    }

    // 获取顺序表长度
    public int size() {
        return this.elem.length;
    }

    // 清空顺序表
    public void clear() {
        this.elem = Arrays.copyOf(this.elem,DEFAULT_SIZE);
    }
}
