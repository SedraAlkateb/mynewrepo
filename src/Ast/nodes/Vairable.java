package Ast.nodes;

import java.util.List;

public class Vairable extends BodyController{
    private String varname;
    private String equ;
    //private String num;
    private List<String>nums;
    private String St;
    private String semicolon;
    private ARRV array;

    public String getVarname() {
        return varname;
    }

    public void setVarname(String varname) {
        this.varname = varname;
    }

    public String getEqu() {
        return equ;
    }

    public void setEqu(String equ) {
        this.equ = equ;
    }

//    public String getNum() {
//        return num;
//    }
//
//    public void setNum(String num) {
//        this.num = num;
//    }

    public String getSt() {
        return St;
    }

    public void setSt(String st) {
        St = st;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    public ARRV getArray() {
        return array;
    }

    public void setArray(ARRV array) {
        this.array = array;
    }

    public List<String> getNums() {
        return nums;
    }

    public void setNums(List<String> nums) {
        this.nums = nums;
    }
}
