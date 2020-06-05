package everdell;

public class dongwupai extends kapai{
    private int jiangguoshu;
    private jianzhupai duiyinjianzhu;
    public void xiaoguo(){
        System.out.println("动物牌效果");
    }

    public dongwupai(String paimian) {
        super.setPaimian(paimian);
        super.setShuliang(1);
        super.setLeixing("");
        super.setWeiyi(false);
        super.setFenshu(0);
        super.setXiaoguoyulan("");
        this.jiangguoshu = 0;
    }

    public dongwupai(String paimian, int shuliang) {
        super.setPaimian(paimian);
        super.setShuliang(shuliang);
        super.setLeixing("");
        super.setWeiyi(false);
        super.setFenshu(0);
        super.setXiaoguoyulan("");
        this.jiangguoshu = 0;
    }

    public dongwupai(String paimian, int shuliang, String leixing, int jiangguoshu, boolean weiyi, int fenshu, String xiaoguoyulan) {
        super.setPaimian(paimian);
        super.setShuliang(shuliang);
        super.setLeixing(leixing);
        super.setWeiyi(weiyi);
        super.setFenshu(fenshu);
        super.setXiaoguoyulan(xiaoguoyulan);
        this.jiangguoshu = jiangguoshu;
    }

    public int getJiangguoshu() {
        return jiangguoshu;
    }

    public void setJiangguoshu(int jiangguoshu) {
        this.jiangguoshu = jiangguoshu;
    }

    public jianzhupai getDuiyinjianzhu() {
        return duiyinjianzhu;
    }

    public void setDuiyinjianzhu(jianzhupai duiyinjianzhu) {
        this.duiyinjianzhu = duiyinjianzhu;
    }

    public void linkKapai(jianzhupai pai) {
        this.setDuiyinjianzhu(pai);
        pai.setDuiyindongwu(this);
    }
}
