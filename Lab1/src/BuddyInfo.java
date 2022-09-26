public class BuddyInfo {

    private String name;
    private String address;
    private int phoneNumber;

    public BuddyInfo(String name, String address, int phoneNumber) {

        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
       BuddyInfo buddy = new BuddyInfo("Monish", "N/A", 1);
        System.out.println("Hello " + buddy.getName());
    }

}
