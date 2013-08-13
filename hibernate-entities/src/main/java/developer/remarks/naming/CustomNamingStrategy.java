package developer.remarks.naming;

import org.hibernate.cfg.DefaultNamingStrategy;

public class CustomNamingStrategy extends DefaultNamingStrategy {

    @Override
    public String classToTableName(String className) {
        return "ct_" + className;
    }

    @Override
    public String tableName(String tableName) {
        return "tn_" + tableName;
    }
}
