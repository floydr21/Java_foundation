import java.util.*;
 

class Patients{
  private int nextId=1;
  private int id;
  private String name;
  private int age;
  private long adharNumber;
  private long mobileNumber;
  private String city;
  private String address;
  private String dateOfAdmission;
  private String guardianName;
  private String guardianAddress;
  private long guardianNumber;
  private boolean status;
  public Patients(String name,int age,long adharNumber,long mobileNumber,String city,String address,String dateOfAdmission,String guardianName,String guardianAddress,long guardianNumber){
    this.id=nextId++;
    this.name=name;
    this.age=age;
    this.adharNumber=adharNumber;
    this.mobileNumber=mobileNumber;
    this.city=city;
    this.address=address;
    this.address=address;
    this.dateOfAdmission=dateOfAdmission;
    this.guardianName=guardianName;
    this.guardianAddress=guardianAddress;
    this.guardianNumber=guardianNumber;
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
  public long getAdharNumber(){
    return adharNumber;
  }
  public long getMobileNumber(){
    return mobileNumber;
  }
  public String getCity(){
    return city;
  }
  public String getAddress(){
    return address;
  }
  public String getDateOfAdmission(){
    return dateOfAdmission;
  }
  public String getGuardianName(){
    return guardianName;
  }
  public String getGuardianAddress(){
    return guardianAddress;
  }
  public long getGuardianNumber(){
    return guardianNumber;
  }
  public boolean getStatus(){
  return status;
  }
  public void setStatus(){
    this.status=true;
  }
}
class Hospital{
  HashMap<Integer,Patients>patients=new HashMap<Integer,Patients>();
  public void addPatient(Patients p){
    patients.put(p.getId(), p);
    System.out.println("Added New Patient Successfully");
  }
  public void allPatientsDetails(){
    boolean check=patients.isEmpty();
    if(check==false){
    Set keys=patients.keySet();
    for(Object obj:keys){
      Integer p1=(Integer)obj;
      Patients p=patients.get(p1);
      System.out.println();
      System.out.println("Patient Name: "+p.getName());
      System.out.println("Patient Age: "+p.getAge());
      System.out.println("Patient Adhar Number: "+p.getAdharNumber());
      System.out.println("Patient Mobile Number: "+p.getMobileNumber());
      System.out.println("Patient city: "+p.getCity());
      System.out.println("Patient Address: "+p.getAddress());
      System.out.println("Date of Admission: "+p.getDateOfAdmission());
      System.out.println("Guardian Name: "+p.getGuardianName());
      System.out.println("Guardian Address: "+p.getGuardianAddress());
      System.out.println("Guardian Mobile Number: "+p.getGuardianNumber());
      System.out.println("Status of the Patient: "+p.getStatus());
    }
    }
    else{
      System.out.println("Collection Empty");
    }
  }
  public void searchWithId(int id){
    Patients p=patients.get(id);
    if(p!=null){
      System.out.println();
      System.out.println("Patient Name: "+p.getName());
      System.out.println("Patient Age: "+p.getAge());
      System.out.println("Patient Adhar Number: "+p.getAdharNumber());
      System.out.println("Patient Mobile Number: "+p.getMobileNumber());
      System.out.println("Patient city: "+p.getCity());
      System.out.println("Patient Address: "+p.getAddress());
      System.out.println("Date of Admission: "+p.getDateOfAdmission());
      System.out.println("Guardian Name: "+p.getGuardianName());
      System.out.println("Guardian Address: "+p.getGuardianAddress());
      System.out.println("Guardian Mobile Number: "+p.getGuardianNumber());
      System.out.println("Status of the Patient: "+p.getStatus());
    }
    else{
      System.out.println("With this Id:"+id+" There is no Patient");
    }
  }
  public void searchWithName(String name){
    int c=0;
    for(Patients p:patients.values()){
      if(p.getName().equalsIgnoreCase(name)){
        System.out.println();
        System.out.println("Patient Name: "+p.getName());
        System.out.println("Patient Age: "+p.getAge());
        System.out.println("Patient Adhar Number: "+p.getAdharNumber());
        System.out.println("Patient Mobile Number: "+p.getMobileNumber());
        System.out.println("Patient city: "+p.getCity());
        System.out.println("Patient Address: "+p.getAddress());
        System.out.println("Date of Admission: "+p.getDateOfAdmission());
        System.out.println("Guardian Name: "+p.getGuardianName());
        System.out.println("Guardian Address: "+p.getGuardianAddress());
        System.out.println("Guardian Mobile Number: "+p.getGuardianNumber());
        System.out.println("Status of the Patient: "+p.getStatus());
        c++;
      }
    }
    if(c==0){
      System.out.println("Patient not found");
    }
  }
  public void filteringWithCity(String city){
    int c=0;
    for(Patients p:patients.values()){
      if(p.getCity().equalsIgnoreCase(city)){
        System.out.println();
        System.out.println("Patient Name: "+p.getName());
        System.out.println("Patient Age: "+p.getAge());
        System.out.println("Patient Adhar Number: "+p.getAdharNumber());
        System.out.println("Patient Mobile Number: "+p.getMobileNumber());
        System.out.println("Patient city: "+p.getCity());
        System.out.println("Patient Address: "+p.getAddress());
        System.out.println("Date of Admission: "+p.getDateOfAdmission());
        System.out.println("Guardian Name: "+p.getGuardianName());
        System.out.println("Guardian Address: "+p.getGuardianAddress());
        System.out.println("Guardian Mobile Number: "+p.getGuardianNumber());
        System.out.println("Status of the Patient: "+p.getStatus());
        c++;
      }
    }
    if(c==0){
      System.out.println("Patients not found");
    }
  }
  public void filteringWithAge(int minAge,int maxAge){
    int c=0;
    for(Patients p:patients.values()){
      if(p.getAge()>minAge&&p.getAge()<maxAge){
        System.out.println();
        System.out.println("Patient Name: "+p.getName());
        System.out.println("Patient Age: "+p.getAge());
        System.out.println("Patient Adhar Number: "+p.getAdharNumber());
        System.out.println("Patient Mobile Number: "+p.getMobileNumber());
        System.out.println("Patient city: "+p.getCity());
        System.out.println("Patient Address: "+p.getAddress());
        System.out.println("Date of Admission: "+p.getDateOfAdmission());
        System.out.println("Guardian Name: "+p.getGuardianName());
        System.out.println("Guardian Address: "+p.getGuardianAddress());
        System.out.println("Guardian Mobile Number: "+p.getGuardianNumber());
        System.out.println("Status of the Patient: "+p.getStatus());
        c++;
      }
    }
    if(c==0){
      System.out.println("Patients not found");
    }
  }
  public void dischargePatient(int id){
    Patients p=patients.get(id);
    if(p!=null){
        System.out.println();
        System.out.println("Patient Name: "+p.getName());
        System.out.println("Patient Age: "+p.getAge());
        System.out.println("Patient Adhar Number: "+p.getAdharNumber());
        System.out.println("Patient Mobile Number: "+p.getMobileNumber());
        System.out.println("Patient city: "+p.getCity());
        System.out.println("Patient Address: "+p.getAddress());
        System.out.println("Date of Admission: "+p.getDateOfAdmission());
        System.out.println("Guardian Name: "+p.getGuardianName());
        System.out.println("Guardian Address: "+p.getGuardianAddress());
        System.out.println("Guardian Mobile Number: "+p.getGuardianNumber());
        p.setStatus();
        System.out.println("Status of the Patient: "+p.getStatus());
    }
    else{
      System.out.println("Id Not found");
    }
  }
  public void deletePatient(int id){
    Patients p=patients.remove(id);
    if(p!=null){
        System.out.println();
        System.out.println("Patient Name: "+p.getName());
        System.out.println("Patient Age: "+p.getAge());
        System.out.println("Patient Adhar Number: "+p.getAdharNumber());
        System.out.println("Patient Mobile Number: "+p.getMobileNumber());
        System.out.println("Patient city: "+p.getCity());
        System.out.println("Patient Address: "+p.getAddress());
        System.out.println("Date of Admission: "+p.getDateOfAdmission());
        System.out.println("Guardian Name: "+p.getGuardianName());
        System.out.println("Guardian Address: "+p.getGuardianAddress());
        System.out.println("Guardian Mobile Number: "+p.getGuardianNumber());
        System.out.println("Status of the Patient: "+p.getStatus());
    }
    else{
      System.out.println("Id Not found");
    }
  }
}
public class ArogyaHospital{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int r=0;
    Hospital hospital=new Hospital();
    while(r==0){
      System.out.println();
      System.out.println("Welcome to Arogya ArogyaHospital");
    System.out.println("-----------------------------------------------------");
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

          String address=sc.nextLine();
          System.out.print("Date of Admission: ");
          
          String dateOfAdmission=sc.nextLine();
          System.out.print("Guardian Name: ");
          
          String guardianName=sc.nextLine();
          System.out.print("Guardian Address: ");
          
          String guardianAddress=sc.nextLine();
          System.out.print("Guardian Mobile Number: ");
          long guardianNumber=sc.nextLong();
          Patients p1=new Patients(name,age,adharNumber,mobileNumber,city,address,dateOfAdmission,guardianName,guardianAddress,guardianNumber);
          hospital.addPatient(p1);
          break;
        case 2:
          hospital.allPatientsDetails();
          break;
        case 3:
          System.out.print("Enter the Patient Id: ");
          int id=sc.nextInt();
          hospital.searchWithId(id);
          break;
        case 4:
          System.out.println("Enter the name of the Patient: ");
          sc.nextLine();
          String name1=sc.nextLine();
          hospital.searchWithName(name1);
          break;
        case 5:
          System.out.println("1.With city\n2.With Age\nSelect One Option");
          int choice2=sc.nextInt();
          switch(choice2){
            case 1:
              System.out.print("Enter the City Name: ");
              sc.nextLine();
              String city1=sc.nextLine();
              hospital.filteringWithCity(city1);
              break;
            case 2:
              System.out.print("Enter the Min Age: ");
              int minAge=sc.nextInt();
              System.out.println("Enter the Max Age: ");
              int maxAge=sc.nextInt();
              hospital.filteringWithAge(minAge,maxAge);
              break;
          }
          break;
        case 6:
          System.out.println("Entre the Patient Id to Discharge: ");
          int id1=sc.nextInt();
          hospital.dischargePatient(id1);
          break;
        case 7:
          System.out.println("Enter the Id Of The Patient to Delete: ");
          int id2=sc.nextInt();
          hospital.deletePatient(id2);
          break;
      }
    }
  }
}