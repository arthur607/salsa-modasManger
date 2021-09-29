package com.project.salsaModasManager.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DefaultDAO<T> {

    T mapper(ResultSet resultSet) throws SQLException;
}