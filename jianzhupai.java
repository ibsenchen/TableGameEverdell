package everdell;

public class jianzhupai {
    private String paimian;
    private int shuliang;
    private String leixing;
    private int mutoushu;
    private int shuzhishu;
    private int shitoushu;
    private boolean isweiyi;
    private int fenshu;
    private String duiyindongwu;
    private String xiaoguo;

    public jianzhupai() {

    }

    public jianzhupai(String paimian) {
        this.paimian = paimian;
        this.shuliang = 1;
        this.leixing = "";
        this.mutoushu = 0;
        this.shuzhishu = 0;
        this.shitoushu = 0;
        this.isweiyi = false;
        this.fenshu = 0;
        this.duiyindongwu = "";
        this.xiaoguo = "";
    }

    public jianzhupai(String paimian, int shuliang) {
        this.paimian = paimian;
        this.shuliang = shuliang;
        this.leixing = "";
        this.mutoushu = 0;
        this.shuzhishu = 0;
        this.shitoushu = 0;
        this.isweiyi = false;
        this.fenshu = 0;
        this.duiyindongwu = "";
        this.xiaoguo = "";
    }

    public jianzhupai(String paimian, int shuliang, String leixing, int mutoushu, int shuzhishu, int shitoushu, boolean isweiyi, int fenshu, String duiyindongwu, String xiaoguo) {
        this.paimian = paimian;
        this.shuliang = shuliang;
        this.leixing = leixing;
        this.mutoushu = mutoushu;
        this.shuzhishu = shuzhishu;
        this.shitoushu = shitoushu;
        this.isweiyi = isweiyi;
        this.fenshu = fenshu;
        this.duiyindongwu = duiyindongwu;
        this.xiaoguo = xiaoguo;
    }

    public String getPaimian() {
        return paimian;
    }

    public void setPaimian(String paimian) {
        this.paimian = paimian;
    }

    public int getShuliang() {
        return shuliang;
    }

    public void setShuliang(int shuliang) {
        this.shuliang = shuliang;
    }

    public String getLeixing() {
        return leixing;
    }

    public void setLeixing(String leixing) {
        this.leixing = leixing;
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

    public boolean isIsweiyi() {
        return isweiyi;
    }

    public void setIsweiyi(boolean isweiyi) {
        this.isweiyi = isweiyi;
    }

    public int getFenshu() {
        return fenshu;
    }

    public void setFenshu(int fenshu) {
        this.fenshu = fenshu;
    }

    public String getDuiyindongwu() {
        return duiyindongwu;
    }

    public void setDuiyindongwu(String duiyindongwu) {
        this.duiyindongwu = duiyindongwu;
    }

    public String getXiaoguo() {
        return xiaoguo;
    }

    public void setXiaoguo(String xiaoguo) {
        this.xiaoguo = xiaoguo;
    }
}
