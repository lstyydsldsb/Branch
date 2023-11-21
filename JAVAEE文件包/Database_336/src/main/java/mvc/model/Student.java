package mvc.model;
public class Student {
    private String name;
    private String city;
    private String assest;


    public Student(String name, String city, String assest) {
        this.name=name;
        this.city=city;
        this.assest=assest;

    }

    /*public void Branch(String name, String city, double assest) { this.name=name;
        this.city=name; this.city=city;}*/
    public Student() {}
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getName() {return name; }
    public void setName(String name) { this.name = name; }
    public String getAssest() { return assest; }
    public void setAssest(String assest) { this.assest = assest; }
    @Override
    public String toString() { return " city:" + city + " name:" + name + "assest:" +
       assest ; }
    }

