package ma.enset.tp_catalog.dao.implementation;

import ma.enset.tp_catalog.dao.CategoryRepository;
import ma.enset.tp_catalog.dao.connectiondb.SingletonConnectionDB;
import ma.enset.tp_catalog.entities.Category;
import ma.enset.tp_catalog.entities.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository {

    @Override
    public Category findById(Long id) {
        return null;
    }

    @Override
    public List<Category> findAll(){
        Connection connection = SingletonConnectionDB.getConnection();
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String sqlQuery = "SELECT * FROM CATEGORY";
        List<Category> categories = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(sqlQuery);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                categories.add(new Category(
                        resultSet.getLong("categoryId"),
                        resultSet.getString("name")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return categories;
    }

    @Override
    public Category save(Category object) {
        return null;
    }

    @Override
    public Category update(Category object) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
