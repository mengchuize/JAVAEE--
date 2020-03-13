package myjava.tables;

public class Teacher {
    private String tname;
    private String tusername;
    private String tpassword;

    public Teacher(){

    }
    public Teacher(String tname,String tusername,String tpassword){
        this.tname=tname;
        this.tusername=tusername;
        this.tpassword=tpassword;
    }

    public String getTname() {
        return tname;
    }

    public String getTpassword() {
        return tpassword;
    }

    public String getTusername() {
        return tusername;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public void setTpassword(String tpassword) {
        this.tpassword = tpassword;
    }

    public void setTusername(String tusername) {
        this.tusername = tusername;
    }
}
