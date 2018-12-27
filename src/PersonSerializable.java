import java.io.*;

/**
 * FileName: PersonSerializable
 * Author:   Lenovo
 * Date:     12/19/2018 11:13 AM
 * Description:
 * History:
 */
class ManSerializable implements Serializable {
    private String userName;
    private String password;

    public ManSerializable(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

class PersonSerializable implements Serializable {
    private ManSerializable manSerializable;
    private String userName;
    private int age;

    public PersonSerializable(ManSerializable manSerializable, String userName, int age) {
        this.manSerializable = manSerializable;
        this.userName = userName;
        this.age = age;
    }

    public ManSerializable getManSerializable() {
        return manSerializable;
    }

    public void setManSerializable(ManSerializable manSerializable) {
        this.manSerializable = manSerializable;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



    class MainTest {
        public static void main(String[] args) {
            ManSerializable man = new ManSerializable("huhx", "123456");
            PersonSerializable person = new PersonSerializable(man, "刘力", 21);
            writeSerializableObject();
            readSerializableObject();
        }

        // Serializable：把对象序列化
        public static void writeSerializableObject() {
            try {

                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("output.txt"));
                objectOutputStream.writeObject("string");
//                objectOutputStream.writeObject(person);
                objectOutputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Serializable：反序列化对象
        public static void readSerializableObject() {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("output.txt"));
                String string = (String) objectInputStream.readObject();
                PersonSerializable person = (PersonSerializable) objectInputStream.readObject();
                objectInputStream.close();
                System.out.println(string + ", age: " + person.getAge() + ", man username: " + person.getManSerializable().getUserName());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


