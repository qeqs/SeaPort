package model.entities;

import net.slashie.libjcsi.ConsoleSystemInterface;

import java.sql.Date;

/**
 * Created on 20.11.2016.
 */
public class DryEntity extends AbstractEntity {
    public DryEntity(String name, int weight, Date departure) {
        super(name, weight, departure);
        model = "<~~~>";
        color = ConsoleSystemInterface.YELLOW;
    }
}
