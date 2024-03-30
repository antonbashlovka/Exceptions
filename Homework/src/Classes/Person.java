package Classes;
public class Person {
    public String name;
    public String lastname;
    public String patronym;
    public String birthday;
    public String phone;
    public String sex;

    public Person(String name, String lastname, String patronym, String birthday, String phone, String sex) {
        this.name = name;
        this.lastname = lastname;
        this.patronym = patronym;
        this.birthday = birthday;
        this.phone = phone;
        this.sex = sex;
    }

    @Override
    public String toString() {

        return "<"+ this.name +"><" + this.lastname + ">" + "<"+ this.patronym +"><" + this.birthday + ">" + "<"+ this.phone +"><" + this.sex + ">";
    }
    
}
