public class dongwupai {
    private String paimian;
    private int shuliang;
    private String leixing;
    private int jiangguoshu;
    private boolean isweiyi;
    private int fenshu;
    private String duiyinjianzhu;
    private String xiaoguo;

    public dongwupai() {

    }

    public dongwupai(String paimian) {
        this.paimian = paimian;
        this.shuliang = 1;
        this.leixing = "";
        this.jiangguoshu = 0;
        this.isweiyi = false;
        this.fenshu = 0;
        this.duiyinjianzhu = "";
        this.xiaoguo = "";
    }

    public dongwupai(String paimian, int shuliang) {
        this.paimian = paimian;
        this.shuliang = shuliang;
        this.leixing = "";
        this.jiangguoshu = 0;
        this.isweiyi = false;
        this.fenshu = 0;
        this.duiyinjianzhu = "";
        this.xiaoguo = "";
    }

    public dongwupai(String paimian, int shuliang, String leixing, int jiangguoshu, boolean isweiyi, int fenshu, String duiyinjianzhu, String xiaoguo) {
        this.paimian = paimian;
        this.shuliang = shuliang;
        this.leixing = leixing;
        this.jiangguoshu = jiangguoshu;
        this.isweiyi = isweiyi;
        this.fenshu = fenshu;
        this.duiyinjianzhu = duiyinjianzhu;
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

    public int getJiangguoshu() {
        return jiangguoshu;
    }

    public void setJiangguoshu(int jiangguoshu) {
        this.jiangguoshu = jiangguoshu;
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

    public String getDuiyinjianzhu() {
        return duiyinjianzhu;
    }

    public void setDuiyinjianzhu(String duiyinjianzhu) {
        this.duiyinjianzhu = duiyinjianzhu;
    }

    public String getXiaoguo() {
        return xiaoguo;
    }

    public void setXiaoguo(String xiaoguo) {
        this.xiaoguo = xiaoguo;
    }
}
