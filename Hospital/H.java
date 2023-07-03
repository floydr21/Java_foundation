import java.util.*;
class Patient{
  private static int nextID;
  private String name;
  private int age;
  private long adhar_no;
  private long contact_no;
  private String gender;
  private int id;
  private String city;
  private String address;
  private String date_of_join;
  private String gd_name;
  private String gd_address;
  private long gd_no;
  private boolean recovered;

  public Patient(String name,int age,long adhar_no,long contact_no,String gender,String city,String address,String date_of_join,String gd_name,String gd_address,Long gd_no){
    this.id=nextID++;
    this.name=name;
    this.age=age;
    this.adhar_no=adhar_no;
    this.contact_no=contact_no;
    this.gender=gender;
    this.city=city;
    this.address=address;
    this.date_of_join=date_of_join;
    this.gd_name=gd_name;
    this.gd_address=gd_address;
    this.gd_no=gd_no;
    this.recovered=false;
  }
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public long getAdharNo(){
    return adhar_no;
  }
  public String getGender(){
    return gender;
  }
  public String getCity(){
    return city;
  }
  public String getAddress(){
    return address;
  }
  public String getDateofJoin(){
    return date_of_join;
  }
  public String getGuardians_name(){
    return gd_name;
  }
  public String getGuardiansAddress(){
    return gd_address;
  }
  public long getGuardiansNo(){
    return gd_no;
  }
}
class Hospital{
  private HashMap<Integer,Patient>patients;
  public Hospital(){
    patients=new HashMap<>();
  }
  public void addPatient(Patient pa){
    patients.put(pa.getId(),pa);
    System.out.println("Patient added successfully");
  }
}
public class ArogyaHospital{
  public static void main(String[] args){
    //Patient p=new Patient();
    Hospital hospital=new Hospital();
    HashMap<Integer,Patient>h = new HashMap<Integer,Patient>();
    System.out.println("Welcome to Arogya ArogyaHospital");
    System.out.println("-----------------------------------------------------");
    //(String name,int age,String adhar_no,String contact_no,String gender,String city,String address,String date_of_join,String gd_name,String gd_address,String gd_no)
    Scanner sc=new Scanner(System.in);
   // Patient patient1=new Patient("Tejas",21,"101023456","9882654325","male","Mangalore","Beeri Street","21-6-2023","Ramesh","Kankanady","897255244");
    System.out.println("1.Add New Patient\n2.List of Patients\n3.Search Patient With Unique ID\n4.Search Patient With name\n5.Filtering Patients\n6.Discharge Patient\n7.Delete Patient\nSelect One Option");
      int choice=sc.nextInt();
      switch(choice){
        case 1:
          System.out.print("Patient Name: ");
          sc.nextLine();
          String name=sc.nextLine();
          System.out.print("Patient Age: ");
          int age=sc.nextInt();
          System.out.print("Patient Adhar Number: ");
          long adharNumber=sc.nextLong();
          System.out.print("Patient Mobile Number: ");
          long mobileNumber=sc.nextLong();
          System.out.print("Patient city: ");
          sc.nextLine();
          String city=sc.nextLine();
          System.out.print("Patient Address: ");
          //sc.nextLine();
          String address=sc.nextLine();
          System.out.print("Date of Admission: ");
          //sc.nextLine();
          String dateOfAdmission=sc.nextLine();
          System.out.print("Guardian Name: ");
          //sc.nextLine();
          String guardianName=sc.nextLine();
          System.out.print("Guardian Address: ");
          //sc.nextLine();
          String guardianAddress=sc.nextLine();
          System.out.print("Guardian Mobile Number: ");
          long guardianNumber=sc.nextLong();
          //(String name,int age,long adhar_no,long contact_no,String gender,String city,String address,String date_of_join,String gd_name,String gd_address,Long gd_no)
          Patient patient1=new Patient();
    hospital.addPatient(patient1);
  }
}