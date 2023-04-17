package Kodlamaio.OopWithNLayeredApp.Business;

import Kodlamaio.OopWithNLayeredApp.Core.Logging.Logger;
import Kodlamaio.OopWithNLayeredApp.DataAccess.HibernateProductDao;
import Kodlamaio.OopWithNLayeredApp.DataAccess.JdbcProductDao;
import Kodlamaio.OopWithNLayeredApp.DataAccess.ProductDao;
import Kodlamaio.OopWithNLayeredApp.Entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private  Logger [] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        //iş kuralları
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün Fiyatı 10'dan küçük olamaz !");
        }
        productDao.add(product);

        for (Logger logger : loggers) {
            logger.log(product.getName());
        }
    }
}
