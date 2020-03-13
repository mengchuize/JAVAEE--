package myjava.tables;

public class Student {
    private String sname;
    private String susername;
    private String spassword;

    public Student(){

    }
    public Student(String sname,String susername,String spassword){
        this.sname=sname;
        this.susername=susername;
        this.spassword=spassword;
    }

    public String getSname() {
        return sname;
    }

    public String getSpassword() {
        return spassword;
    }

    public String getSusername() {
        return susername;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    public void setSusername(String susername) {
        this.susername = susername;
    }
}
