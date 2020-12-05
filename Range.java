import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
    private int start,end,current;

    public Range(int start,int end){
        this.start = start;
        this.end = end;
        current = start;
    }

    public void reset(){
        current = start;
    }

    public int length(){
        return end-start+1;
    }
    //When current is no longer a valid element in the range, it should return false.
    public boolean hasNext(){
        if(current<=end){
            return true;
        } else {
            return false;
        }
    }
    //@throws NoSuchElementException when hasNext() is false.
    //This will return the current value, it will also increase current value by 1.
    //e.g.  if current is 5. This will make current 6, and return 5.
    public int next(){
        int value = current;
        if(!hasNext()){
            throw new NoSuchElementException();
        } else {
            current++;
            return value;
        }
    }

}
