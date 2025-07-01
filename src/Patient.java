public class Patient 
{
    private int id,age;
    private String name,gender,address,contact;

    public Patient(int id, int age, String name, String gender, String address, String contact) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.contact = contact;
    }

    public Patient() {
        this.id = 0;
        this.age = 0;
        this.name = "Null";
        this.gender = "Null";
        this.address = "Null";
        this.contact = "Null";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + ", address=" + address + ", contact=" + contact + '}';
    }

    String getID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
