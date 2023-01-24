public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Ali KARA", "KMY", "555");
        Teacher t2 = new Teacher("Graham Bell", "FZK","000");
        Teacher t3 = new Teacher("Karahan","EMG","61");


        Course kimya = new Course("Kimya","101","KMY");
        Course fizik = new Course("Fizik","102","FZK");
        Course eng = new Course("English","103","ENG");

        kimya.addTeacher(t1);
        fizik.addTeacher(t2);
        eng.addTeacher(t3);
        kimya.printTeacherInfo();

         Student s1 = new Student("İnek Şaban","123","4",kimya,fizik,eng);
         s1.addBulkExamNote(100,200,50);
         s1.isPass();
    }


}