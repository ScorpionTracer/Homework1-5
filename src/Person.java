import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Person {
  private String fullName;
  private String position;
  private String email;
  private String telephone;
  private int salary;
  private int age;


  public void informationAboutPerson() {
    System.out.println("ФИО: " + fullName + "\nДолжность: " + position + "\nemail:" + email + "\nТелефон: " + telephone + "\nЗарплата: " + salary + "\nВозвраст: " + age);
  }

  public static void main(String[] args) {
    var personArray = new Person[5];
    personArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 70000, 30);
    personArray[1] = new Person("Petrov Petr", "Programmer", "pp@mailbox.com", "892352412", 100000, 42);
    personArray[2] = new Person("Sidorov Sidr", "Manager", "ss@mailbox.com", "899312152", 50000, 25);
    personArray[3] = new Person("Andreev Andrey", "Boss", "Aa@mailbox.com", "895312312", 10000000, 30);
    personArray[4] = new Person("Yaroslavov Yaroslav", "1c", "Yaya@mailbox.com", "89235232312", 10, 55);

    for (int i = 0; i < personArray.length; i++) {
      if (personArray[i].age > 40) {
        personArray[i].informationAboutPerson();
        System.out.print("\n");
      }
    }

    personArray[3].setFullName("Vadimov Vadim");
    System.out.println(personArray[3].getFullName());
  }
}

