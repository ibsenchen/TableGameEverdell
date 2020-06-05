package everdell;

public class jianzhupai extends kapai {
    private int mutoushu;
    private int shuzhishu;
    private int shitoushu;
    private dongwupai duiyindongwu;
    public void xiaoguo(){
        System.out.println("建筑牌效果");
    }

    public jianzhupai(String paimian) {
        super.setPaimian(paimian);
        super.setShuliang(1);
        super.setLeixing("");
        super.setWeiyi(false);
        super.setFenshu(0);
        super.setXiaoguoyulan("");
        this.mutoushu = 0;
        this.shuzhishu = 0;
        this.shitoushu = 0;
    }

    public jianzhupai(String paimian, int shuliang) {
        super.setPaimian(paimian);
        super.setShuliang(shuliang);
        super.setLeixing("");
        super.setWeiyi(false);
        super.setFenshu(0);
        super.setXiaoguoyulan("");
        this.mutoushu = 0;
        this.shuzhishu = 0;
        this.shitoushu = 0;
    }

    public jianzhupai(String paimian, int shuliang, String leixing, int mutoushu, int shuzhishu, int shitoushu, boolean weiyi, int fenshu, String xiaoguoyulan) {
        super.setPaimian(paimian);
        super.setShuliang(shuliang);
        super.setLeixing(leixing);
        super.setWeiyi(weiyi);
        super.setFenshu(fenshu);
        super.setXiaoguoyulan(xiaoguoyulan);
        this.mutoushu = mutoushu;
        this.shuzhishu = shuzhishu;
        this.shitoushu = shitoushu;
    }

    public int getMutoushu() {
        return mutoushu;
    }

    public void setMutoushu(int mutoushu) {
        this.mutoushu = mutoushu;
    }

    public int getShuzhishu() {
        return shuzhishu;
    }

    public void setShuzhishu(int shuzhishu) {
        this.shuzhishu = shuzhishu;
    }

    public int getShitoushu() {
        return shitoushu;
    }

    public void setShitoushu(int shitoushu) {
        this.shitoushu = shitoushu;
    }

    public dongwupai getDuiyindongwu() {
        return duiyindongwu;
    }

    public void setDuiyindongwu(dongwupai duiyindongwu) {
        this.duiyindongwu = duiyindongwu;
    }

    public void linkKapai(dongwupai pai) {
        this.setDuiyindongwu(pai);
        pai.setDuiyinjianzhu(this);
    }
}
