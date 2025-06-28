package agrotech.fermerasistan.handler;

import agrotech.fermerasistan.enums.Gender;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GenderTypeHandler extends BaseTypeHandler<Gender> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Gender gender, JdbcType jdbcType) throws SQLException {
        ps.setString(i, gender.getValue()); // "male" və ya "female"
    }

    @Override
    public Gender getNullableResult(ResultSet rs, String columnName) throws SQLException {
        String value = rs.getString(columnName);
        return genderFromValue(value);
    }

    @Override
    public Gender getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        String value = rs.getString(columnIndex);
        return genderFromValue(value);
    }

    @Override
    public Gender getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        String value = cs.getString(columnIndex);
        return genderFromValue(value);
    }

    private Gender genderFromValue(String value) {
        for (Gender g : Gender.values()) {
            if (g.getValue().equalsIgnoreCase(value)) {
                return g;
            }
        }
        return null;
    }
}
