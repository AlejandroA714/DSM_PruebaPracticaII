package sv.com.udb.prueba.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@DatabaseTable(tableName = "colores")
public class Colores {

    @DatabaseField(id = true)
    private Integer id;

    @DatabaseField
    private String descripcion;

}