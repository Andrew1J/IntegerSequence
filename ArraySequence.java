import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence{
    private int currentIndex;
    private int []data;

    public ArraySequence(int [] other){
        data = other;
        currentIndex = 0;
    }

    public ArraySequence(IntegerSequence otherseq){
        data = new int[otherseq.length()];
        otherseq.reset();
        for(int i=0;i<data.length;i++){
            data[i]=otherseq.next();
        }
        otherseq.reset();
        currentIndex = 0;
    }
    public boolean hasNext(){
        return currentIndex < data.length;
    }

    public int next(){
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        return data[currentIndex++];
    }

    public int length(){
        return data.length;
    }

    public void reset(){
        currentIndex = 0;
    }
}
