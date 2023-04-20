package Kodlamaio.KodlaWithNlayeredApp.Business;

import Kodlamaio.KodlaWithNlayeredApp.DataAccess.InstructorDao;
import Kodlamaio.KodlaWithNlayeredApp.Entities.Instructor;
import Kodlamaio.KodlaWithNlayeredApp.Logging.Logger;

import java.util.ArrayList;


public class InstructorManager  {
    private final InstructorDao instructorDao;
    private final Logger[] loggers;
    private ArrayList<Instructor> instructors;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers, ArrayList<Instructor> instructors) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
        this.instructors = instructors;
    }

    public void add(Instructor instructor) throws Exception {
        for (Instructor instructor1: instructors) {
            if (instructor1.getName().equals(instructor.getName())) {
                throw new Exception("Eğitmen zaten var !");
            }
        }
        instructorDao.add(instructor);
        for(Logger logger : loggers) {
            logger.log(instructor.getName());

        }

    }
}


