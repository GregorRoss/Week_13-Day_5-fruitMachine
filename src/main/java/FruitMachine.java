import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;


public class FruitMachine {
    private final ArrayList<Symbols> reels;
    private int result;

    public FruitMachine() {
        this.reels = new ArrayList<>();
    }
public Symbols getRandomSymbol(){
        Random random = new Random();
        int a = random.nextInt(Symbols.values().length);
        Symbols[] values = Symbols.values();
        return values[a];
}

public int getResult() {
        return result;
}

public ArrayList<Symbols> spin() {
        this.reels.clear();
        this.result =0;
        this.reels.add(getRandomSymbol());
        this.reels.add(getRandomSymbol());
        this.reels.add(getRandomSymbol());
        if (this.reels.get(0)==this.reels.get(1)||
                this.reels.get(1)==this.reels.get(2)||
                this.reels.get(0)==this.reels.get(2)){
            if(this.reels.get(0) == this.reels.get(1) &&
                    this.reels.get(1) == this.reels.get(2) ) {
                result = this.reels.get(0).getValue();
            } else if (this.reels.get(0) == this.reels.get(1)) {
                result =this.reels.get(0).getValue()/2;
            } else  {
                result =0;
            }

        }
    return this.reels;
}

}
