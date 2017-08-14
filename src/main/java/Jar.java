import java.util.Random;

public class Jar {
    private String mItemName;
    private int mMaxItemsInJar;
    private int mItemsInJar;
    private int mGuessCount;
    private boolean mHit;
    private int mGuess;


    public Jar(String itemName, int maximumNumberOfItems) {
        mItemName = itemName;
        mMaxItemsInJar = maximumNumberOfItems;
        mGuessCount = 0;
        mHit = false;
        fill();
    }

    public void fill() {
        Random random = new Random();
        mItemsInJar = random.nextInt(getMaxItemsInJar()) + 1;
    }

    public int getItemsInJar() {
        return mItemsInJar;
    }

    public int getMaxItemsInJar() {
        return mMaxItemsInJar;
    }

    public boolean isHit() {
        return mHit;
    }

    public void guess(int number) {
        mGuess = number;
        if (isHit())return;

        if(!isOverMax() && !isUnderMin()) {
            if(number == getItemsInJar()) {
                mHit = true;
            }
            mGuessCount++;
        }

    }

    public int getGuess() {
        return mGuess;
    }


    public int getGuessCount() {
        return mGuessCount;
    }

    public String getItemName() {
        return mItemName;
    }

    public boolean isGuessTooLow() {
        return getGuess() < getItemsInJar();
    }

    public boolean isGuessToHigh() {
        return getGuess() > getItemsInJar();
    }

    public boolean isOverMax() {
        return getGuess() > getMaxItemsInJar();
    }

    public boolean isUnderMin() {
        return getGuess() < 1;
    }
}