package Kodlamaio.KodlaWithNlayeredApp.Business;

import Kodlamaio.KodlaWithNlayeredApp.DataAccess.CategoryDao;
import Kodlamaio.KodlaWithNlayeredApp.Entities.Category;
import Kodlamaio.KodlaWithNlayeredApp.Logging.Logger;

import java.util.ArrayList;


public class CategoryManager {
    private final CategoryDao categoryDao;
    private final Logger[] loggers;
    private ArrayList<Category> categories;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers, ArrayList<Category> categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    public void add(Category category) throws Exception {
        for (Category category1 : categories) {
            if (category.getName().equals(category1.getName())) {
                throw new Exception("Kategori zaten var !");
            }
        }
        categoryDao.add(category);
        categories.add(category);

        for (Logger logger : loggers) {
            logger.log(category.getName());
        }
    }


}
