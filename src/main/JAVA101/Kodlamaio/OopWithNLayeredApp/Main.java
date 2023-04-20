package Kodlamaio.OopWithNLayeredApp;

import Kodlamaio.OopWithNLayeredApp.Business.ProductManager;
import Kodlamaio.OopWithNLayeredApp.Core.Logging.DatabaseLogger;
import Kodlamaio.OopWithNLayeredApp.Core.Logging.FileLogger;
import Kodlamaio.OopWithNLayeredApp.Core.Logging.Logger;
import Kodlamaio.OopWithNLayeredApp.Core.Logging.MailLogger;
import Kodlamaio.OopWithNLayeredApp.DataAccess.HibernateProductDao;
import Kodlamaio.OopWithNLayeredApp.DataAccess.JdbcProductDao;
import Kodlamaio.OopWithNLayeredApp.Entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Iphone XR",10000);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
        productManager.add(product1);

    }
}
