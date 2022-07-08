import java.util.Arrays;

public class Stackkk {
    private int[] stack;
    private int slider;

    public Stackkk() {
        stack = new int[5];
        slider = 0;
    }

    public void add(int value) {
        try {
            stack[slider] = value;
            slider++;
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            int[] temp = new int[stack.length +5];
            System.arraycopy(stack, 0, temp, 0, stack.length);

            stack = temp;

            add(value);
        }

    }

    public void remove() {
        if (slider!=0) {
            stack[slider-1] = 0;
            slider--;
        }
        if (slider<stack.length-5) {
            int[] temp = new int[stack.length -5];
            System.arraycopy(stack, 0, temp, 0, stack.length-5);
            stack = temp;


        }


    }

    public void printStackk() {
        if (slider != 0) {
            System.out.println(Arrays.toString(Arrays.copyOf(stack, slider)));
        }  else {
            System.out.println(Arrays.toString(Arrays.copyOfRange(stack,0, 0)));
        }
    }

    public int[] getStack() {
        return stack;
    }

    public int getSlider() {
        return slider;

    }
}
