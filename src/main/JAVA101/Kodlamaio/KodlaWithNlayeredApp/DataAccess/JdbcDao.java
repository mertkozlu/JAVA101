package Kodlamaio.KodlaWithNlayeredApp.DataAccess;

import Kodlamaio.KodlaWithNlayeredApp.Entities.Category;
import Kodlamaio.KodlaWithNlayeredApp.Entities.Course;
import Kodlamaio.KodlaWithNlayeredApp.Entities.Instructor;

public class JdbcDao implements CourseDao, CategoryDao, InstructorDao {
    @Override
    public void add(Category category) {
        System.out.println("Jdbc ile veritabanına eklendi : " + category.getName());
    }

    @Override
    public void add(Course course) {
        System.out.println("Jdbc ile veritabanına eklendi : " + course.getName());
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println("Jdbc ile veritabanına eklendi : " + instructor.getName());
    }
}
