package br.com.crud.javaclient;

import br.com.crud.model.Student;

/**
 * @author joao4018 25/03/2020.
 */
public class JavaSpringClientTest {
    public static void main(String[] args) {

        Student studentPost = new Student();
        studentPost.setName("John Wick 2");
        studentPost.setEmail("john@pencil.com");
//        studentPost.setId(29L);
        JavaClientDAO dao = new JavaClientDAO();
//        System.out.println(dao.findById(111));
//        List<Student> students = dao.listAll();
//        System.out.println(students);
//        System.out.println(dao.save(studentPost));
//        dao.update(studentPost);
        dao.delete(29);

    }

}
