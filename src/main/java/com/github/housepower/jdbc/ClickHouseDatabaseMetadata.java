package com.github.housepower.jdbc;

import com.github.housepower.jdbc.settings.ClickHouseDefines;
import com.github.housepower.jdbc.wrapper.SQLDatabaseMetadata;

public class ClickHouseDatabaseMetadata extends SQLDatabaseMetadata {
    @Override
    public String getDatabaseProductName() {
        return ClickHouseDefines.NAME;
    }
}
