package day61_exceptions_collections;

public class ElementaryStudent {
    private String name;
    private int age;

    public ElementaryStudent(String name, int age) {
        setName(name);
        setAge(age);
    }

    public ElementaryStudent(){

    }

    @Override
    public String toString() {
        return "ElementaryStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //when name is null first,
        if (name==null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
            this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<5 || age>12){
            throw new IllegalArgumentException("age cannot be <5 or >12");
        }
        this.age = age;
    }
}
