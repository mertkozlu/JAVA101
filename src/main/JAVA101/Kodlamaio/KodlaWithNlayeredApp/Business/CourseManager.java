package Kodlamaio.KodlaWithNlayeredApp.Business;

import Kodlamaio.KodlaWithNlayeredApp.DataAccess.CourseDao;
import Kodlamaio.KodlaWithNlayeredApp.Entities.Course;
import Kodlamaio.KodlaWithNlayeredApp.Logging.Logger;

import java.util.ArrayList;


public class CourseManager {
    private final CourseDao courseDao;
    private final Logger[] loggers;
    private ArrayList<Course> courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers, ArrayList<Course> courses)  {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }
    public void add(Course course) throws Exception {
        for (Course course1 : courses) {
            if(course.getName().equals(course1.getName())) {
                throw new Exception("Kurs zaten var !");
            } else if (course.getPrice() < 0) {
                throw new Exception("Kurs ücreti 0'dan küçük olamaz !");
            }else {
                courseDao.add(course);
            }
        }
        for (Logger logger : loggers) {
            logger.log(course.getName());
        }
    }


}
