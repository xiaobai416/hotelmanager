package domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Checkins implements Serializable {
    private Integer cid;
    private String name ;
    private String  gender;
    private String  cardtype;
    private String cardno ;
    private Integer  roomid;
    private Integer  num;
    private Float  totalprice;
    private String  cstate;
    private Timestamp checkintime;
    private Timestamp  leavetime;
    private Double price;


    public Checkins() {
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Checkins(Integer cid, String name, String gender, String cardtype, String cardno, Integer roomid, Integer num, Float totalprice, String cstate, Timestamp checkintime, Timestamp leavetime,Double price)  {
        this.cid = cid;
        this.name = name;
        this.gender = gender;
        this.cardtype = cardtype;
        this.cardno = cardno;
        this.roomid = roomid;
        this.num = num;
        this.totalprice = totalprice;
        this.cstate = cstate;
        this.checkintime = checkintime;
        this.leavetime = leavetime;
        this.price=price;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public void setTotalprice(Float totalprice) {
        this.totalprice = totalprice;
    }

    public void setCstate(String cstate) {
        this.cstate = cstate;
    }

    public void setCheckintime(Timestamp checkintime) {
        this.checkintime = checkintime;
    }

    public void setLeavetime(Timestamp leavetime) {
        this.leavetime = leavetime;
    }

    public Integer getCid() {
        return cid;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getCardtype() {
        return cardtype;
    }

    public String getCardno() {
        return cardno;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public Integer getNum() {
        return num;
    }

    public Float getTotalprice() {
        return totalprice;
    }

    public String getCstate() {
        return cstate;
    }

    public Timestamp getCheckintime() {
        return checkintime;
    }

    public Timestamp getLeavetime() {
        return leavetime;
    }
}
