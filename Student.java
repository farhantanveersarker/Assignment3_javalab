class Student {
  // Setting private fields for Name, PRN, GPA, Batch, Branch
  private String name;
  private long prn;
  private double gpa;
  private String batch;
  private String branch;

  // Create a Student class constructor
  public Student(String name, long prn, double gpa, String batch, String branch) {
    this.name = name;
    this.prn = prn;
    this.gpa = gpa;
    this.branch = branch;
    this.batch = batch;
  }

  // Add setter and getter method for name
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // Add setter and getter method for PRN
  public long getPrn() {
    return prn;
  }

  public void setPrn(long prn) {
    this.prn = prn;
  }

  // Add setter and getter method for GPA
  public double getGpa() {
    return gpa;
  }

  public void setGpa(double gpa) {
    this.gpa = gpa;
  }

  // Add setter and getter method for Batch
  public String getBatch() {
    return batch;
  }

  public void setBatch(String batch) {
    this.batch = batch;
  }

  // Add setter and getter method for Branch
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  // Add the Display method
  public void display() {
    System.out.println("The Name of Student is :  " + name);
    System.out.println("The Prn of Student is :  " + prn);
    System.out.println("The GPA of Student is :  " + gpa);
    System.out.println("The Batch of Student is :  " + batch);
    System.out.println("The Branch of Student is :  " + branch + "\n");
  }
}
