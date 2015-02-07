package lux.physics;

import lux.util.Vector;
import java.util.Arrays;

public class Force extends Vector {

    Object[] dependencies;


    public Force(Object... dependencies) {
        super();
        this.dependencies = new Object[dependencies.length];
        System.arraycopy(dependencies, 0, this.dependencies, 0, dependencies.length);
    }

    public boolean depends(Object[] obj) {
        for(Object dependency : dependencies)
            if(obj == dependency)
                return true;
        return false;
    }
}
