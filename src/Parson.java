public class Parson {
    private  String name, address;


    public Parson(String name,String address){
        this.name=name;
        this.address=address;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public   void setAddress(String address){
    this.address=address;
    }

    public String toString() {
        return "Parson{" +
                "Name=' " + this.name + '\'' +
                ", address=" + address + '}';

    }
}
