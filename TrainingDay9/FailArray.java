public class FailArray {
    private int a[];
    private int errval;
    public int length;

    public FailArray(int size, int errv){
        a = new int[size];
        errval = errv;
        length = size;
    }

    public int get(int index){
        if(ok(index)) return a[index];
        return errval;
    }

    public boolean put(int index, int val){
        if(ok(index)){
            a[index] = val;
            return true;
        }
        return false;
    }

    public boolean ok(int index){
        if(index >= 0 & index < length) return true;
        return false;
    }
}
