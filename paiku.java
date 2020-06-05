package everdell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class paiku {
    static ArrayList<dongwupai> dongwupaiku;
    static ArrayList<jianzhupai> jianzhupaiku;
    static kapai kongka;
    static int zongjijieshu = 4;

    public static void yuzupaiku() {
        dongwupaiku = new ArrayList<dongwupai>();
        dongwupaiku.add(new dongwupai("清洁工", 30, "绿", 3, false, 2, "发动1绿"));
        dongwupaiku.add(new dongwupai("小丑", 20, "棕", 3, true, -2, "打到对手1个空区域中"));
        dongwupaiku.add(new dongwupai("小贩", 30, "绿", 2, false, 1, "任意素材换任意素材，最多2个"));
        jianzhupaiku = new ArrayList<jianzhupai>();
        jianzhupaiku.add(new jianzhupai("树脂加工厂", 30, "绿", 0, 1, 1, false, 1, "获得1树脂"));
        jianzhupaiku.add(new jianzhupai("游乐场", 20, "绿", 1, 2, 1, true, 3, "抽2张牌"));
        jianzhupaiku.add(new jianzhupai("废墟", 30, "棕", 0, 0, 0, false, 0, "弃1建筑，得其建造资源+2张卡牌"));
        kongka = new kapai();
        for (int i = 0; i < dongwupaiku.size(); i++) {
            dongwupaiku.get(i).linkKapai(jianzhupaiku.get(i));
        }
    }

    public static kapai findKapai(String paimian) {
        for (dongwupai dongwu : dongwupaiku) {
            if (dongwu.getPaimian() == paimian) {
                return dongwu;
            }
        }
        for (jianzhupai jianzhu : jianzhupaiku) {
            if (jianzhu.getPaimian() == paimian) {
                return jianzhu;
            }
        }
        System.out.println("并没有这张牌");
        return kongka;
    }

    public static LinkedList<String> xipai(LinkedList<String> qipaiqu) {
        LinkedList<String> choupaiqu = new LinkedList<String>();//抽牌库，LinkedList
        if (qipaiqu.isEmpty()) {//弃牌区为空，初始化牌库
            yuzupaiku();
            for (dongwupai dongwu : dongwupaiku) {
                for (int i = 1; i <= dongwu.getShuliang(); i++) {
                    choupaiqu.add(dongwu.getPaimian());
                }
            }
            for (jianzhupai jianzhu : jianzhupaiku) {
                for (int i = 1; i <= jianzhu.getShuliang(); i++) {
                    choupaiqu.add(jianzhu.getPaimian());
                }
            }
        } else {//弃牌区不为空，将弃牌区移至牌库，清空弃牌区
            if (choupaiqu.isEmpty() == false) {//抽牌区不为空，返回抽牌区
                return choupaiqu;
            }
            choupaiqu = qipaiqu;
        }
        //System.out.println(paiku);
        /*shuffer方法
         * static void shuffle(List<?> list)
         *     使用默认随机源对指定列表进行置换。
         */
        //2:洗牌
        Collections.shuffle(choupaiqu);
        return choupaiqu;
    }

    public static void wanjiaxingdong(player players) {
        while (true) {
            System.out.println("请选择行动，1-建造卡牌，2-放置工人，3-过季节或结束游戏");
            int xingdongtype = Integer.parseInt(new Scanner(System.in).next());
            switch (xingdongtype){
                case 1://选择1
                    jianzaokapai(players);
                    break;
                case 2://选择2
                    fangzhigongren(players);
                    break;
                case 3://选择3
                    guojijie(players);
                    break;
                default:
                    System.out.println("输入行动序号不对,请重新输入");
                    break;
            }
        }
    }
    public static void jianzaokapai(player players){
        while (true) {
            System.out.println("请选择要建造的卡牌序号,公共牌0-7，手牌从8开始，返回上一级请输入-1");
            int shoupaiindex = Integer.parseInt(new Scanner(System.in).next());
            if (shoupaiindex == -1) {//输入-1
                return;
            }else if(shoupaiindex>-1||shoupaiindex<8){//输入0-7
                kapai shiyongka = findKapai(players.getShoupaiqu().remove(shoupaiindex));
            }else if( shoupaiindex<players.getShoupaiqu().size()+7){//输入8以上
                kapai shiyongka = findKapai(players.getShoupaiqu().remove(shoupaiindex));
                if (shiyongka instanceof jianzhupai) {
                    System.out.println("选中的卡牌为：" + shiyongka.getPaimian() +
                            ",类型：" + shiyongka.getLeixing() +
                            ",唯一建筑：" + shiyongka.isWeiyi() +
                            ",消耗：木材" + ((jianzhupai) shiyongka).getMutoushu() +
                            ",石材" + ((jianzhupai) shiyongka).getShitoushu() +
                            ",树脂" + ((jianzhupai) shiyongka).getShuzhishu() +
                            ",分数：" + shiyongka.getFenshu() +
                            ",效果：" + shiyongka.getXiaoguoyulan());
                } else if (shiyongka instanceof dongwupai) {
                    System.out.println("选中的卡牌为：" + shiyongka.getPaimian() +
                            ",类型：" + shiyongka.getLeixing() +
                            ",唯一动物：" + shiyongka.isWeiyi() +
                            ",消耗：浆果" + ((dongwupai) shiyongka).getJiangguoshu() +
                            ",分数：" + shiyongka.getFenshu() +
                            ",效果：" + shiyongka.getXiaoguoyulan());
                }
                //试图扣除资源

                //发动效果
            }else{
                System.out.println("输入手牌序号不对,请重新输入");
            }

        }
    }
    public static void fangzhigongren(player players){
        while (true) {
            System.out.println("请放置工人，森林地点，返回上一级请输入-1");
            int xingdongtype = Integer.parseInt(new Scanner(System.in).next());
            switch (xingdongtype){
                case 1://选择1

                    break;
                case 2://选择2

                    break;
                case 3://选择3

                    break;
                default:
                    System.out.println("输入行动序号不对,请重新输入");
                    break;
            }
        }
    }
    public static void guojijie(player players){
        players.addJijie();
        if(players.getJijie()==zongjijieshu){
            System.out.println("您已经结束游戏，下面开始分数结算……");
        }else{
            switch (players.getJijie()){
                case 2://入夏

            }
        }
    }
}
