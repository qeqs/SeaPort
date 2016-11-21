package model.entities;

import net.slashie.libjcsi.ConsoleSystemInterface;

import java.sql.Date;

/**
 * Created on 20.11.2016.
 */
public class ContainerEntity extends AbstractEntity {
    public ContainerEntity(String name, int weight, Date departure) {
        super(name, weight, departure);
        model = "<-#->";
        color = ConsoleSystemInterface.RED;
    }
}
