package everdell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/*
public void addFirst(E e) :将指定元素插入此列表的开头。
public void addLast(E e) :将指定元素添加到此列表的结尾。
public E getFirst() :返回此列表的第一个元素。
public E getLast() :返回此列表的最后一个元素。
public E removeFirst() :移除并返回此列表的第一个元素。
public E removeLast() :移除并返回此列表的最后一个元素。
public boolean isEmpty() ：如果列表不包含元素，则返回true。
*/

public class everdell {
    static ArrayList<String> gonggongpaiqu;
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
        gonggongpaiqu = new ArrayList<String>();//8格,有序
        //创建弃牌区
        LinkedList<String> qipaiqu = new LinkedList<String>();
        /*堆
        public E pop() :从此列表所表示的堆栈处弹出一个元素。
        public void push(E e) :将元素推入此列表所表示的堆栈。
        */
        //洗牌
        LinkedList<String> choupaiqu=paiku.xipai(qipaiqu);
        /*队列
        public void addFirst(E e) :将指定元素插入此列表的开头。
        public void addLast(E e) :将指定元素添加到此列表的结尾。
        public E getFirst() :返回此列表的第一个元素。
        public E getLast() :返回此列表的最后一个元素。
        public E removeFirst() :移除并返回此列表的第一个元素。
        public E removeLast() :移除并返回此列表的最后一个元素。
        public boolean isEmpty() ：如果列表不包含元素，则返回true。
        */
        //System.out.println(choupaiqu);
        //发牌
        for(int i=1;i<=playernumber;i++){
            for(int j=0;j<players[i-1].getChushishoupaishu();j++){
                players[i-1].addShoupaiqu(choupaiqu.remove(0));
            }
            System.out.println("玩家"+i+"的手牌："+players[i-1].getShoupaiqu());//玩家牌
        }
        for(int j=0;j<8;j++){
            gonggongpaiqu.add(choupaiqu.remove(0));
        }
        System.out.println("公共牌库："+gonggongpaiqu);//中央公共牌，明牌
        int finishplayernum=0;
        while(finishplayernum==playernumber)//所有玩家结束游戏
        for(int i=1;i<=playernumber;i++) {
            if(!players[i-1].isFinishgame()) {//未结束游戏
                System.out.println("当前是玩家"+i+"的行动回合");
                paiku.wanjiaxingdong(players[i]);
            }
        }
        //System.out.println(qipaiqu);//弃牌，明牌显示最后一张
        //System.out.println(choupaiqu);//抽牌区
    }
}
