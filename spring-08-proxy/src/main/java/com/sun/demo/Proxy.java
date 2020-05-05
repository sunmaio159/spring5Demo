package com.sun.demo;

public class Proxy implements Rent{
    private Host host;

    public Proxy(){

    }
    public Proxy(Host host){
        this.host = host;
    }


    public void rent() {
        seeHost();
        host.rent();
        hetong();
        fare();
    }

    public void seeHost(){
        System.out.println("中介带你去看房");
    }
    public void hetong(){
        System.out.println("签租赁合同");
    }
    public void fare(){
        System.out.println("收中介费");
    }
}
