package everdell;

import java.util.ArrayList;

public class player {
    private int chushishoupaishu;
    private int shoupaishangxian;
    private ArrayList<String> shoupaiqu;
    private ArrayList<String> jianzhuqu;
    private boolean finishgame;
    private int jijie;//1-春，2-夏，3-秋，4-冬
    public player() {
        this.chushishoupaishu=5;
        this.shoupaishangxian=8;
        this.shoupaiqu=new ArrayList<String>();
        this.jianzhuqu=new ArrayList<String>();
        this.finishgame=false;
        this.jijie=1;
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

    public int getShoupaishangxian() {
        return shoupaishangxian;
    }

    public void setShoupaishangxian(int shoupaishangxian) {
        this.shoupaishangxian = shoupaishangxian;
    }

    public int getChushishoupaishu() {
        return chushishoupaishu;
    }

    public void setChushishoupaishu(int chushishoupaishu) {
        this.chushishoupaishu = chushishoupaishu;
    }

    public boolean isFinishgame() {
        return finishgame;
    }

    public void setFinishgame(boolean finishgame) {
        this.finishgame = finishgame;
    }

    public int getJijie() {
        return jijie;
    }

    public void setJijie(int jijie) {
        this.jijie = jijie;
    }

    public void addJijie() {
        this.jijie++;
    }
}
