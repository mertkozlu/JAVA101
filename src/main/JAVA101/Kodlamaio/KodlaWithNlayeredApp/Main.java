package Kodlamaio.KodlaWithNlayeredApp;

import Kodlamaio.KodlaWithNlayeredApp.Business.CategoryManager;
import Kodlamaio.KodlaWithNlayeredApp.Business.CourseManager;
import Kodlamaio.KodlaWithNlayeredApp.Business.InstructorManager;
import Kodlamaio.KodlaWithNlayeredApp.DataAccess.JdbcDao;
import Kodlamaio.KodlaWithNlayeredApp.Entities.Category;
import Kodlamaio.KodlaWithNlayeredApp.Entities.Course;
import Kodlamaio.KodlaWithNlayeredApp.Entities.Instructor;
import Kodlamaio.KodlaWithNlayeredApp.Logging.DatabaseLogger;
import Kodlamaio.KodlaWithNlayeredApp.Logging.FileLogger;
import Kodlamaio.KodlaWithNlayeredApp.Logging.Logger;
import Kodlamaio.KodlaWithNlayeredApp.Logging.MailLogger;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        Category category1 = new Category("Programming");
        ArrayList<Category> categoryArrayList = new ArrayList<Category>();
        CategoryManager categoryManager = new CategoryManager(new JdbcDao(),loggers, categoryArrayList);
        categoryManager.add(category1);

        Course course = new Course(1,"Java",80);
        ArrayList<Course> courseArrayList = new ArrayList<Course>();
        CourseManager courseManager = new CourseManager(new JdbcDao(),loggers, courseArrayList);
        courseManager.add(course);

        Course course2 = new Course(2,"Java",80);
        CourseManager courseManager2 = new CourseManager(new JdbcDao(),loggers, courseArrayList);
        courseManager2.add(course2);


        Instructor instructor = new Instructor("Engin");
        ArrayList<Instructor> instructorArrayList = new ArrayList<Instructor>();
        InstructorManager instructorManager = new InstructorManager(new JdbcDao(), loggers, instructorArrayList);
        instructorManager.add(instructor);

        Instructor instructor2 = new Instructor("Hakkı");
        InstructorManager instructorManager2 = new InstructorManager(new JdbcDao(), loggers, instructorArrayList);
        instructorManager2.add(instructor2);






    }
}
