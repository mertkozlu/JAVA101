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
        Category category2 = new Category("P");
        ArrayList<Category> categoryArrayList = new ArrayList<Category>();
        CategoryManager categoryManager = new CategoryManager(new JdbcDao(),loggers, categoryArrayList);
        categoryManager.add(category1);
        categoryManager.add(category2);

        Course course1 = new Course(1,"Java",80);
        Course course2 = new Course(2,"C#",80);
        ArrayList<Course> courseArrayList = new ArrayList<Course>();
        CourseManager courseManager = new CourseManager(new JdbcDao(),loggers, courseArrayList);
        courseManager.add(course1);
        courseManager.add(course2);

        Instructor instructor1 = new Instructor("Engin");
        Instructor instructor2 = new Instructor("Hakkı");
        ArrayList<Instructor> instructorArrayList = new ArrayList<Instructor>();
        InstructorManager instructorManager = new InstructorManager(new JdbcDao(), loggers, instructorArrayList);
        instructorManager.add(instructor1);
        instructorManager.add(instructor2);

    }
}
