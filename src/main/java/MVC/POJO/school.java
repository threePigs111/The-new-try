package MVC.POJO;

public class school {
    private String address;
    private String number;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "school{" +
                "address='" + address + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
