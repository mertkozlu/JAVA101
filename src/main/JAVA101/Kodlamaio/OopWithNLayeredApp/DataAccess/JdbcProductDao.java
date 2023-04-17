package Kodlamaio.OopWithNLayeredApp.DataAccess;

import Kodlamaio.OopWithNLayeredApp.Entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product) {
        //sadece db erişim kodları buraya yazılır. (SQL)
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
