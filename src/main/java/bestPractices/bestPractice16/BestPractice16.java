package bestPractices.bestPractice16;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Using PreparedStatement instead of Statement
 * While executing the SQL query through the application we use JDBC API and classes for the same.
 * PreparedStatement has an advantage over Statement for parameterized query execution since
 * the preparedstatement object is compiled once and executed multiple times.
 * Statement object on other hand is compiled and executed every time it is called. Also,
 * the prepared statement object is safe to avoid SQL injection attacks for Web designPatterns.behavior.strategy.Application security.
 */
public class BestPractice16 {
    public static final String PASSWORD = "postgres";
    private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/restservices";
    private static final String USER = "postgres";

    public List<Ingredient> getAll() {
        List<Ingredient> ingredientList = new ArrayList<>();
        try {
            /** Step 1 : Loading the database driver */
            Class.forName("org.postgresql.Driver");
            /** Step 2 : Make a connection with DB */
            Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
            /** Step 3 : Make a statement */
            String request = "SELECT * FROM INGREDIENT";
            PreparedStatement preparedStatement = connection.prepareStatement(request);
            /** Step 4 : Execute the request */
            ResultSet resultSet = preparedStatement.executeQuery();
            /** Step 5 : loop the rersulset */
            while (resultSet.next()) {
                Ingredient ingredient = new Ingredient();
                ingredient.setId(resultSet.getLong("id"));
                ingredient.setName(resultSet.getString("name"));
                ingredientList.add(ingredient);
            }
        } catch (ClassNotFoundException | SQLException exception) {
            exception.printStackTrace();
        }
        return ingredientList;
    }
}
