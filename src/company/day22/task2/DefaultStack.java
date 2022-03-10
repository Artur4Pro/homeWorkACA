package company.day22.task2;

public class DefaultStack implements Stack {
    private final static int MAX_SIZE = 5 ;
    private final int[] nums ;
    private int index ;

    public DefaultStack() {
        nums = new int[MAX_SIZE];
        index=0;
    }

    @Override
    public void push(int val) {
        if (index>=MAX_SIZE){
            index=MAX_SIZE-1;
            throw new StackIndexOutOfBoundsException("StackIndexOutOfBoundsException");}
        nums[index] = val;
        index++;
    }

    @Override
    public int pop() {
        index--;
        if (index<0){throw new  EmptyStackException("EmptyStackException");}
        return nums[index];
    }


}
