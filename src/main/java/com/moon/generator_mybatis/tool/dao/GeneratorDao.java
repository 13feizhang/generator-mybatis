package com.moon.generator_mybatis.tool.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.moon.generator_mybatis.tool.entity.Column;


/** 
* @author ZF 
* @date ：2020年5月26日 
* @version 1.0 
*/
@Repository
public class GeneratorDao extends AppBaseDao {

	public List<Column> queryForList(String schema) {
        String sql = "SELECT `table_catalog`, `table_schema`, `table_name`, `column_name`, `ordinal_position`, `column_default`, `is_nullable`, `data_type`, `character_maximum_length`, `character_octet_length`, `numeric_precision`, `numeric_scale`, `character_set_name`, `collation_name`, `column_type`, `column_key`, `extra`, `privileges`, `column_comment` FROM `information_schema`.`columns` WHERE `TABLE_SCHEMA` = ?";
        return queryForList(Column.class, sql, schema);
    }
}
