package MainPackage;

public class Main {
    public static void main(String[] args) {

        Instructor instructor1 = new Instructor(1,"Engin Demiroğ","Üniversite hayatıma ÖSS 2003 Türkiye derecesiyle başladım. " +
                "Sırasıyla Başkent ve ODTÜ'de Yönetim Bilişim Sistemleri (Lisans-Burslu) ve Tıp Bilişimi(Yüksek Lisans) okudum." +
                " Profesyonel iş hayatıma ise henüz üniversite birinci sınıftayken başladım.");
        Instructor instructor2= new Instructor(2,"Mustafa murat coşkun","Odtü Bilgisayar Mühendisliğinden 2017 yılında mezun oldum ve şu anda da Odtü Bilgisayar Mühendisliğinde Veri Madenciliği ve Makine Öğrenmesi alanında Master çalışmalarımı sürdürüyorum.");
        Course kurs1 = new Course(1,"C#",instructor1);
        Course kurs2 = new Course(2,"Java",instructor2);

        Instructor[] instructors = {instructor1,instructor2};
        Course[] courses = {kurs1,kurs2};
        for(Instructor instructor : instructors){
            System.out.println(instructor.name);
            System.out.println(instructor.info);
        }
        for (Course c:courses) {
            System.out.println(c.name);
        }
    }
}
