package com.ff.javaopp.Day06.Exercise;

public class Train extends Transportation{

    private String rail="铁轨";

    @Override
    public void start() {
        System.out.println("火车:咔呲咔呲咔呲咔呲");
        System.out.println(rail);
    }

    @Override
    public void turnTo() {
        System.out.println("火车向右转");
    }

    @Override
    public void close() {
        System.out.println("火车关闭引擎");
    }

    public void subWay(){
        System.out.println("和谐号申请出战");
    }
}
