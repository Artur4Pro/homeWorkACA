package company.day22.task2;

public class DefaultStack implements Stack {
    final int MAX_SIZE = 5 ;
    private int[] nums = new int[MAX_SIZE];
    static int index =0;

    @Override
    public void push(int val) {
        if (index>=MAX_SIZE){
            index=MAX_SIZE-1;
            throw new StackIndexOutOfBoundsException("StackIndexOutOfBoundsException");}
        nums[index] = val;
        index++;
    }

    @Override
    public void pop() {
        index--;
        if (index<0){throw new  EmptyStackException("EmptyStackException");}
        System.out.println(nums[index]);
    }


}
