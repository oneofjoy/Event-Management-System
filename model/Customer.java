package model;

public class Customer extends User {

    private int point;

    public Customer(String username, String password ) {

        super(username, password,"CUSTOMER");

        this.point = 0;
    }

    public int getPoint() {
        return point;
    }

    public void addPoint(int point) {

        this.point += point;
    }
}