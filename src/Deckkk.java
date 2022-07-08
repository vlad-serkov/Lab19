import java.util.Arrays;

public class Deckkk {
    private int[] deck;
    private int sliderLeft;
    private int sliderRight;

    public Deckkk() {
        deck = new int[12];
        sliderLeft = deck.length/2-1;
        sliderRight = deck.length/2;
    }

    public Deckkk(Stackkk stack) {
        sliderLeft = 4;
        sliderRight = stack.getSlider()+5;
        int[] temp = new int[stack.getSlider() + 10];
        deck = Arrays.copyOf(stack.getStack(), stack.getSlider());
        System.arraycopy(deck, 0, temp, 5, deck.length);
        deck = temp;


    }


    public void addLeft(int value) {
        try {
            deck[sliderLeft] = value;
            sliderLeft--;
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {

            sliderLeft += 5;
            sliderRight += 5;

            int[] temp = new int[this.deck.length +5];

            System.arraycopy(deck, 0, temp, 5, deck.length);

            deck = temp;

            addLeft(value);
        }

    }

    public void addRight(int value) {
        try {
            deck[sliderRight] = value;
            sliderRight++;
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {


            int[] temp = new int[deck.length +5];
            System.arraycopy(deck, 0, temp, 0, deck.length);

            deck = temp;

            addRight(value);
        }

    }

    public void removeLeft() {
        if (sliderLeft+1<sliderRight) {
            deck[sliderLeft+1] = 0;
            sliderLeft++;
        }
        if (sliderLeft<sliderRight && sliderLeft>9) {
            int[] temp = new int[deck.length -5];
            System.arraycopy(deck, 5, temp, 0, deck.length-5);
            deck = temp;
            sliderLeft-=5;
            sliderRight-=5;
        }
    }

    public void removeRight() {
        if (sliderLeft+1 < sliderRight) {
            deck[sliderRight-1] = 0;
            sliderRight--;
        }
        if (sliderRight<deck.length-5 && sliderLeft < sliderRight) {
            int[] temp = new int[deck.length -5];
            System.arraycopy(deck, 0, temp, 0, deck.length-5);
            deck = temp;
        }

    }

    public void printDeckk() {
        if (sliderLeft < sliderRight) {
            System.out.println(Arrays.toString(Arrays.copyOfRange(deck,sliderLeft+1, sliderRight)));
        } else {
            System.out.println(Arrays.toString(Arrays.copyOfRange(deck,sliderLeft, sliderRight)));
        }

    }



}
