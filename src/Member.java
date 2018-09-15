//3.     Create a class named Member with Name, age, Salary as its variable, write an other class named Member Variable that creates an instance of the Member class, initialises its member variables, and then displays the value of each member variable.
//
//        Output:
//        Members Name: Harry Potter
//        Members Age: 30
//        Members Salary: 2500.3
public class Member {
    public String name;
    public int age;
    public float salary;
}

class MemberVariable{

    void initDisplayVar(String initName,int initAge, float initSalary){
        Member testObj=new Member();
        testObj.name=initName;
        testObj.age=initAge;
        testObj.salary=initSalary;
        System.out.println("Members Name:\t"+testObj.name+"\nMember's Age:\t"+testObj.age
                                          +"\nMember's Salary:\t"+testObj.salary);
    }
}