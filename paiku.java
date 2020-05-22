import java.util.ArrayList;
import java.util.Collections;

public class paiku {

    public static ArrayList<String> xipai(ArrayList<String> qipaiqu){
        ArrayList<String> choupaiqu = new ArrayList<String>();
        if (qipaiqu.isEmpty()) {//弃牌区为空，初始化牌库
            ArrayList<dongwupai> dongwupaiku = new ArrayList<dongwupai>();
            dongwupaiku.add(new dongwupai("清洁工", 30));//测试数据
            dongwupaiku.add(new dongwupai("小丑", 30));
            dongwupaiku.add(new dongwupai("小贩", 20));
            ArrayList<jianzhupai> jianzhupaiku = new ArrayList<jianzhupai>();
            jianzhupaiku.add(new jianzhupai("树脂加工厂", 30));//测试数据
            jianzhupaiku.add(new jianzhupai("游乐场", 30));
            jianzhupaiku.add(new jianzhupai("废墟", 20));
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
        }else{//弃牌区不为空，将弃牌区移至牌库，清空弃牌区
            if(choupaiqu.isEmpty()==false){//抽牌区不为空，返回抽牌区
                return choupaiqu;
            }
            choupaiqu=qipaiqu;
        }
        //洗牌
        Collections.shuffle(choupaiqu);
        return choupaiqu;
    }
}
