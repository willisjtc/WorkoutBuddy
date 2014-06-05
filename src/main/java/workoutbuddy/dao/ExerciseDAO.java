package workoutbuddy.dao;

import workoutbuddy.model.Exercise;
import workoutbuddy.util.Properties;

import java.sql.*;

/**
 * Created by jonathan on 6/2/14.
 */
public class ExerciseDAO {

    private String databaseUrl;
    private Connection con;

    public ExerciseDAO() {
        databaseUrl = "jdbc:derby:workoutbuddy;create=true";
        try {
            con = DriverManager.getConnection(databaseUrl);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insert(Exercise exercise) {
        try (PreparedStatement ps = con.prepareStatement(Properties.getProperty("insert.exercise"))) {
            int index = 1;
            ps.setString(index++, exercise.getName());
            ps.setInt(index++, exercise.getNumSets());
            ps.setString(index++, exercise.getReps());
            ps.setString(index++, exercise.getNotes());

            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
