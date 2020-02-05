package domain;

public class Rooms {
    private  Integer roomid;
    private  String roomtype;
    private  Double price;
    private String state;

    public Rooms() {
    }

    public Rooms(Integer roomid, String roomtype, Double price, String state) {
        this.roomid = roomid;
        this.roomtype = roomtype;
        this.price = price;
        this.state = state;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public Double getPrice() {
        return price;
    }

    public String getState() {
        return state;
    }
}
