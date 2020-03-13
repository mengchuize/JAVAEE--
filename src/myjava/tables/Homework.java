package myjava.tables;

import java.sql.Date;



public class Homework {
    private String hname;
    private Date hbegintime;
    private Date hendtime;
    private String tname;
    private int hsubmitnum;

    public Homework(){

    }

    public Homework(String hname, Date hbegintime, Date hendtime, String tname, int hsubmitnum){
        this.hname=hname;
        this.hbegintime=hbegintime;
        this.hendtime=hendtime;
        this.tname=tname;
        this.hsubmitnum=hsubmitnum;
    }
    public String getHname() {
        return hname;
    }

    public Date getHbegintime() {
        return hbegintime;
    }

    public Date getHendtime() {
        return hendtime;
    }

    public String getTname() {
        return tname;
    }

    public int getHsubmitnum() {
        return hsubmitnum;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public void setHbegintime(Date hbegintime) {
        this.hbegintime = hbegintime;
    }

    public void setHendtime(Date hendtime) {
        this.hendtime = hendtime;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public void setHsubmitnum(int hsubmitnum) {
        this.hsubmitnum = hsubmitnum;
    }
}
