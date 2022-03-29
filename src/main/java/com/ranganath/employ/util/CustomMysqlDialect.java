package com.ranganath.employ.util;

import org.hibernate.dialect.MySQLInnoDBDialect;

public class CustomMysqlDialect extends MySQLInnoDBDialect {

    public String getTableTypeString() {
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }

}
