import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class everdell {
    public static void main(String[] args) {
        System.out.println("请输入游玩人数,1-4");
        int playernumber =Integer.parseInt(new Scanner(System.in).next());
        //创建玩家库
        if(playernumber<1||playernumber>4){
            System.out.println("输入人数不对");
            return;
        }
        player[] players=new player[playernumber];
        for(int i=0;i<playernumber;i++) {
            players[i] = new player();
        }
        //创建公共区
        ArrayList<String> gonggongpaiqu = new ArrayList<String>();
        //创建弃牌区
        ArrayList<String> qipaiqu = new ArrayList<String>();
        //洗牌
        ArrayList<String> choupaiqu=paiku.xipai(qipaiqu);
        //System.out.println(choupaiqu);
        //发牌
        for(int i=0;i<5;i++){
            for(int j=0;j<playernumber;j++){
                players[j].addShoupaiqu(choupaiqu.remove(0));
            }
        }
        for(int i=0;i<playernumber;i++) {
            System.out.println(players[i].getShoupaiqu());//玩家牌
        }
        for(int j=0;j<8;j++){
            gonggongpaiqu.add(choupaiqu.remove(0));
        }
        System.out.println(gonggongpaiqu);//中央公共牌，明牌
        //System.out.println(qipaiqu);//弃牌，明牌显示最后一张
        //System.out.println(choupaiqu);//抽牌区
    }
}
