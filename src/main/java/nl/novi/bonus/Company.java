package nl.novi.bonus;

public class Company {
  private String companyName;
  private Manager manager = new Manager();

  public Company(String companyName, Manager manager) {
    this.companyName = companyName;
    this.manager = manager;
  }

  public void printOutDetailsCompany() {
    System.out.println("The company name is " + companyName);
    System.out.println("The manager of this company is " + manager.getName() + " and he is " + manager.getAge() + " years old.");
  }

}
