package Kodlamaio.KodlaWithNlayeredApp.DataAccess;

import Kodlamaio.KodlaWithNlayeredApp.Entities.Category;
import Kodlamaio.KodlaWithNlayeredApp.Entities.Course;
import Kodlamaio.KodlaWithNlayeredApp.Entities.Instructor;

public class HibernateDao implements CourseDao, CategoryDao, InstructorDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile eklendi : " + category.getName());
    }

    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile eklendi : " + course.getName());
    }


    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile eklendi : " + instructor.getName());
    }
}
