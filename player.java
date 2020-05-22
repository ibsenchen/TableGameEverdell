import java.util.ArrayList;

public class player {
    private ArrayList<String> shoupaiqu;
    private ArrayList<String> jianzhuqu;

    public player() {
        this.shoupaiqu=new ArrayList<String>();
        this.jianzhuqu=new ArrayList<String>();
    }

    public ArrayList<String> getShoupaiqu() {
        return shoupaiqu;
    }

    public void addShoupaiqu(String shoupaiqu) {
        this.shoupaiqu.add(shoupaiqu);
    }

    public ArrayList<String> getJianzhuqu() {
        return jianzhuqu;
    }

    public void addJianzhuqu(String jianzhuqu) {
        this.jianzhuqu.add(jianzhuqu);
    }
}
