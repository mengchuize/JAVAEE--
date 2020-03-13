package myjava.tables;

public class Submit {
    private String hname;
    private String sname;
    private String shis;

    public Submit(){

    }
    public Submit(String hname,String sname,String shis){
        this.hname=hname;
        this.sname=sname;
        this.shis=shis;
    }
    public String getHname() {
        return hname;
    }

    public String getShis() {
        return shis;
    }

    public String getSname() {
        return sname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setShis(String shis) {
        this.shis = shis;
    }
}
