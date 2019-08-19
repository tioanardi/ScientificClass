import java.util.Scanner;
 class Main {

    public static void main(String[] args) {
    Activity s=new ScientificStudent("");
    Kelas k=new Kelas();
    Teacher t=new Teacher();
    Echonomic e=new Echonomic("");
    Mathematic m=new Mathematic("");
	
    String jawab;
    Scanner sc=new Scanner(System.in );
		
    String username="";
    String password="";
    System.out.print("Username =");
    username=sc.next();
    System.out.print("Password =");
    password=sc.next();
    System.out.println("");

				
    if(username.equals("tio")&&password.equals("tio123")) {
    int tes=0;
    for (int i=0;;i++){

    System.out.println("1. Scientific Studend");
    System.out.println("2. Social Student");
    System.out.println("");
    tes = sc.nextInt();
    sc.nextLine();
    System.out.println("============================");

    switch(tes){
    case 1:
    System.out.println("1. Tio");
    System.out.println("2. Rizky");
    System.out.println("3. Anardi");
    System.out.println("");
 
    break;
    case 2:
    System.out.println("4. Tiwi");
    System.out.println("5. Tika");
    System.out.println("6. Eka");
    System.out.println("");
    break;
     default:
}
    try {
    System.out.print("Masukan Nama:");
    jawab=sc.next();
    System.out.println("");
    if (jawab.equals("Tio")) {
    s.Tio();
    k.setKelas("5");
    t.setTeacher("Abidin");
    e.setEchonomic("90");
    m.setMathematic("88");
    System.out.println("Kelas : "+k.getKelas());
    System.out.println("Guru  : "+t.getTeacher());
    System.out.println("Nilai Ekonomi : "+e.getEchonomic());
    System.out.println("Nilai Matematika : "+m.getMathematic());
    System.out.println("");
}
    else if(jawab.equals("Rizky")) {
    s.Rizky();
    k.setKelas("5");
    t.setTeacher("Abdulah");
    e.setEchonomic("89");
    m.setMathematic("80");
    System.out.println("Kelas : "+k.getKelas());
    System.out.println("Guru  : "+t.getTeacher());
    System.out.println("Nilai Ekonomi : "+e.getEchonomic());
    System.out.println("Nilai Matematika : "+m.getMathematic());
    System.out.println("");
}
    else if(jawab.equals("Anardi")){
    s.Anardi();
    k.setKelas("5");
    t.setTeacher("Amelia");
    e.setEchonomic("80");
    m.setMathematic("99");
   System.out.println("Kelas : "+k.getKelas());
    System.out.println("Guru  : "+t.getTeacher());
    System.out.println("Nilai Ekonomi : "+e.getEchonomic());
    System.out.println("Nilai Matematika : "+m.getMathematic());
    System.out.println("");
}
    else if(jawab.equals("Tiwi")){
    s.Tiwi();
    k.setKelas("4");
    t.setTeacher("Arifin");
    e.setEchonomic("98");
    m.setMathematic("77");
    System.out.println("Kelas : "+k.getKelas());
    System.out.println("Guru  : "+t.getTeacher());
    System.out.println("Nilai Ekonomi : "+e.getEchonomic());
    System.out.println("Nilai Matematika : "+m.getMathematic());
    System.out.println("");
}
    else if(jawab.equals("Tika")){
    s.Tika();
    k.setKelas("4");
    t.setTeacher("Abidin");
    e.setEchonomic("99");
    m.setMathematic("89");
    System.out.println("Kelas : "+k.getKelas());
    System.out.println("Guru  : "+t.getTeacher());
    System.out.println("Nilai Ekonomi : "+e.getEchonomic());
    System.out.println("Nilai Matematika : "+m.getMathematic());
    System.out.println("");
}
    else if(jawab.equals("Eka")){
    s.Eka();
    k.setKelas("4");
    t.setTeacher("Abidin");
    e.setEchonomic("96");
    m.setMathematic("95");
    System.out.println("Kelas : "+k.getKelas());
    System.out.println("Guru  : "+t.getTeacher());
    System.out.println("Nilai Ekonomi : "+e.getEchonomic());
    System.out.println("Nilai Matematika : "+m.getMathematic());
    System.out.println("");
}
}catch(Exception e1){System.out.print("password salah");
}
}
}
}
}    

		